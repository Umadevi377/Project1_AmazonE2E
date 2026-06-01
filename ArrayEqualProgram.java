package Package2;
public class ArrayEqualProgram {

	public static void main(String[] args)
	{
		int  array1 [] = new int [5];
		array1[0]=45;
		array1[1]=25;
		array1[2]=65;
		array1[3]=15;
		array1[4]=95;
		int array2 [] =new int[array1.length];
		array2[0] =89;
		array2[1] =25;
		array2[2]=65;
		array2[3]=15;
		array2[4]=95;
		boolean b = array1.equals(array2);
		if(b==true)
		{
			System.out.println("Both arrays are equal");
			
		}
		
		else
		{
			System.out.println("Both arrays are not  equal");
		}
		 
	}

}
