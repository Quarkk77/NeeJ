package neej;

public class Memory
{
	private int[] ram = new int[0x0800];
	
	// Create registers
	private int[] ppu = new int[0x0008];
	private int[] apu = new int[0x0020];

	public int read(int index)
	{
		return ram[index];   // Copy the address val at index and send back
	}

	public void write(int index, int val)
	{
		val &= 0xFF;   // Make sure val isn't over 255 (8-bit overflow)

		ram[index] = val;   // Write memory address at index
	}
}
