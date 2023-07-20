package com.digit.testProj.p1;

import java.util.Scanner;

class underageException extends Exception
{
	public String message()
	{
		return "your age is less than 18,hence you are a kid. Please try again later.";
	}
}
class overageException extends Exception
{
	public String message()
	{
		return "your age is more than 60. Hence, stop having more desires";
	}
}
class candidate
{
	int age;
	void getData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age: ");
		age=sc.nextInt();
	}
	void verify() throws Exception
	{
		if(age<18)
		{
			underageException uae=new underageException();
			System.out.println(uae.message());
			throw uae;
		}
		else if(age>60)
		{
			overageException oae=new overageException();
			System.out.println(oae.message());
			throw oae;
		}
		else
		{
			System.out.println("Issue the Licence");
		}
	}
}
class RTO
{
	void getLicense(candidate c)
	{
		try {
			c.getData();
			c.verify();
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled");
		}
	}
}
public class program5 {
	public static void main(String[] args) {
		candidate c1=new candidate();
		RTO rto=new RTO();
		rto.getLicense(c1);
	}

}
