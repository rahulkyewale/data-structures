package com.study.singlyLinkedList;

import com.study.model.Employee;

public class EmployeeSinglyLinkedList 
{
	private EmployeeNode head;
	
	private int size;
	
	public void addToFront(Employee employee)
	{
		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head);
		head = node;
		size++;
	}
	
	public EmployeeNode removeFromFront()
	{
		if(isEmpty())
		{
			return null;
		}
		else
		{
			EmployeeNode removedNode = head;
			head = head.getNext();
			size--;
			removedNode.setNext(null);
			
			return removedNode;
		}
	}
	
	public void printList()
	{
		EmployeeNode node = head;
		System.out.print("HEAD -> ");
		while(node != null)
		{
			System.out.print(node.toString());
			System.out.print(" -> ");
			node = node.getNext();
		}
		System.out.println("null");
	}
	
	public int getSize()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return head == null;
	}
	
}
