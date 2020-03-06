package com.study.binarySearch;

import java.util.SortedSet;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(2);
		ts.add(3);
		ts.add(7);
		ts.add(5);
		
		SortedSet<Integer> ss = ts.subSet(3, 5);
		
		ss.add(4);
		ss.add(6);
		
		System.out.println(ss);
		
		Thread t = Thread.currentThread();
		t.setName("asd");
		System.out.println(t);

	}

}
