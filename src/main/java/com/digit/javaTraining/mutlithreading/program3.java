package com.digit.javaTraining.mutlithreading;

import java.util.Scanner;

class Banking extends Thread
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
class printing extends Thread
{
	public void run()
	{
		try {
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
class addition extends Thread
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

public class program3 {
	public static void main(String[] args) {
		System.out.println("Main Started");
		Banking b1=new Banking();
		printing p1=new printing();
		addition a1=new addition();
		b1.start();
		p1.start();
		a1.start();
		System.out.println("Main Terminated");
	}

}
