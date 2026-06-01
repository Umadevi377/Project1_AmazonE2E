package module1.basic;

public class MathProgram {

	public static void main(String[] args) 
	{
		
    double val =  Math.random();//static method:return double value
    System.out.println(val);
    
    System.out.println(Math.addExact(5,8)); //addExact(int x, int y):returns int value
    System.out.println(Math.addExact(576879,677889));// addExact(long x, long y)returns long value
    
    System.out.println(Math.subtractExact(34, 12));//subtractExact(int x, int y):returns int value
    System.out.println(Math.subtractExact(34567,12348));//substractExact(long x, long y):returns long value
    
    System.out.println(Math.multiplyExact(4, 13));//multiplyExact(int x, int y):returns int value
    System.out.println(Math.multiplyExact(7, 67897));//multiplyExact(int x, long y);returns long value
    System.out.println(Math.multiplyExact(23457, 67897));//multiplyExact(long x, long y);returns long value 
    
   System.out.println(Math.min(78.4545,88.4555));//returns min double value
   System.out.println(Math.min(7,6));//returns min int value
   System.out.println(Math.min(7878,6765));//returns min long value
   System.out.println(Math.min(78.4,56.7));//returns  min float  value
    
   System.out.println(Math.max(78.4545,88.4555));//returns max double value
   System.out.println(Math.max(7,6));//returns max int value
   System.out.println(Math.max(7878,6765));//returns max long value
   System.out.println(Math.max(78.4,56.7));//returns max float  value
   
   System.out.println(Math.abs(-4567));//abs method returns negative value to positive
   System.out.println(Math.sqrt(10));
  double value = Math.PI;
  System.out.println(value);
    
	}

}
