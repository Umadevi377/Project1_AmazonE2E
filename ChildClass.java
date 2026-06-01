package Package2;

class Parent //super class
{
	static void login()
	{
		System.out.println("able to login to app");
	}
	static void logout()
	{
		System.out.println("able to logout to app");
	}
	
	void browse()
	{
		System.out.println("Browser access");
	}
	void checkout()
	{
		System.out.println("checkout the product");
	}
 }


public class ChildClass extends Parent //subclass have main method
{
    //static ,non static
	//Global variables
	void pay() //non static method of subclass
	{
		System.out.println("payment done");
	}
	public static void main(String[] args) 
	{
		login(); //static method call
		logout();
		ChildClass c1 = new ChildClass();// creating object for child class
		c1.browse();
		c1.checkout();
		c1.pay();
		
		

	}

}
