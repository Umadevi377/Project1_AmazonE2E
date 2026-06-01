package Package2;

//WAP to count no of alphabets, special character ,spaces,numeric  in the string

public class StringProgram7 
{
    
	static int noofAlphabets =0;
	static int noofSpaces =0;
	static int noofDigits=0;
	static int noofSpecialCharacters =0;
	public static void main(String[] args)
	 {
	 	
		String input ="U  ma 1236 __Testing";
		//count :increment operator:++
		
		char c1[]= input.toCharArray();
		for (int i= 0;i<c1.length;i++)
		{
			boolean b1=	Character.isAlphabetic(c1[i]);// Character class have static methods
		
				if(b1 == true)
				{
					noofAlphabets++;
					
				}
				
				boolean b2=	Character.isWhitespace(c1[i]);
				
				if(b2 == true)
				{
					noofSpaces++;
					
				}
				
			boolean b3=	Character.isDigit(c1[i]);
				
				if(b3 == true)
				{
					noofDigits++;
					
				}
					
	noofSpecialCharacters	=input.length()-(noofAlphabets+noofSpaces+noofDigits); 
		}
		System.out.println("No of Alphabets in the given String is " + noofAlphabets);
		System.out.println("No of spaces in the given string "  + noofSpaces);
		System.out.println("No of numeric in the given string " + noofDigits);
		System.out.println("No of SpecialCharacters in the given string " + noofSpecialCharacters);
		
		
	 
		
	 }
}
	
	

