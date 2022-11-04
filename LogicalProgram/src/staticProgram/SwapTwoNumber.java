package staticProgram;

public class SwapTwoNumber 
{
	public void method()
	{
		int n1=10,n2=20,n3;

		System.out.println("Before swap the number = "+n1+"  "+n2);

		n3 = n1;
		n1=n2;
		n2=n3;

		System.out.println("After swap the number = "+n1+"  "+n2);

	}

	public static void main(String []args)
	{
		SwapTwoNumber obj = new SwapTwoNumber();
		obj.method();
	}

}
