package module1.basic;

public class Constructor 
{
		
	Constructor()//constuctor :default access specifier and non static modifier:same as classname.Non Parametrized
	{
		System.out.println("Constructor 1 calling");
	}

	Constructor(int a, double b)// Parametrized
	{
		System.out.println("Constructor 2 calling");
	}


	public static void main(String[] args)
	
	{
		
		Constructor c1 = new Constructor();// Object creation:
		new Constructor();//2nd way to object creation
		Constructor c2 = new Constructor(6,8.56);
		
	}

}
