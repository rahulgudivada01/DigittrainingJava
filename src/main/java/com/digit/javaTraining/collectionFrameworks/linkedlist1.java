package com.digit.javaTraining.collectionFrameworks;
import java.util.ArrayList;
import java.util.LinkedList;
public class linkedlist1 {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(2);
		l1.add(3);
		l1.add(0,5);
		System.out.println(l1);
		System.out.println(l1.contains(2));
		l1.add("Rahul");
		System.out.println(l1);
		ArrayList a1=new ArrayList();
		a1.add(2);
		a1.add(4);
		a1.add(6);
		System.out.println(a1);
		l1.addAll(a1);
		System.out.println(l1);
		System.out.println(l1.peek());
		System.out.println(l1.peekLast());
		l1.poll();
		System.out.println(l1);
		l1.S
	}
}
