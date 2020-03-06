package com.study.circularQueue;

import java.util.NoSuchElementException;

import com.study.model.Employee;

public class CircularArrayQueue 
{
	private Employee[] queue;
	
	private int front;
	
	private int back;
	
	public CircularArrayQueue(int capacity)
	{
		queue = new Employee[capacity];
	}
	
	public void add(Employee employee)
	{
		if (size() == queue.length - 1) {
            int numItems = size();
            Employee[] newArray = new Employee[2 * queue.length];

            if(front <= back)
            {
            	System.arraycopy(queue, 0, newArray, 0, size());
            }
            else
            {
            	System.arraycopy(queue, front, newArray, 0, queue.length - front);
                System.arraycopy(queue, 0, newArray, queue.length - front, back);
            }
            
            queue = newArray;

            front = 0;
            back = numItems;
        }
		
		queue[back] = employee;
		
		if(back < queue.length - 1)
		{
			back++;
		}
		else
		{
			back = 0;
		}
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
		else if(front == queue.length)
		{
			front = 0;
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
		if(front <= back)
		{
			for (int i = front; i < back; i++) 
			{
				System.out.print(queue[i]);
				System.out.println(" => ");
			}
		}
		else
		{
			for (int i = front; i < queue.length; i++) 
			{
				System.out.print(queue[i]);
				System.out.println(" => ");
			}
			for (int i = 0; i < back; i++) 
			{
				System.out.print(queue[i]);
				System.out.println(" => ");
			}
		}
		
		System.out.println(" BACK ");
	}
	
	public boolean isEmpty()
	{
		return back-front == 0;
	}
	
	public int size()
	{
		if(front <= back)
		{
			return back - front;
		}
		
		return back - front + queue.length;
	}
}
