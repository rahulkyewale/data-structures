package com.study.arrayHashTable;

import com.study.model.Employee;

public class SimpleHashTable 
{
	private Employee[] hashTable;
	
	public SimpleHashTable()
	{
		hashTable = new Employee[10];
	}
	
	public void put(String key, Employee value)
	{
		int hashKey = hashKey(key);
		if(hashTable[hashKey] != null)
		{
			System.out.println("Sorry, there is already employee at position -> "+hashKey);
		}
		else
		{
			hashTable[hashKey] = value;
		}
	}
	
	public Employee get(String key)
	{
		int hashKey = hashKey(key);
		return hashTable[hashKey];
	}
	
	private int hashKey(String key)
	{
		return key.length() % hashTable.length;
	}
	
	public void printHashTable()
	{
		for (int i = 0; i < hashTable.length; i++) 
		{
			System.out.println(hashTable[i]);
		}
	}
}
