package com.study.arrayQueue;

import java.util.NoSuchElementException;

import com.study.model.Employee;

public class ArrayQueue 
{
	private Employee[] queue;
	
	private int front;
	
	private int back;
	
	public ArrayQueue(int capacity)
	{
		queue = new Employee[capacity];
	}
	
	public void add(Employee employee)
	{
		if(back == queue.length)
		{
			Employee[] newArray = new Employee[ 2 * queue.length ];
			System.arraycopy(queue, 0, newArray, 0, queue.length);
			queue = newArray;
		}
		
		queue[back++] = employee;
	}
	
	public Employee remove()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException();
		}
		
		Employee removedItem = queue[front];
		queue[front] = null;
		front++;
		
		if(isEmpty())
		{
			front = 0;
			back = 0;
		}
		
		return removedItem;
	}
	
	public Employee peek()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException();
		}
		
		return queue[front];
	}
	
	public void printQueue()
	{
		System.out.println("FRONT => ");
		for (int i = front; i < back; i++) 
		{
			System.out.print(queue[i]);
			System.out.println(" => ");
		}
		System.out.println(" BACK ");
	}
	
	public boolean isEmpty()
	{
		return back-front == 0;
	}
}
