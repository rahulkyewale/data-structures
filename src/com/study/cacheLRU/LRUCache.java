package com.study.cacheLRU;

import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class LRUCache 
{
	private Integer capacity;
	
	private Deque<Integer> queue;
	
	private Set<Integer> set;
	
	public LRUCache(Integer capacity)
	{
		this.capacity = capacity;
		queue = new LinkedList<Integer>();
		set = new HashSet<Integer>();
	}
	
	public void set(Integer x)
	{
		if(!set.contains(x))
		{
			if(capacity.equals(queue.size()))
			{
				Integer removedObj = queue.removeLast();
				set.remove(removedObj);
			}
		}
		else
		{
			Iterator<Integer> iterator = queue.iterator();
			while (iterator.hasNext()) 
			{
				Integer obj = iterator.next();
				if(obj.equals(x))
				{
					iterator.remove();
				}
			}
		}
		
		queue.addFirst(x);
		set.add(x);
	}
	
	public Integer get(Integer y)
	{
		if(set.contains(y))
		{
			Iterator<Integer> iterator = queue.iterator();
			while (iterator.hasNext()) 
			{
				Integer obj = iterator.next();
				if(obj.equals(y))
				{
					iterator.remove();
				}
			}
			
			queue.addFirst(y);
		}
		
		return null;
	}
	
	public static void main(String[] args)
	{
		LRUCache cache = new LRUCache(5);
		
		cache.set(1);
		cache.set(2);
		cache.set(3);
		cache.set(4);
		cache.set(5);
		
		cache.set(6);
		
		cache.set(2);
		cache.set(5);
		
		cache.set(7);
		
		
	}
}
