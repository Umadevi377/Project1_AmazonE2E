package Package2;
class MethodOverriding

{
	void login()
	{
		System.out.println("login using email id");// this parent class method get overridden 
		
	}
	
}

public class MethodOverridingChild extends MethodOverriding
{
   void login()
	 {
		 
		 System.out.println("login using phone number");//this method get called by object
		
	 }
	 
public static void main(String[] args) 

	{
	
	MethodOverridingChild c1 = new MethodOverridingChild();
	c1.login(); // c1 object  calling child class method 
	
	}
}
