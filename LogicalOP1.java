package module1.basic;

public class LogicalOP1 {

	public static void main(String[] args)
	
	{
		
		int age = 21;
		char gender ='M';
		
		if (!(age>= 18 && gender =='M' ))//NAND:reverse the output  
		
			{
			   System.out.println("person eligible for racing");
			}
		
		if(!(age >= 18 || gender =='F'))//NOR:Reverse the output

			{
				System.out.println("2nd person also eligible for racing");
			}
		
		else
		{
			System.out.println("else block");
		}
	}

}
