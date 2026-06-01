package module1.basic;

public class ArithmaticOp
{
    static void add()
    {
    	int a = 100;
    	int b = 200;
    	int c = a + b ;
    	System.out.println(c);
    	
    }
    
    static void Sub()
    {
    	int a = 100;
    	int b = 200;
    	int c = b - a ;
    	System.out.println(c);
    	
    }
    static void mul()
    {
    	int a =10;
    	int b = 34;
    	int c =a*b;
    	System.out.println(c);
    }
    
    
    static void div()
    {
    	int a =45;
    	int b = 3;
    	int c = a/b;
    	System.out.println(c);
    	
    }
    static void Mod()
    {
    	int a = 10;
    	int b = 201;
    	int c = b % a ;
    	System.out.println(c);
    	
    }
	
	public static void main(String[] args) 
	{
	
		add();
		Sub();
		mul();
		div();
        Mod();
	}
	//modulos operator:
	//% 200%10 :reminder is 0 show it prints 0

}
