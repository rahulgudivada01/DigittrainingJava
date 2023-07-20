package com.digit.javaTraining.mutlithreading;

import java.util.Scanner;

class bankingg implements Runnable
{
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Banking Operation");
		System.out.println("Enter Account number");
		int accno=sc.nextInt();
		System.out.println("Enter the pin: ");
		int pin=sc.nextInt();
		System.out.println("Banking Completed");
	}
}
class printingg implements Runnable
{
	public void run()
	{
			try 
			{
				System.out.println("Printing Operation");
				for(int i=0;i<5;i++)
				{
					System.out.println("Good morning!");
					Thread.sleep(3000);
				}
				System.out.println("printing completed");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
}
class additionn implements Runnable
{
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Addition Operartion");
		System.out.println("Enter 1st number");
		int num1=sc.nextInt();
		System.out.println("Enter nunmber 2: ");
		int num2=sc.nextInt();
		int res=num1+num2;
		System.out.println("The result is "+res);
		System.out.println("Addition Completed");
	}
}

public class program4 {
	public static void main(String[] args) {
		bankingg b=new bankingg();
		printingg p=new printingg();
		additionn a=new additionn();
		
		Thread t1=new Thread(b);
		Thread t2=new Thread(p);
		Thread t3=new Thread(a);
		t1.start();
		t2.start();
		t3.start();
		
	}
}
