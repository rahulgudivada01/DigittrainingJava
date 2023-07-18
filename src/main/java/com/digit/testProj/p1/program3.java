package com.digit.testProj.p1;

import java.util.Scanner;

class operation
{
	void function1() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Division Operation");
		System.out.println("Enter the numerator: ");
		int num=sc.nextInt();
		System.out.println("Enter the Denominator: ");
		int den=sc.nextInt();
		int res=num/den;
		System.out.println("Division result is: "+res);
	}
	void function2() throws Exception
	{
		System.out.println("Inside Function 2");
		function1();
		System.out.println("Left Function 2");
	}
	void function3()
	{
		try {
			System.out.println("inside function 3");
			function2();
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled");
		}
		System.out.println("Left function 3");
	}
}
public class program3 {
	public static void main(String[] args) {
		System.out.println("Inside Main");
		operation op=new operation();
		op.function3();
		System.out.println("Left Main");
		
	}
}
