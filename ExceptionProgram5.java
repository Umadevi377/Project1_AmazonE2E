package Package2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionProgram5 
{

	public static void main(String[] args)  
	{
		try
		{
		Scanner s1 =new Scanner(System.in);
		int age [] = new int[s1.nextInt()];
		age[0]=21;
		age[1]=56;
		age[2]=78;
		s1.close();
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception 1 handled here");
		}
		catch(NegativeArraySizeException  d)
		{
			System.out.println("Exception 2 handled here");
			
		
				
		}
		catch (InputMismatchException i)
		{
			System.out.println("exception 3 handled here");
		}
		
		finally
		{
			System.out.println("finally block");
			
		}

	}
	
	
	}
