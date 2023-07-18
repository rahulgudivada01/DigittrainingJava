package com.digit.testProj.p1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Division Operation");
			System.out.println("Enter the numerator: ");
			int num=sc.nextInt();
			System.out.println("Enter the Denominator: ");
			int den=sc.nextInt();
			int res=num/den;
			System.out.println("Division result is: "+res);
			System.out.println("Array Operation");
			System.out.println("Enter the array size: ");
			int n=sc.nextInt();
			int arr[]=new int[n];
			int arr1[]=null;
			System.out.println("enter the position to which value has to be added");
			int pos=sc.nextInt();
			System.out.println("enter the value to be added");
			int val=sc.nextInt();
			arr[pos]=val;
			System.out.println("Data added into the array");
		}
		catch(ArithmeticException e1)
		{
			System.out.println("Arithmetic Exception");
		}
		/*
		catch(NegativeArraySizeException e2)
		{
			System.out.println("negative array size exception");
		}
		catch(ArrayIndexOutOfBoundsException e3)
		{
			System.out.println("Array index out of bounds exception");
		}
		*/
		catch(InputMismatchException e4)
		{
			System.out.println("Input MisMatch Exception");
		}
		catch(ArrayIndexOutOfBoundsException|NegativeArraySizeException e2)
		{
			System.out.println("Array related EXCEPTION");
		}
		catch(NullPointerException e5)
		{
			System.out.println("Null Pointer Exception");
		}
		catch(Exception e)
		{
			System.out.println("Exception handled by generic catch");
		}

	}
}
