package module1.basic;

public class NestedIfElse {

	public static void main(String[] args) 
	
	{
		int age = 18;		
		if(age >= 18)//parent block
		{	
		            if(age == 18)//child if block
		  
		            {
		            	System.out.println("Person can vote");
		            }
		            
		            else //child else block 
		            {
		             
		            	System.out.println("person cannot vote");
		            }
		}          
		else//parent else block
		{
			System.out.println("Parent Else block ");
		}
	}
	}


