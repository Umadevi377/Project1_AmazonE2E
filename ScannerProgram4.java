package module1.basic;

import java.util.Scanner;

public class ScannerProgram4 
{
	public static void main(String[] args)
	{
		
     Scanner s1 = new Scanner(System.in);
     System.out.println("enter the value of a");
     double a= s1.nextDouble();
     double  area = a*a ; //area of square using Scanner class
     System.out.println(area);
     
     System.out.println("enter the value of l");
     System.out.println("enter the value of b");
     double l = s1.nextDouble();
     double b = s1.nextDouble();
     double area1 = l*b; //area of rectangle  using Scanner class
     System.out.println(area1);
     
     s1.close();
	}

}
