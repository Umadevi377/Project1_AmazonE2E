package Package2;
//access specifier access within the class
public class AccessSpecifierProgram 
{
	public void add()
	{
		System.out.println("addition");
	}
	protected static void sub()
	{
		System.out.println("Substraction");
	}
	 static void mul()
	{
		 System.out.println("multiplication");
	}
	private  void div()
	{
		System.out.println("division");
	}

	public static void main(String[] args) 
	{
		AccessSpecifierProgram a1 = new AccessSpecifierProgram();
			a1.add();
			sub();
			mul();
			a1.div();
	}

}
