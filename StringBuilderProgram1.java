package Package2;

public class StringBuilderProgram1 {
	public static void main(String[] args) 
	{
		StringBuilder s1 = new StringBuilder("Automation");
		s1.reverse();//reverse method 
		System.out.println("Reversal of String:   " +s1);
		
		StringBuilder s2 = new StringBuilder("Automation ");
		s2.append("testing");//append string at last
		System.out.println("appending String as   " +s2);
		
		StringBuilder s3 = new StringBuilder("API ");
		s3.insert(4,"testing");//insert the new string
		System.out.println("inserted String as   " +s3);
		
		StringBuilder s4 = new StringBuilder("Automation ");
		s4.replace(0,10,"Uma");//replaces the new string with the old string
		System.out.println("replaces String as   " +s4);
		
		StringBuilder s5 = new StringBuilder("Batch60 Testing ");
		s5.delete(0,7);//delete method
		System.out.println("after deletion:    " +s5);
		
		StringBuilder s6 = new StringBuilder("Batch60 Testing ");
		String s7=s6.substring(8,11);//substring method
		System.out.println("Substring as    " +s7);
		
		
	}

}
