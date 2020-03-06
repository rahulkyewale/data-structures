package com.study.linkedListStack;

import java.util.LinkedList;

import com.study.model.Employee;

public class Application {

	public static void main(String[] args) 
	{
		LinkedListStack stack = new LinkedListStack();
		
		stack.push( new Employee("Rahul", "Yewale", 1001) );
		stack.push( new Employee("Pratibha", "Yewale", 1002) );
		stack.push( new Employee("Arjun", "Yewale", 1003) );
		stack.push( new Employee("Swapnil", "Yewale", 1004) );
		stack.push( new Employee("Shalan", "Yewale", 1005) );
		
		stack.printStack();
		
		System.out.println(stack.pop());
		System.out.println("-----------############################---------------");
		stack.printStack();
		System.out.println("-----------############################---------------");
		
		System.out.println(stack.peek());
		System.out.println("-----------############################---------------");
		stack.printStack();
		System.out.println("-----------############################---------------");
		
		
		/**
		 * JDK has provided the implementation using below Deque interface
		 */
		//LinkedList<Employee> stack = new LinkedList<Employee>();
	}

}
