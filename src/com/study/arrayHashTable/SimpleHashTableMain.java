package com.study.arrayHashTable;

import com.study.model.Employee;

public class SimpleHashTableMain {

	public static void main(String[] args) 
	{
		Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);
        
        SimpleHashTable ht = new SimpleHashTable();
        
        ht.put("Jones", janeJones);
        ht.put("Doe", johnDoe);
        ht.put("Wilson", mikeWilson);
        ht.put("Smith", marySmith);
        ht.put("End", billEnd);
        
        ht.printHashTable();
        
        System.out.println(ht.get("Wilson"));
	}

}
