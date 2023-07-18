package com.digit.javaTraining.basicpatterns;

import java.util.Scanner;

public class array2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of classes: ");
		int m=sc.nextInt();
		System.out.println("Enter the number of students per class: ");
		int n=sc.nextInt();
		String arr[][]=new String[m][n];
		for(int i=0;i<m;i++)
		{
			System.out.println("Entering class "+(i+1)+": ");
			for(int j=0;j<n;j++)
			{
				System.out.println("Enter name of student "+(j+1)+": ");
				arr[i][j]=sc.next();
			}
		}
		for(int i=0;i<m;i++)
		{
			System.out.println("Enter class "+(i+1)+": ");
			for(int j=0;j<n;j++)
			{
				System.out.println("Name of Student "+(j+1)+"is :"+arr[i][j]);
			}
		}
	}

}
