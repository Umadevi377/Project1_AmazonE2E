package module1.basic;

import java.util.Scanner;

public class ScannerProgram2 {

	public static void main(String[] args)
	{
		
     Scanner s1 = new Scanner(System.in);
     int a = s1.nextInt();
     int b = s1.nextInt();
     System.out.println(a+b);//addition using Scanner class
     System.out.println(a-b);//substraction using Scanner class
     System.out.println(a*b);//multiply
     System.out.println(a/b);//divide
     System.out.println(a%b);//mod
     s1.close();
	}

}
