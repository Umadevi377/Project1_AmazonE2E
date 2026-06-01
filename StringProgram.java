package Package2;

public class StringProgram {

	public static void main(String[] args)
	{
		String a ="Umadevi";
		//indexing concept: 0,1,2,3
		//a[0]= 'U'
		//a[1] ='m'
		
		System.out.println(a.concat("   Automation"));//concat 2 strings 
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
	char c1 =	a.charAt(5);//retrun char value of index position 
	System.out.println(c1);
	int index = a.indexOf('d');//Return intex value as int value
	System.out.println(index);
	
	String b = "   automation       batch 60   ";
	System.out.println(b.trim());//trim method remove all the spaces start and end of the string . not in the middle of the string
	
	
			
	
	}

}
