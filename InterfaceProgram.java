package Package2;
interface GoogleAuth
{
	void Login();// default abstract method . default its public method 
	
}// expose to the world so other companies can use this apis

public class InterfaceProgram implements GoogleAuth

{

	public static void main(String[] args) 
	{
		
		InterfaceProgram i = new InterfaceProgram();
		i.Login();

	}

	@Override
	public void Login() 
	{
		System.out.println("real logic applied here");
		
	}

}
