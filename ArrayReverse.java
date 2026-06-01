package Package2;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args)
	{
		int  array1 [] = new int [5];
		array1[0]=01;
		array1[1]=02;
		array1[2]=03;
		array1[3]=04;
		array1[4]=05;
		int array2 [] =new int[array1.length];
		
		for (int i=0,j=array1.length-1;i<array1.length;i++,j--)
		{
			
			array2[j]= array1[i];
		}
	
		System.out.println("Input array is ----");
		System.out.println(Arrays.toString(array1));
		System.out.println("Output array is ----");
		System.out.println(Arrays.toString(array2));
		
	}
	
	

}
