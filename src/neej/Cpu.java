package neej;

public class Cpu
{
	private int programCounter = 0xFFFC;
	private int accumulator = 0x0000;
	
	private Bus bus;

	public Cpu(Bus bus)
	{
		this.bus = bus;
	}

	public String toString() {
		String pCounterFormatted = Integer.toHexString(programCounter).toUpperCase();
		String accumulatorFormatted = Integer.toHexString(accumulator).toUpperCase();

		return "Program Counter: $" + pCounterFormatted + " Accumulator: $" + accumulatorFormatted;
	}
}
