package neej;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Hello from main!");
		
		Cpu cpu = new Cpu();

		System.out.println(cpu);
		Bus.helloWorld();
	}
}
