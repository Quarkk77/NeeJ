package neej;

public class Cpu
{
	private int programCounter = 0xFFFC;
	private int stackPointer = 0x00;
	private int statusRegister = 0x00;
	private int accumulator = 0x00;
	private int x = 0x00;
	private int y = 0x00;
	
	private Bus bus;

	public Cpu(Bus bus)
	{
		this.bus = bus;
	}

	public String toString() 
	{
		String pCounterFormatted = Integer.toHexString(programCounter).toUpperCase();
		String accumulatorFormatted = Integer.toHexString(accumulator).toUpperCase();

		return "Program Counter: $" + pCounterFormatted + " Accumulator: $" + accumulatorFormatted;
	}

	public void tick()
	{
		;
	}
}
