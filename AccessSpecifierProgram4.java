package Package2;
public class AccessSpecifierProgram4 
{
	public static void add()//only public method can be accesses in this case
	{
		System.out.println("add");
	}
	
	protected static void sub()
	{
		System.out.println("sub");
	}
	 static void mul()
	{
		 System.out.println("multiply");
	}
	 
	private void div()
	{
		System.out.println("division");
	}

	
}
