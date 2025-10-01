package neej;

public class Bus
{
	private Memory memory;

	public Bus(Memory memory)
	{
		this.memory = memory;
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
