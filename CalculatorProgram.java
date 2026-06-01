package Package2;

import java.util.Scanner;

public class CalculatorProgram {

	public static void main(String[] args) 
	
	{
		
		Scanner s1 = new Scanner(System.in);
		for (int i=1;i<=10;i++) 
			
		{
		System.out.println("enter first and second number");
		int num1 = s1.nextInt();
		int num2 =s1.nextInt();
		int sum = num1+num2;
		System.out.println("addition value of num1 and num2 is" +sum);
		}
		
		s1.close();
		
	}

  }
