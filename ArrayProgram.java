package Package2;

public class ArrayProgram {

	public static void main(String[] args)
	{
		double input [] = new double [5];
		double sum =0;
		input[0]=45;
		input[1]=25;
		input[2]=65;
		input[3]=15;
		input[4]=95;
		
		for (int i= 0;i<input.length;i++)
		{
			
			sum = sum + input[i];
			
		}
         double avg = sum/input.length;
         System.out.println("Avg value of Array is " +avg);
         
         
	}

}
