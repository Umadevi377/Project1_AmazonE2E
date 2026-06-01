package Package2;
import java.util.Scanner;
public class ExceptionProgram3 
{
	public static void main(String[] args)  
	{
		try
		{
		Scanner s1 =new Scanner(System.in);
		int age [] = new int[s1.nextInt()];//creating array to get user input as array size
		age[0]=21;
		age[1]=56;
		age[2]=78;
		s1.close();
		}
		
		catch(ArrayIndexOutOfBoundsException e)//exception handle in catch block
		{
			System.out.println("Exception :ArrayIndexoutofbound Exception  handled here");
		}
		catch(NegativeArraySizeException  d)//Multiple catches possible
		{
			System.out.println("Exception 2:negative Array Size Exception handled here");
		}
			
		
	}
	
	
	}
