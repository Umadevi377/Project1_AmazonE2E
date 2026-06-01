package Package2;

import java.util.Arrays;

//WAP to check string is Anagram or not
public class StringProgram6 {

	public static void main(String[] args)
	{
	 String s1 = "dad";
	 String s2 = "mom";
	 
	 if(s1.length()!= s2.length())
	 {
		 
		 System.out.println("strings are not in Anagram");
		 
	 }
	 else
	 {
		 
		char c1[]= s1.toCharArray();//converts the String into char Array
		char c2[] = s2.toCharArray();
		
		System.out.println(Arrays.toString(c1));//represenation of Array
		System.out.println(Arrays.toString(c2));
		
		Arrays.sort(c1);//sort the array
		Arrays.sort(c2);
		
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		
		if (Arrays.equals(c1, c2))//compare the array equals or not 
		{
			System.out.println("two strings are anagram");
		
		}
			else
			{
				System.out.println("two strings are not anagram");
				
			}
			
		}
		
		
		
	 }
		
		 
	 }
	
	

