package module1.basic;

public class IfElseTest 

{

	public static void main(String[] args)
	{
		int age = 25;
		if (age >= 18)
		//if(false)
		{
			System.out.println("Person can vote");/* dead code */
			
		}
		if (age == 25)
		{
			System.out.println("person can vote again");// multiple if possible to add in java 
		}
		
		if (age <= 18)
		{
			System.out.println("person can vote this line can print");// multiple if possible to add in java
		}

		else
		{
			
			System.out.println("person cannot vote");
		
		}
	}

}
