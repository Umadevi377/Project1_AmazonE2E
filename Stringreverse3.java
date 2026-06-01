package Package2;

public class Stringreverse3 {

	public static void main(String[] args) 
	{
		String input ="Automation";
		String output ="";
		
		for (int i =input.length()-1;i>=0;i--)
		{
		
			char c1 =input.charAt(i);
			output = output+c1;//concating the char value
			
		}
		
		System.out.println(output);
	}

}
