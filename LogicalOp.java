package module1.basic;

public class LogicalOp {

	public static void main(String[] args)
	
	{
		
		int age = 21;
		char gender ='M';
		
		if (age>= 18 && gender =='M' )// both conditions must be true 
		
			{
			   System.out.println("person eligible for racing");
			}
		
		if(age >= 18 || gender =='F')// either one condition can be true

			{
				System.out.println("2nd person also eligible for racing");
			}
		
		else
		{
			System.out.println("else block");
		}
	}

}
