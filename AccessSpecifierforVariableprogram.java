package Package2;
//Access specifier for variables
public class AccessSpecifierforVariableprogram 
{
    public static int a =100;
    static int b = 20;
    protected double  c = 34.67;
    private int d = 56098;
    
	public static void main(String[] args) 
	{
		System.out.println(a);
		System.out.println(b);
		AccessSpecifierforVariableprogram a1 = new AccessSpecifierforVariableprogram();
		System.out.println(a1.c);
		System.out.println(a1.d);

	}

}
