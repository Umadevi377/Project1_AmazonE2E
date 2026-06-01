package Package2;

public class StringProgram2 {

	public static void main(String[] args)
	{
		String a ="Umadevi";
		System.out.println(a.substring(4));
		System.out.println(a.substring(1,5));//-1 with end index 
		boolean b =	a.equals("Umadevi")	;
		System.out.println(b);
		boolean b1 =a.contains("devs");
		System.out.println(b1);
	
	boolean b3=	a.matches("U(.*)");//string starts with U follows multiple character
	System.out.println(b3);
	
	boolean b4=	a.matches("(.*)o");//string ends with o 
	System.out.println(b4);
	
	boolean b5=	a.matches(".......");//string has exact 7 letters
	System.out.println(b5);
	
	
	boolean b6=	a.matches("https.*");//string contains https or not 
	System.out.println(b6);
	
String s1=a.replace('a', 'A');
System.out.println(s1);
		String s2= a.replaceAll("[A-Z]", "123");
		System.out.println(s2);

 
String s3 = "AutomationTesting60";
String s4 = s3.replaceAll("[a-z]", "uma");
System.out.println(s4);

String sd = "u   v j  123";
System.out.println(sd.replaceAll("[0-9]", a));
		
	}

}
