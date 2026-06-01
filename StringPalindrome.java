package Package2;

public class StringPalindrome {

	public static void main(String[] args) 
	{
		String input ="AMMA";
		String output ="";
		
		for (int i =input.length()-1;i>=0;i--)
		{
		
			char c1 =input.charAt(i);
			output = output+c1;//concating the char value
			
		}
		System.out.println("Input is --> " +input);
		System.out.println("output is --> " +output);
		
		if (input .equals(output))
		{
			System.out.println("given string is palindrome");
		
		}
			else
			{
				System.out.println("given string is not palindrome");
				
		    }
		
	}

}
