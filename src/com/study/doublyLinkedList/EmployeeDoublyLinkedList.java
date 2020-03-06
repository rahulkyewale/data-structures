package com.study.doublyLinkedList;

import com.study.model.Employee;

public class EmployeeDoublyLinkedList 
{
	private EmployeeNode head;
	
	private EmployeeNode tail;
	
	private int size;
	
	public void addToFront(Employee employee)
	{
		EmployeeNode node = new EmployeeNode(employee);
		
		if(isEmpty())
			tail = node;
		else
		{
			head.setPrev(node);
			node.setNext(head);
		}
		
		head = node;
		size++;
	}
	
	public void addToEnd(Employee employee)
	{
		EmployeeNode node = new EmployeeNode(employee);
		
		if(isEmpty())
			head = node;
		else
		{
			tail.setNext(node);
			node.setPrev(tail);
		}
		
		tail = node;
		size++;
	}
	
	public EmployeeNode removeFromFront()
	{
		if(isEmpty())
		{
			return null;
		}
		
		EmployeeNode removedNode = head;
		
		if(head.getNext() == null)
			tail = null;
		else
			head.getNext().setPrev(null);
		
		head = head.getNext();
		size--;
		removedNode.setNext(null);
		return removedNode;
	}
	
	public EmployeeNode removeNode(Employee employee)
	{
		EmployeeNode node = head;
		EmployeeNode removedNode = null;
		
		while(node != null)
		{
			if(node.getEmployee().equals(employee))
			{
				removedNode = node;
				break;
			}
			
			node = node.getNext();
		}
		
		if(removedNode != null)
		{
			EmployeeNode prevNode = removedNode.getPrev();
			EmployeeNode nextNode = removedNode.getNext();
			
			if(prevNode == null)
			{
				return removeFromFront(); 
			}
			
			if(nextNode == null)
			{
				return removeFromEnd(); 
			}
			
			
			prevNode.setNext(nextNode);
			nextNode.setPrev(prevNode);
			size--;
			removedNode.setPrev(null);
			removedNode.setNext(null);
		}
		else
		{
			System.out.println("Employee is not available in linked list to remove");
		}
		
		
		return removedNode;
	}
	
	public EmployeeNode removeFromEnd()
	{
		if(isEmpty())
		{
			return null;
		}
		
		EmployeeNode removedNode = tail;
		
		if(tail.getPrev() == null)
			head = null;
		else
			tail.getPrev().setNext(null);
		
		tail = tail.getPrev();
		size--;
		removedNode.setPrev(null);
		return removedNode;
	}
	
	public void printListFromHead()
	{
		EmployeeNode node = head;
		System.out.print("HEAD <-> ");
		while(node != null)
		{
			System.out.print(node.toString());
			System.out.print(" <-> ");
			node = node.getNext();
		}
		System.out.println("TAIL");
	}
	
	public void printListFromEnd()
	{
		EmployeeNode node = tail;
		System.out.print("TAIL <-> ");
		while(node != null)
		{
			System.out.print(node.toString());
			System.out.print(" <-> ");
			node = node.getPrev();
		}
		System.out.println("HEAD");
	}
	
	
	public boolean isEmpty()
	{
		return head == null && tail == null;
	}
	
	public int getSize()
	{
		return size;
	}
}
