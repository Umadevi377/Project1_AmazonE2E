package Package2;
interface A22
{
	void Login();// abstract method . default its public method 
	
}// expose to the world so other companies can use this apis
interface B22 extends A22//interface to interface using extends keyword
{
		void get();
}
public class InterfaceProgram3 implements B22

{
	public static void main(String[] args) 
	
	{
		InterfaceProgram3 i3 = new InterfaceProgram3();
		i3.Login();
		i3.get();
		
	}

		public void Login() 
	{
		System.out.println("login logic applied here");
		
	}
    	public void get() {
		System.out.println("get method logic applied here");
		
	}

}