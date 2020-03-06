package com.study.singlyLinkedList;

import com.study.model.Employee;

public class Application {

	public static void main(String[] args) 
	{
		Employee e1 = new Employee("Rahul", "Yewale", 1001);
		Employee e2 = new Employee("Pratibha", "Yewale", 1002);
		Employee e3 = new Employee("Arjun", "Yewale", 1003);
		Employee e4 = new Employee("Swapnil", "Yewale", 1004);
		Employee e5 = new Employee("Shalan", "Yewale", 1005);
		
		EmployeeSinglyLinkedList singlyLinkedList = new EmployeeSinglyLinkedList();
		
		System.out.println("List is Empty = "+singlyLinkedList.isEmpty());
		
		singlyLinkedList.addToFront(e1);
		singlyLinkedList.addToFront(e2);
		singlyLinkedList.addToFront(e3);
		singlyLinkedList.addToFront(e4);
		singlyLinkedList.addToFront(e5);
		
		singlyLinkedList.printList();
		System.out.println(singlyLinkedList.getSize());
		
		System.out.println(singlyLinkedList.removeFromFront().toString());
		System.out.println(singlyLinkedList.removeFromFront().toString());
		
		singlyLinkedList.printList();
		System.out.println(singlyLinkedList.getSize());

		System.out.println("List is Empty = "+singlyLinkedList.isEmpty());
	}

}
