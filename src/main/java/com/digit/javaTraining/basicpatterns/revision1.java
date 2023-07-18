package com.digit.javaTraining.basicpatterns;
import java.util.Scanner;
public class revision1 {
	public static void main(String[] args) {
		String s1;
		String s2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String 1:");
		s1=sc.next();
		System.out.println("Enter String 2: ");
		s2=sc.next();
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			count+=s1.charAt(i);
		}
		System.out.println(count);
		
	}
	

}
