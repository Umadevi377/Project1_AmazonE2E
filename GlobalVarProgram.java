package module1.basic;

public class GlobalVarProgram 
{
   int Noofdays = 365; //Global variable: Non static global variable -- instance variable
   static int noofMonths = 12; //Global Variable
   static boolean answer;
    static void method1()
   {
    	noofMonths = 54;
	   System.out.println(noofMonths);
   }
   static void method2()
   {
	   noofMonths =12;
	   System.out.println(noofMonths);
   }
   
   public static void main(String[] args) 
	{
		int mininute = 60; //local variable
		System.out.println(mininute);
		char c = 'M';//local variable
		System.out.println(c);
		noofMonths = 24;              // Global variable can be updated only inside any method.
		System.out.println(noofMonths);
		System.out.println(answer);//default value print 
		GlobalVarProgram g1 = new GlobalVarProgram();
		System.out.println(g1.Noofdays); //non static variable called by object.variable name
		method1();
		method2(); //static method call
		

	}

}
