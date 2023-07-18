package com.digit.javaTraining.basicpatterns;

import java.util.Scanner;

public class arraytry {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count of students: ");
		int n=sc.nextInt();
		String arr[]=new String[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the name of student "+(i+1));
			arr[i]=sc.next();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("The name of student "+(i+1)+" is "+arr[i]);
		}
	}

}
