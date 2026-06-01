package Package2;

public class MutableProgram2 {

	public static void main(String[] args)
	{
				
		StringBuffer s1 = new StringBuffer("Manual");
		s1.reverse();//reverse method 
		System.out.println("Reversal of String:   " +s1);
		
		StringBuffer s2 = new StringBuffer("Uma ");
		s2.append("devi");//append string at last
		System.out.println("appending String as   " +s2);
		
		StringBuffer s3 = new StringBuffer("API ");
		s3.insert(4,"testing");//insert the new string
		System.out.println("inserted String as   " +s3);
		
		StringBuffer s4 = new StringBuffer("Automation batch ");
		s4.replace(0,10,"Uma");//replaces the new string with the old string
		System.out.println("replaces String as   " +s4);
		
		StringBuffer s5 = new StringBuffer("Batch60 Testing ");
		s5.delete(0,7);//delete method
		System.out.println("after deletion:    " +s5);
		
		StringBuffer s6 = new StringBuffer("Batch60 Testing ");
		String s7=s6.substring(7);//substring method
		System.out.println("Substring as    " +s7);
		
		String s ="uma";
		s.concat("devi");
		System.out.println(s);
		
		
	}

}
