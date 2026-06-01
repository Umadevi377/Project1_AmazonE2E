package Package2;

class Amazon_Parent
{
	Amazon_Parent(int a,char b)// parent class parameterized constructor
	{
		
		System.out.println("Constructor 2 :100,M");
	}
	Amazon_Parent()//non parameterized constructor parent class
	{
		
		System.out.println("Constructor 2 :200");
	}
	
}

public class Amazon_Child extends Amazon_Parent

{
	
	Amazon_Child()
	{   
		super(100,'M');//first line of every constructor calling explicitly( parameterized)
		System.out.println("Constructor 1");
	}
		public static void main(String[] args)
		
		{
		new Amazon_Child();

	}

}
//super calling statement