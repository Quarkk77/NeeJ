package neej;

public class Bus
{
	private Memory memory;
	private int[] cartridge;

	public Bus(Memory memory, int[] cartridge)
	{
		this.memory = memory;
		this.cartridge = cartridge;
	}

	public int read(int index)
	{
		index &= 0xFFFF;   // Simulate 16-bit overflow w bitmasking
		
		if (index < 0x0800)
		{
			return memory.read(index);
		}
		else if (index < 0x2000)
		{
			return memory.read(index & 0x07FF);
		}
		else
		{
			return 0x00;
		}
	}

	public String toString()
	{
		return "Hello from NES bus!";
	}
}
