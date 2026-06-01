package Package2;
import java.util.Arrays;
//array value at run time 
import java.util.Scanner;
public class StringProgram5 {

	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("please enter size of the Array");
		int rollno [] = new int[s1.nextInt()];
				
		for (int i=0;i<=rollno.length-1;i++)
		{
			System.out.println("please enter the value of index position->" +i);
		  rollno[i]= s1.nextInt();
		 
		}
		System.out.println(Arrays.toString(rollno));
		s1.close();
	
	}

}
