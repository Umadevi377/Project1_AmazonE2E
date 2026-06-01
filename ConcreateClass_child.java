package Package2;

abstract class  AbstractClass //abstract class
{
	abstract void method();// abstract class can have only non static method to be overridden for sure 
	{
		
		
	}
	
}
public class ConcreateClass_child extends AbstractClass
{
	void method()//abstract method overridden
	{
		
		System.out.println("Real logic applied here");
	}

	public static void main(String[] args) 
	{
		
		ConcreateClass_child c1 = new ConcreateClass_child();
		c1.method();
	}


		}


