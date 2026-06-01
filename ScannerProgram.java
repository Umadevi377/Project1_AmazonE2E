package module1.basic;

import java.util.Scanner;

public class ScannerProgram 
{
	public static void main(String[] args)
	{
		
     Scanner s1 = new Scanner(System.in);
     System.out.println("enter the value of a");
     double a= s1.nextDouble();
     double  c = 4*a; //circumference of  square using Scanner class
     System.out.println(c);
     
     System.out.println("enter the value of l");
     System.out.println("enter the value of b");
     double l = s1.nextDouble();
     double b = s1.nextDouble();
     double c1 = 2*(l*b); //Circumference of rectangle  using Scanner class
     System.out.println(c1);
     
     s1.close();
	}

}
