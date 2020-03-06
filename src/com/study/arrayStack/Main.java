package com.study.arrayStack;

import com.study.model.Employee;

public class Main {

	public static void main(String[] args) 
	{	
		ArrayStack stack = new ArrayStack(5);
		
		stack.push( new Employee("Rahul", "Yewale", 1001) );
		stack.push( new Employee("Pratibha", "Yewale", 1002) );
		stack.push( new Employee("Arjun", "Yewale", 1003) );
		stack.push( new Employee("Swapnil", "Yewale", 1004) );
		stack.push( new Employee("Shalan", "Yewale", 1005) );
		
		//stack.printStack();
		
		System.out.println(stack.pop());
		//stack.printStack();
		
		System.out.println(stack.peek());
		stack.printStack();
		
		/**
		 * JDK has provided the implementation using below Deque interface
		 */
		//Deque<E> stack = new ArrayDeque<E>();
	
	}

}
