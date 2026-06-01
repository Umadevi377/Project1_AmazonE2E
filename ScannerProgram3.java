package module1.basic;
import java.util.Scanner;
public class ScannerProgram3 
{
	public static void main(String[] args)
	{
		
     Scanner s1 = new Scanner(System.in);
     System.out.println("enter the value of r");
     double r = s1.nextDouble();
     double  area = 2*Math.PI *r; //circumference of circle using Scanner class
     System.out.println(area);
     
     System.out.println("enter the value of a");
     System.out.println("enter the value of b");
     System.out.println("enter the value of c");
     double a = s1.nextDouble();
     double b = s1.nextDouble();
     double c = s1.nextDouble();
     double c4 = a+b+c; //Circumference of triangle using Scanner class
     System.out.println(c4);
     
     s1.close();
	}

}
