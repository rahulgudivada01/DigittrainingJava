package com.digit.javaTraining.basicpatterns;

import java.util.Scanner;

public class array3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of schools: ");
		int sch=sc.nextInt();
		int arr[][][]=new int[sch][][];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter number of classes in school"+(i+1)+" :");
			int cls=sc.nextInt();
			arr[i]=new int[cls][];
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter number of students in class "+(j+1)+"in school "+(i+1)+" : ");
				int stu=sc.nextInt();
				arr[i][j]=new int[stu];
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Entering School "+(i+1)+": ");
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter class "+(j+1)+": ");
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.println("Enter student "+(k+1)+" roll number: ");
					arr[i][j][k]=sc.nextInt();
				}
			}
		}
	}
}
