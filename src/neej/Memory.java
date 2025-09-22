package neej;

public class Memory
{
	private int[] ram = new int[0x0800];

	public int read(int index, int[] ram)
	{
		return ram[index];
	}
}
