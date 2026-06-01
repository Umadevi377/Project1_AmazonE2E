package module1.basic;

public class SwitchBlock {

	public static void main(String[] args) 
	{
		char c ='M';
		switch('M')//case selection 
		{
			case 'M': System.out.println("launching chrome browser");
					  System.out.println(c);
			          break;
			
			case 'N':
					 System.out.println("launching firefox browser");
					 break;
			
			default://default selection 
					System.out.println("wrong selection");
		
		}
		

	}

}
