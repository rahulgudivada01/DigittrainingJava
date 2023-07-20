package com.digit.testProj.p1;

import java.util.Scanner;

class wrongpasswordexception extends Exception
{
	public String message()
	{
		return "Password is Incorrect";
	}
}
class check
{
	String password;
	void getData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Password: ");
		password=sc.next();
	}
	void verify() throws Exception
	{
		int num=0;
		int special=0;
		int caps=0;
		for(int i=0;i<password.length();i++)
		{
			char p=password.charAt(i);
			if(p>='A'&&p<='Z')
			{
				caps++;
			}
			if(p>='0'&&p<='9')
			{
				num++;
			}
			if(p>='a'&&p<='z')
			{

			}
			else
				special++;
		}
		if(num>=1&&caps>=1&&special>=1)
		{
			System.out.println("Correct Password");

		}
		else
		{
			wrongpasswordexception wpe=new wrongpasswordexception();
			System.out.println(wpe.message());
			throw wpe;
		}
	}
}
class checks
{
	void checkPassword(check c)
	{
		try {
			c.getData();
			c.verify();
		}
		catch(Exception e)
		{
			try {
				c.getData();
				c.verify();
			}
			catch(Exception e1)
			{
				try
				{
					c.getData();
					c.verify();
				}
				catch(Exception e3)
				{
					System.out.println("Try again after sometime");
				}

			}

		}
	}
}
public class password {
	public static void main(String[] args) {
		check c1=new check();
		checks c2=new checks();
		c2.checkPassword(c1);
	}

}
