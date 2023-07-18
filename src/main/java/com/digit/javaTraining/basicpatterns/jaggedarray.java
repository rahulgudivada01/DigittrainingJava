package com.digit.javaTraining.basicpatterns;

import java.util.Scanner;

public class jaggedarray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count of classes: ");
		int cls=sc.nextInt();
		String arr[][]=new String[cls][];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the number of students in class "+(i+1)+": ");
			int stu=sc.nextInt();
			arr[i]=new String[stu];
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Entering class "+(i+1)+": ");
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter student "+(j+1)+"name: ");
				arr[i][j]=sc.next();
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Entering class "+(i+1)+": ");
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println(" student "+(j+1)+"name: "+arr[i][j]);
			}
		}
	}
}
