package Package2;
interface A1
{
	void Login();// abstract method . default its public method 
	
}// expose to the world so other companies can use this apis

public abstract class InterfaceProgram2 implements A1 

{

	public static void main(String[] args) 
	{
		
		
	}

	@Override
	public void Login() 
	{
		System.out.println("real logic applied here");
		
	}

		
	

}
