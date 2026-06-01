package Package2;
public class ExceptionProgram4 
{

	public static void main(String[] args)  
	{
		try
		{
			
	   int c = 1/0;//its gives infinity 
	   
	   System.out.println(c);
	
		}
		
		catch(Exception e)
		{
			System.out.println(true);
			
		}
		
		System.out.println("Uma");
	}

}
