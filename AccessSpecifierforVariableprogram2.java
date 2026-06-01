package Package2;
//Access specifier for variables
public class AccessSpecifierforVariableprogram2 
{
    
	public static void main(String[] args) 
	{
		System.out.println(AccessSpecifierforVariableprogram1.a);
		System.out.println(AccessSpecifierforVariableprogram1.b);
		AccessSpecifierforVariableprogram1 a1 = new AccessSpecifierforVariableprogram1();
		System.out.println(a1.c);
		//System.out.println(a1.d);private variable cant be accessed in this case

	}

}
