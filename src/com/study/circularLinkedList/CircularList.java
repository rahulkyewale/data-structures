package com.study.circularLinkedList;

import com.study.model.Employee;

public class CircularList 
{
	private EmployeeNode head;
	
	private EmployeeNode tail;
	
	private int size;
	
	public void add(Employee employee)
	{
		EmployeeNode node = new EmployeeNode(employee);
		
		if(isEmpty())
		{
			head = node;
			tail = node;
			tail.setNext(head);
			size++;
			
			return;
		}
		
		node.setNext(head);
		head = node;
		tail.setNext(head);
		size++;
	}
	
	public EmployeeNode remove()
	{
		if(isEmpty())
		{
			System.out.println("List is already empty");
			return null;
		}
		
		EmployeeNode removedNode = head;
		
		tail.setNext(head.getNext());
		head = head.getNext();
		
		size--;
		
		removedNode.setNext(null);
		
		return removedNode;
	}
	
	public void printList()
	{
		if(!isEmpty())
		{
			EmployeeNode currentNode = head;
			System.out.print("HEAD => ");
			
			do
			{
				System.out.print(currentNode.getField());
				System.out.print(" => ");
				
				currentNode = currentNode.getNext();
			}
			while(currentNode != head);
			System.out.println(" TAIL => HEAD");
		}
	}
	
	public boolean isEmpty()
	{
		return size == 0;
	}
}
