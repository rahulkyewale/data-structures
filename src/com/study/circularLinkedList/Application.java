package com.study.circularLinkedList;

import com.study.model.Employee;

public class Application {

	public static void main(String[] args) 
	{
		CircularList circularList = new CircularList();
		
		circularList.add(new Employee("Rahul", "Yewale", 1001));
		circularList.add(new Employee("Pratibha", "Yewale", 1002));
		circularList.add(new Employee("Arjun", "Yewale", 1003));
		circularList.add(new Employee("Swapnil", "Yewale", 1004));
		circularList.add(new Employee("Shalan", "Yewale", 1005));
		
		circularList.printList();
		
		System.out.println("-----------############################---------------");
		System.out.println(circularList.remove());
		System.out.println("-----------############################---------------");
		
		circularList.printList();
	}

}
