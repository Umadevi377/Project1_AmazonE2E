package module1.basic;
public class MethodOverloading 
{
	static void add(int a, int b)//static method :int, int parameters
	 	{
	      int c = a+b;
	  	  System.out.println(c);
		}
    static void add(int a, double b)//static method:int, double 
       {
	    double c = a+b;
	    System.out.println(c);
       }
 
    void add(double a, double b) //non static method
       {
	   double c = a+b;
	    System.out.println(c);
       }
	public static void main(String[] args)
	{
		add(4,61);
		add(4,67.89);
		MethodOverloading m1 = new MethodOverloading();
		m1.add(34.56,56.09);
      	}

}
