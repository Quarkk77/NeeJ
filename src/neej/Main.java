package neej;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Hello from main!");
		
		Memory memory = new Memory();
		Bus bus = new Bus(memory);
		Cpu cpu = new Cpu(bus);
				
		System.out.println(cpu);
		System.out.println(bus);
	}
}
