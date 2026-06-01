package Package2;
import java.util.Arrays;
public class ArrayProgramMaxMin {

	public static void main(String[] args)
	{
		int input [] = new int [5];
		input[0]=45;
		input[1]=35;
		input[2]=65;
		input[3]=15;
		input[4]=95;
		System.out.println(Arrays.toString(input));//Representation of Array
		int min = input[0];//assume
		int max = input[4];//assume
		
		for (int i =0;i<input.length;i++)
		{
			if(input[i]>max) 
			{
				max = input[i];
				
			}
		   
			if(input[i]<min) 
			{
				min = input[i];
				
			}
		}
		   System.out.println("Maximum value of the array is " +max);
			System.out.println("Minumum value of the Array " +min);
			
					
		}
		
		
        
	}


