package com.study.doublyLinkedList;

import com.study.model.Employee;

public class Application {

	public static void main(String[] args) 
	{
		Employee e1 = new Employee("Rahul", "Yewale", 1001);
		Employee e2 = new Employee("Pratibha", "Yewale", 1002);
		Employee e3 = new Employee("Arjun", "Yewale", 1003);
		Employee e4 = new Employee("Swapnil", "Yewale", 1004);
		Employee e5 = new Employee("Shalan", "Yewale", 1005);
		
		EmployeeDoublyLinkedList doublyLinkedList = new EmployeeDoublyLinkedList();
		
		System.out.println("Is List Empty = "+doublyLinkedList.isEmpty());
		
		doublyLinkedList.addToFront(e3);
		doublyLinkedList.addToFront(e2);
		doublyLinkedList.addToFront(e1);
		doublyLinkedList.addToEnd(e4);
		doublyLinkedList.addToEnd(e5);
		
		System.out.println(doublyLinkedList.getSize());
		
		doublyLinkedList.printListFromHead();
		doublyLinkedList.printListFromEnd();
		
		System.out.println(doublyLinkedList.removeFromFront());
		System.out.println(doublyLinkedList.getSize());
		
		System.out.println(doublyLinkedList.removeFromEnd());
		System.out.println(doublyLinkedList.getSize());
		
		doublyLinkedList.printListFromHead();
		
		System.out.println("Is List Empty = "+doublyLinkedList.isEmpty());
		
		System.out.println(doublyLinkedList.removeNode(e4).toString());
		System.out.println(doublyLinkedList.getSize());
		doublyLinkedList.printListFromHead();
		
		
		doublyLinkedList.removeNode(e1);
		System.out.println(doublyLinkedList.getSize());
		doublyLinkedList.printListFromHead();
	}

}
