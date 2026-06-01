package Package2;

public class AmazonProgram 

{
	AmazonProgram(int a)
	{
		this("Uma");//calls another parameterized constructor String argument :same class
		System.out.println("int value passed");
	}
	
	AmazonProgram(double b)
	{
		this(100);//calling int parameterized Constructor: same class
		System.out.println("double value passed");
	}
	
	AmazonProgram(String name)
	{
		
		System.out.println("string value passed");
	}

	public static void main(String[] args)
	
	{
		//new AmazonProgram(679);
		new AmazonProgram(65.788);

	}

	
	
}

