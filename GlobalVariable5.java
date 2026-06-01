package module1.basic;

public class GlobalVariable5 

{
    public static void main(String args[])
    {
    	System.out.println(GlobalVariable4.age);//accessing  static Global variable within the package outside class
    	GlobalVariable4 g = new GlobalVariable4();//non static Global variable 
    	System.out.println(g.id);
    	
    }
}
