package com.study.linkedListStack;

import java.util.EmptyStackException;

import com.study.model.Employee;

public class LinkedListStack 
{
	private EmployeeNode top;
	
	private int size;
	
	public void push(Employee employee)
	{
		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(top);
		top = node;
		size++;
	}
	
	public EmployeeNode pop()
	{
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
		
		EmployeeNode removedNode = top;
		
		top = top.getNext();
		size--;
		removedNode.setNext(null);
		
		return removedNode;
	}
	
	public EmployeeNode peek()
	{
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
		
		return top;
	}
	
	public void printStack()
	{
		EmployeeNode currentNode = top;
		System.out.println(" TOP => ");
		while(currentNode != null)
		{
			System.out.println(currentNode.toString() + " => ");
			currentNode = currentNode.getNext();
		}
		System.out.println(" NULL ");
	}
	
	public boolean isEmpty()
	{
		return size == 0;
	}
}
