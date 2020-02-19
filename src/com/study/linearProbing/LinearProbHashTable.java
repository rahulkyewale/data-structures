package com.study.linearProbing;

import com.study.model.Employee;
import com.study.model.StoredEmployee;

public class LinearProbHashTable 
{
	private StoredEmployee[] hashTable;
	
	public LinearProbHashTable()
	{
		hashTable = new StoredEmployee[10];
	}
	
	public void put(String key, Employee value)
	{
		int hashKey = hashKey(key);
		int stopIndex = hashKey;
		
		do
		{
			if(!ouccipied(hashKey))
			{
				hashTable[hashKey] = new StoredEmployee(key, value);
				return;
			}
			
			hashKey = (hashKey + 1) % hashTable.length;
		}
		while(hashKey != stopIndex);
		
		System.out.println("Sorry, there is already employee at position -> "+hashKey);
	}
	
	public Employee get(String key)
	{
		int hashKey = findKey(key);
		
		if(hashKey != -1)
		{
			return hashTable[hashKey].value;
		}
		
		return null;
	}
	
	public Employee remove(String key)
	{
		int hashKey = findKey(key);
		
		if(hashKey != -1)
		{
			Employee removedEmployee = hashTable[hashKey].value;
			hashTable[hashKey] = null;
			
			StoredEmployee[] newHashTable = hashTable;
			
			hashTable = new StoredEmployee[newHashTable.length];
			
			for (int i = 0; i < newHashTable.length; i++) 
			{
				if(newHashTable[i] != null)
				{
					put(newHashTable[i].key, newHashTable[i].value);
				}
				else
				{
					hashTable[i] = null;
				}
			}
			
			return removedEmployee;
		}
		
		return null;
	}
	
	private int hashKey(String key)
	{
		return key.length() % hashTable.length;
	}
	
	public void printHashTable()
	{
		for (int i = 0; i < hashTable.length; i++) 
		{
			if(hashTable[i] != null)
			{
				System.out.println("Position number : "+i+" => "+hashTable[i].value);
			}
			else
			{
				System.out.println("Position number : "+i+" => "+hashTable[i]);
			}
		}
	}
	
	private boolean ouccipied(int hashKey)
	{
		return hashTable[hashKey] != null;
	}
	
	private int findKey(String key)
	{
		int hashKey = hashKey(key);
		int stopIndex = hashKey;
		
		do
		{
			if(hashTable[hashKey] != null && key.equals(hashTable[hashKey].key))
			{
				return hashKey;
			}
			
			hashKey = (hashKey + 1) % hashTable.length;
		}
		while(hashKey != stopIndex && hashTable[hashKey] != null);
		
		return -1;
	}
}
