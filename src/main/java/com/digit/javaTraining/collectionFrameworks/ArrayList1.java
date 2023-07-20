package com.digit.javaTraining.collectionFrameworks;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(2);
		a.add("Rahul");
		System.out.println(a);
		int b=5;
		a.add(1,b);
		System.out.println(a);
		ArrayList al=new ArrayList();
		al.add("Bro i am crazy");
		a.addAll(al);
		System.out.println(a);
		a.contains(5);
		System.out.println(a.contains(5));
		a.ensureCapacity(5);
		a.remove(3);
		System.out.println(a);
		a.remove(2);
		System.out.println(a);
		System.out.println(a.equals(al));
		int arr[]= {1,2,3};
		System.out.println(arr[0]);
		Object arr1[]=a.toArray();
		System.out.println(arr1);
		System.out.println(arr1[0]);
		String str=a.toString();
		System.out.println(str);
		a.trimToSize();
		System.out.println(a);
		a.add(3);
		System.out.println("Hello");
	}

}
