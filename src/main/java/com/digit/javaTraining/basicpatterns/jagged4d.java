package com.digit.javaTraining.basicpatterns;

import java.util.Scanner;

public class jagged4d {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Univeristies: ");
		int uni=sc.nextInt();
		int arr[][][][]=new int[uni][][][];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Entering number of schools in uni  "+(i+1)+": ");
			int sch=sc.nextInt();
			arr[i]=new int[sch][][];
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter number of classes in school "+(j+1)+": ");
				int cls=sc.nextInt();
				arr[i][j]=new int[cls][];
			}
			
			
		}
	}

}
