package Package2;
import java.util.Scanner;
public class ArrayProgram3 {

	public static void main(String[] args)
	{
		Scanner s1 =new Scanner (System.in);
		System.out.println("Enter size of an Array");
		int size=s1.nextInt();
		int a[]= new int[size];
		System.out.println("Enter "  +  size +  " elements of Array");
		for (int i=0;i<size;i++)	
		{
			a[i]= s1.nextInt();
		}
		int length=a.length;
		for (int i=0;i<length;i++)
		{
			for (int j=i+1;j<length;j++)
			{
				if (a[i]==a[j])
						{
					    for (int k =j;k<length-1;k++)
					    {
					    	a[k]=a[k+1];
					    	
					    }
					    length--;
					    j--;
						}
						
			}
		}
		
		System.out.println("after removing duplicate elements from array:");
		
		{
			for (int i=0;i<length;i++)
			{
				System.out.print(a[i] + " ");
			}
			
		}
		
	
			
	
	}

}
