package com.digit.javaTraining.mutlithreading;

import java.util.Scanner;

public class program2 {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Banking Operation");
		System.out.println("Enter Account number");
		int accno=sc.nextInt();
		System.out.println("Enter the pin: ");
		int pin=sc.nextInt();
		System.out.println("Banking Completed");
		System.out.println("Printing Operation");
		for(int i=0;i<5;i++)
		{
			System.out.println("Good morning!");
			Thread.sleep(3000);
		}
		System.out.println("printing completed");
		System.out.println("Enter 1st number");
		int num1=sc.nextInt();
		System.out.println("Enter nunmber 2: ");
		int num2=sc.nextInt();
		int res=num1+num2;
		System.out.println("The result is "+res);
		System.out.println("Addition Completed");
	}

}
