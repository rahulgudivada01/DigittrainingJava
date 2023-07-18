package com.digit.javaTraining.basicpatterns;

import java.util.Arrays;
import java.util.Scanner;

public class revision11 {
	public static void main(String[] args) {
		int[] arr=new int[5];
		System.out.println("enter array");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[arr.length-2]);
	}
}
