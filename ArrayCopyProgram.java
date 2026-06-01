package Package2;
import java.util.Arrays;

public class ArrayCopyProgram {

	public static void main(String[] args)
	{
		int  array1 [] = new int [5];
		array1[0]=45;
		array1[1]=25;
		array1[2]=65;
		array1[3]=15;
		array1[4]=65;
		
		int array2 [] =new int[array1.length];
		for (int i= 0;i<array1.length;i++)
		{
			
			array2[i] =array1[i];
			
		}
        
         System.out.println("Innput array is ------ ");
         System.out.println(Arrays.toString(array1));
         
         System.out.println("Output array is------- ");
         System.out.println(Arrays.toString(array2));
        
	}

}
