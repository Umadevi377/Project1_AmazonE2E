package module1.basic;

public class NewProgram1 {
	
	static void add()
	{
		System.out.println("Addition");
	}

	public static void main(String[] args) 
	
	{
		add();//static call method:same class
		NewProgram2 n = new NewProgram2();
		n.studentdet();//objectname.methodname. different class

	}

}
