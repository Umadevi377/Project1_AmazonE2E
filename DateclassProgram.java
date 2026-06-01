package Package2;

import java.util.Date;

public class DateclassProgram
{

	public static void main(String[] args) 
	{
		Date d1 = new Date();//constructor
		System.out.println(d1.getTime());
		
		Date d2 = new Date(d1.getTime()+(1000*60*60*24*30l));//getting future date getTime()+
		//getting past date use getTime()-
		System.out.println(d2);
		
		
	String s1 =	d2.toString();
	String month =s1.substring(4, 7);
	System.out.println(month);	
	String year = s1.substring(24);
	System.out.println(year);
	//wap for hr out, min out, sec out
	
	
	}

}
