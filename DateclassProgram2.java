package Package2;

import java.util.Date;

public class DateclassProgram2
{

	public static void main(String[] args) 
	{
		Date d1 = new Date();//constructor
		System.out.println(d1.getTime());
		
		Date d2 = new Date(d1.getTime());
		System.out.println(d2);
		
		
	String s1 =	d2.toString();
	String hour =s1.substring(11, 13);
	System.out.println("display an hour " +hour);	
	String minutes = s1.substring(14,16);
	System.out.println("display  miniutes " +minutes);
	
	String seconds = s1.substring(17,19);
	System.out.println("display  seconds " +seconds);
	
		}

}
