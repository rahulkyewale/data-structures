package com.study.chainHash;

import java.util.LinkedList;
import java.util.ListIterator;

import com.study.model.Employee;
import com.study.model.StoredEmployee;

public class ChainedHashTable 
{
	LinkedList<StoredEmployee>[] chainedHashTable;
	
	public ChainedHashTable()
	{
		chainedHashTable = new LinkedList[10];
		
		for (int i = 0; i < chainedHashTable.length; i++) 
		{
			chainedHashTable[i] = new LinkedList<StoredEmployee>();
		}
	}
	
	public void put(String key, Employee value)
	{
		int hashKey = hashKey(key);
		chainedHashTable[hashKey].add(new StoredEmployee(key, value));
	}
	
	public Employee get(String key)
	{
		int hashKey = hashKey(key);
		ListIterator<StoredEmployee> iterator = chainedHashTable[hashKey].listIterator();
		StoredEmployee storedEmployee = null;
		
		while (iterator.hasNext()) 
		{	
			storedEmployee = iterator.next();
			if(storedEmployee.key.equals(key))
			{
				return storedEmployee.value;
			}
		}
		
		return null;
	}
	
	public Employee remove(String key)
	{
		int hashKey = hashKey(key);
		StoredEmployee storedEmployee = null;
		
		for (int i = 0; i < chainedHashTable[hashKey].size(); i++) 
		{
			storedEmployee = chainedHashTable[hashKey].get(i);
			if(storedEmployee.key.equals(key))
			{
				chainedHashTable[hashKey].remove(i);
				return storedEmployee.value;
			}
		}
		
		return null;
	}
	
	public void printHashTable()
	{
		for (int i = 0; i < chainedHashTable.length; i++) 
		{
			if(chainedHashTable[i].isEmpty())
			{
				System.out.println("Position " + i + " : empty");
			}
			else
			{
				ListIterator<StoredEmployee> iterator = chainedHashTable[i].listIterator();
				System.out.print("Position " + i + " : HEAD => ");
				while (iterator.hasNext()) 
				{
					System.out.print(iterator.next().value + " => ");
				}
				System.out.println("NULL");
			}
		}
	}
	
	private int hashKey(String key)
	{
		//return key.length() % chainedHashTable.length;
		
		return Math.abs(key.hashCode() % chainedHashTable.length);
	}
}
