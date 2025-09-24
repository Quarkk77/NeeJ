package neej;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Hello from main!");
		
		// Create system components
		Memory memory = new Memory();
		Bus bus = new Bus(memory);
		Cpu cpu = new Cpu(bus);
		
		// Show system components are ready
		System.out.println(cpu);
		System.out.println(bus);

		// Set CPU speeds to ~1.79MHz to match NES clock speed
		long cycleTime = 1_000_000_000L / 1_789_773L; // nanoseconds per cycle
		long nextCycle = System.nanoTime();

		// Wait until next emu cycle - time is negligible on modern CPUs
		while (true) {
			cpu.executeCycle();
    
			nextCycle += cycleTime;
			long sleepTime = nextCycle - System.nanoTime();
			if (sleepTime > 0) 
			{
				try 
				{
					Thread.sleep(sleepTime / 1_000_000, (int)(sleepTime % 1_000_000));
				} 
				
				catch (InterruptedException e) 
				{
					Thread.currentThread().interrupt(); // Restore interrupt status
					break; // Exit loop if interrupted
				}
			}
		}
	}
}
