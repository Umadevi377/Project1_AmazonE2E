package module1.basic;
public class NonStaticmethod
{
	static void add()//static method
	{
		System.out.println("addition");
	}
	
	void sub()//non static method
	{
		System.out.println("subtraction");
	}
	void mul()
	{
		System.out.println("multiplication");
	}
	public static void main(String[] args)
	
	{
		NonStaticmethod s = new NonStaticmethod();//object creation for calling non static method with help of ref.variable
		s.sub(); //ref.variable.nonstaticmethod();
		add();//methodname();
		s.mul();//one object can be used for calling multiple non static methods
		s.mul();
	}
}
