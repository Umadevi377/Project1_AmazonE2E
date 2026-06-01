package Package2;
public class ExceptionProgram {

	public static void main(String[] args)  
	{
	   try
	   {
		   
	   	int array [] = new int[3];
		array[0]=45;
		array[1]=67;
		array[2]=90;
		array[3]=90;
	
	   }
	   catch(Exception e)
	   {
		   
		   System.out.println("exception handled here");
	   }
		
		
		
	}

}
