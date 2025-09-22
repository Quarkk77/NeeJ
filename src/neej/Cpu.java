package neej;

public class Cpu
{
	private int programCounter = 0xFFFC;
	private int accumulator = 0x0000;

	public String toString() {
		return "Program Counter: " + programCounter + " Accumulator: " + accumulator;
	}
}
