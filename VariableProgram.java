package module1.basic;
public class VariableProgram 
{
	static void add()
	{
		int a = 100;  //local variable :scope within the method
		int b = 100; //local variable :no default value
		int c = a+b;//local variable
		System.out.println(c);
	}
	
	public static void main(String[] args)
	
	{
		int age =23; //local variable //declaration and intilaization
		int id;//declaration
		id = 2; //Initialization
		double salary = 25000; //local variable
		System.out.println(age);
		System.out.println(salary);
		System.out.println(id); //utilization
		double PI = 3.14;
		System.out.println(PI);
		add();//static method call
		
		}
}
