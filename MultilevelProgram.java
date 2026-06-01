package Package2;
class A //super parent class
{
  static void login()
  {
	  System.out.println("application login");
  }

}
class B extends A // parent class
{
	static void logout()
	{
	System.out.println("application logout");
	}
}

public class MultilevelProgram extends B// sub class having main method
//multilevel inheritance
{

	public static void main(String[] args) 
	
	{
		login();
		logout();

	}

}
