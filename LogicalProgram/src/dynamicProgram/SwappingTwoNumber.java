package dynamicProgram;

import java.util.Scanner;

public class SwappingTwoNumber 
{
	public void method()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number = ");
		int n1 = s.nextInt();
		System.out.println("Enter second number = ");
		int n2 = s.nextInt();
		s.close();
		
		System.out.println("Before swap the number = "+n1+"  "+n2);
		
		int n3 = n1;
		n1=n2;
		n2=n3;
		
		System.out.println("After swap the number = "+n1+"  "+n2);
		
	}

	public static void main(String []args)
	{
		SwappingTwoNumber obj = new SwappingTwoNumber();
		obj.method();
	}
}
