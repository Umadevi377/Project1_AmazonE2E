package Package2;
import java.util.Arrays;
public class ArrayProgramAssignment61 
{
   static int CountofValue =0;
	public static void main(String[] args)
	{
		int input [] = new int [6];
		input[0]=1;
		input[1]=2;
		input[2]=5;
		input[3]=40;
		input[4]=90;
		input[5]=5;
		System.out.println(Arrays.toString(input));//Representation of Array
		
		int Numtocheck =5;
		
		for (int i=0;i<input.length;i++)
		{
			
			if(input[i]==Numtocheck)
			{
				System.out.println("Yes : the given value 5 is present in the array at the index position  "  + i);
				CountofValue++;
			}	
					
		}
		
		System.out.println("Count of value repeated these many times is" + CountofValue);
			
	}
						
	}
		
		
  



