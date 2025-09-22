package neej;

public class Memory
{
	private int[] ram = new int[0x0800];
	
	// Create registers
	private int[] ppu = new int[0x0008];
	private int[] apu = new int[0x0020];

	public int read(int index, int[] ram)
	{
		return ram[index];
	}
}
