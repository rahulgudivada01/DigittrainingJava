package com.digit.javaTraining.collectionFrameworks;

import java.util.TreeSet;

public class treeset1 {
	public static void main(String[] args) {
		TreeSet t= new TreeSet();
		t.add(100);
		t.add(50);
		t.add(150);
		t.add(25);
		t.add(75);
		t.add(125);
		t.add(175);
		System.out.println(t);
		System.out.println(t.ceiling(129));
		System.out.println(t.subSet(t.first(), t.last()));
	}
}
