package com.study.trees;

public class TreeApplication {

	public static void main(String[] args) 
	{
		Tree tree =  new Tree();
		
		tree.insert(25);
		tree.insert(20);
		tree.insert(15);
		tree.insert(27);
		tree.insert(30);
		tree.insert(29);
		tree.insert(26);
		tree.insert(22);
		tree.insert(32);
		tree.insert(17);
		
		tree.traverseInOrder();
		System.out.println();
		System.out.println("----------------##########################--------------");
		
		tree.traversePreOrder();
		
		/**
		System.out.println("Get Node for 29 is : " +tree.get(29));
		System.out.println("Get Node for 25 is : " +tree.get(15));
		System.out.println("Get Node for 39 is : " +tree.get(39));
		System.out.println("----------------##########################--------------");
		
		System.out.println("Get MIN node value : " +tree.getMin());
		System.out.println("Get MAX node value : " +tree.getMax());
		System.out.println("----------------##########################--------------");
		*/
		/** 
		 * Case 1 and 2
		 */
		//tree.delete(17);
		//tree.traverseInOrder();
		//System.out.println("");
		
		//tree.delete(15);
		//tree.traverseInOrder();
		
		/**
		 * Case 3
		 */
		//tree.delete(200);
		//tree.traverseInOrder();
	}

}
