package com.study.circularQueue;

import com.study.model.Employee;

public class MainArrayQueue {

	public static void main(String[] args) 
	{
		/**
		
		CircularArrayQueue queue = new CircularArrayQueue(3);
		
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
		**/
		
		
		CircularArrayQueue queue1 = new CircularArrayQueue(3);
		
		queue1.add(new Employee("Rahul", "Yewale", 1001));
		queue1.add( new Employee("Pratibha", "Yewale", 1002) );
		queue1.add( new Employee("Arjun", "Yewale", 1003) );
		queue1.add( new Employee("Swapnil", "Yewale", 1004) );
		
		queue1.printQueue();
		
		queue1.remove();
		queue1.remove();
		queue1.remove();
		
		queue1.add( new Employee("Shalan", "Yewale", 1005) );
		queue1.add(new Employee("Rahul", "Yewale", 1001));
		queue1.add( new Employee("Pratibha", "Yewale", 1002) );
		
		queue1.printQueue();
	}

}
