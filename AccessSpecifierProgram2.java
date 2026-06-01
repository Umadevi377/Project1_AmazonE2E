package Package2;
//access specifier access within the package but different classes
//class 2
public class AccessSpecifierProgram2 
{
	
	public static void main(String[] args) 
	{
		
		AccessSpecifierProgram3.mul();//static default method.
		AccessSpecifierProgram3.sub();//static protected method
		//AccessSpecifierProgram3.div();//private method cant be accessed 
		AccessSpecifierProgram3 a1 = new AccessSpecifierProgram3();
		a1.add();//non static public method.
	}

}
