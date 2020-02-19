package com.study.chainHash;

import com.study.model.Employee;

public class ChainedHashTableMain {

	public static void main(String[] args) 
	{
		Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);
        
        ChainedHashTable chainedHashTable = new ChainedHashTable();
        
        chainedHashTable.put("Jones", janeJones);
        chainedHashTable.put("Doe", johnDoe);
        chainedHashTable.put("Wilson", mikeWilson);
        chainedHashTable.put("Smith", marySmith);
        chainedHashTable.put("End", billEnd);
        
        chainedHashTable.printHashTable();
        System.out.println("-----------------##################################################################------------------");
        
        System.out.println(chainedHashTable.get("Smith"));
        System.out.println("-----------------##################################################################------------------");
        
        System.out.println(chainedHashTable.remove("Jones"));
        System.out.println("-----------------##################################################################------------------");
        
        chainedHashTable.printHashTable();
	}

}
