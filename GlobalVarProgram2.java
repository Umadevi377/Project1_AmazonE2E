package module1.basic;

public class GlobalVarProgram2 
{
   int Noofdays = 365; //Global variable: Non static global variable intialized
   static int noofMonths = 12; //static Global Variable initialized
   
    static void method1()
   {
    	noofMonths = 24;//updating static variable directly
	   System.out.println(noofMonths);
   }
   static void method2()
   {
	   noofMonths = 48;  //updating static variable directly
	   System.out.println(noofMonths);
   }
   
   public static void main(String[] args) 
	{
		
		noofMonths = 60;              // Global variable can be updated only inside any method.
		System.out.println(noofMonths);
		GlobalVarProgram2 g1 = new GlobalVarProgram2();
		System.out.println(g1.Noofdays); //non static variable called by object.variable name
		method1();
		method2(); //static method call
		}

}
