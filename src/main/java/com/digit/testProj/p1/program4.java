package com.digit.testProj.p1;

import java.util.Scanner;

class operations
{
	void function1() throws ArithmeticException
	{
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Division Operation");
			System.out.println("Enter the numerator: ");
			int num=sc.nextInt();
			System.out.println("Enter the Denominator: ");
			int den=sc.nextInt();
			int res=num/den;
			System.out.println("Division result is: "+res);		
		}
		catch(Exception e)
		{
			System.out.println("Exception handled in function-1");
			throw e;
		}
		finally {
			System.out.println("left func-1");
		}

	}
}
public class program4 {
	public static void main(String[] args) {
		try {
			System.out.println("Inside Main");
			operations op=new operations();
			op.function1();
		}
		catch(Exception e)
		{
			System.out.println("Exception handled in main");
		}
		finally
		{
			System.out.println("left main");
		}
	}

}
