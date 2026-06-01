package module1.basic;

public class Program3
{
	
	public static void main(String[] args) {
		
		
		System.out.println("main");//static method to static main can call with method name
		Add();
		Add();
		Sub();

	}
	static void Add()
	{
		System.out.println("Addition");//action
		Sub();
	}


	static void Sub()
	{
		System.out.println("Substraction");
		
	}
}
