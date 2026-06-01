package Package2;

public class MutableProgram {

	public static void main(String[] args)
	{
		String a= "Umadevi";//immutable 
		String b = a.concat("testing");
		
		System.out.println(a);
		System.out.println(b);
		
		
		StringBuffer s1 = new StringBuffer("Manual");//mutable
		s1.append("testing");
		System.out.println(s1);
		
		StringBuilder s2 = new StringBuilder("API");//mutable
		s2.append("testing");
		System.out.println(s2);
		
		StringBuffer s3 = new StringBuffer("Batch60");//constructor
		System.out.println(s3.reverse());

		StringBuffer s4 = new StringBuffer();//constructor//initial capacity 16 assigned
		System.out.println(s4);

		StringBuffer s5 = new StringBuffer(100);//constructor//int capacity 100
		System.out.println(s5);

		
		
		
		
		
	}

}
