package com.study.arrayQueue;

import com.study.model.Employee;

public class MainArrayQueue {

	public static void main(String[] args) 
	{
		ArrayQueue queue = new ArrayQueue(3);
		
		queue.add(new Employee("Rahul", "Yewale", 1001));
		queue.add( new Employee("Pratibha", "Yewale", 1002) );
		queue.add( new Employee("Arjun", "Yewale", 1003) );
		queue.add( new Employee("Swapnil", "Yewale", 1004) );
		queue.add( new Employee("Shalan", "Yewale", 1005) );
		
		queue.printQueue();
		
		System.out.println("---------------##################################################-------------");
		System.out.println(queue.remove());
		System.out.println("---------------##################################################-------------");
		
		queue.printQueue();
		
		System.out.println("---------------##################################################-------------");
		System.out.println(queue.peek());
		System.out.println("---------------##################################################-------------");
		
		queue.printQueue();
	}

}
