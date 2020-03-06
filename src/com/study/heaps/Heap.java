package com.study.heaps;

public class Heap 
{
	private int[] heap;
	
	private int size;
	
	public Heap(int capacity)
	{
		heap = new int[capacity];
	}
	
	public boolean isFull()
	{
		return size == heap.length;
	}
	
	public int getParent(int index)
	{
		return (index - 1) / 2;
	}
	
	public void insert(int value)
	{
		if(isFull())
		{
			throw new IndexOutOfBoundsException("Heap is Full");
		}
		
		heap[size] = value;
		fixHeapAbove(size);
		
		size++;
	}
	
	public int delete(int index)
	{
		if(isEmpty())
		{
			throw new IndexOutOfBoundsException("Heap is Empty");
		}
		
		int parentIndex = getParent(index);
		int deletedValue = heap[index];
		heap[index] = heap[size - 1];
		heap[size - 1] = 0;
		size--;
		
		if(index == 0 || heap[index] < heap[parentIndex])
		{
			fixHeapBelow(index, size - 1);
		}
		else
		{
			fixHeapAbove(index);
		}
		
		return deletedValue;
	}
	
	public void fixHeapAbove(int index)
	{
		int newValue = heap[index];
		
		while(index > 0 && newValue > heap[getParent(index)])
		{
			int parentIndex = getParent(index);
			heap[index] = heap[parentIndex];
			index = parentIndex;
		}
		
		heap[index] = newValue;
	}
	
	public void fixHeapBelow(int index, int lastHeapIndex)
	{
		int childToSwap;
		
		while(index <= lastHeapIndex )
		{
			int leftChildIndex = getChild(index, true);
			int rightChildIndex = getChild(index, false);
			
			if(leftChildIndex <= lastHeapIndex)
			{
				if(rightChildIndex > lastHeapIndex)
				{
					childToSwap = leftChildIndex;
				}
				else
				{
					childToSwap = heap[leftChildIndex] > heap[rightChildIndex] ? leftChildIndex : rightChildIndex;
				}
				
				if(heap[index] < heap[childToSwap])
				{
					int temp = heap[index];
					heap[index] = heap[childToSwap];
					heap[childToSwap] = temp;
				}
				else
				{
					break;
				}
				
				index = childToSwap;
			}
			else
			{
				break;
			}
		}
	}
	
	public void sort()
	{
		if(isEmpty())
		{
			throw new IndexOutOfBoundsException("Heap is Empty");
		}
		
		int lastHeapIndex = size - 1;
		
		for(int i = 0; i <= lastHeapIndex; i++)
		{
			int temp = heap[0];
			heap[0] = heap[lastHeapIndex - i];
			heap[lastHeapIndex - i] = temp;
			
			fixHeapBelow(0, lastHeapIndex - i -1);
		}
	}
	
	public int peek()
	{
		if(isEmpty())
		{
			throw new IndexOutOfBoundsException("Heap is Empty");
		}
		
		return heap[0];
	}
	
	public boolean isEmpty()
	{
		return size == 0;
	}
	
	public int getChild(int index, boolean isLeft)
	{
		return 2 * index + (isLeft ? 1 : 2);
	}
	
	public void printHeap()
	{
		for (int i = 0; i < size; i++) 
		{
			System.out.print(heap[i] + ", ");
		}
		
		System.out.println("");
	}
}
