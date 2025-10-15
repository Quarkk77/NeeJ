package neej;

import java.nio.file.*;

public class Main
{
	public static void sleep()
	{
		long cycleTime = 1_000_000_000L / 1_789_773L; // nanoseconds per cycle
		long nextCycle = System.nanoTime();

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
				Thread.currentThread().interrupt(); // restore interrupt status
				break; // exit loop if interrupted
			}
		}
	}

	public static void main(String[] args) throws Exception
	{
		if (args.length == 0)
		{
			System.out.println("Usage: neej <romfile>");
			return;
		}

		System.out.println("Hello from main!");
		
		String path = args[0];
        	byte[] romBytes= Files.readAllBytes(Paths.get(path));
		
		int[] romDataInt = NeeJUtils.byteArrayToUIntArray(romBytes);

		Cartridge romData = new Cartridge(romDataInt);

		// Create system components
		Memory memory = new Memory();
		Bus bus = new Bus(memory, romDataInt);
		Cpu cpu = new Cpu(bus);
		
		// Show system components are ready
		System.out.println(cpu);
		System.out.println(bus);

		// Set CPU speeds to ~1.79MHz to match NES clock speed
		long cycleTime = 1_000_000_000L / 1_789_773L; // nanoseconds per cycle
		long nextCycle = System.nanoTime();

		// Wait until next emu cycle - time is negligible on modern CPUs
		while (true) {
			cpu.tick();
			
			sleep();
		}
	}
}
