package com.study.linearProbing;

import com.study.model.Employee;

public class LinearProbHashTableMain {

	public static void main(String[] args) 
	{
		Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);
        
        /**
        Employee nine = new Employee("nine", "999999999", 9);
        Employee one = new Employee("one", "1", 1);
        Employee two = new Employee("two", "22", 2);
        Employee eight = new Employee("eight", "88888888", 8);
        Employee ten = new Employee("ten", "1010101010", 10);
        Employee three = new Employee("three", "333", 3);
        **/
        
        LinearProbHashTable lpht = new LinearProbHashTable();
        
        lpht.put("Jones", janeJones);
        lpht.put("Doe", johnDoe);
        lpht.put("Wilson", mikeWilson);
        lpht.put("Smith", marySmith);
        lpht.put("End", billEnd);
        
        /**
        lpht.put("999999999", nine);
        lpht.put("1", one);
        lpht.put("22", two);
        lpht.put("88888888", eight);
        lpht.put("1010101010", ten);
        lpht.put("333", three);
        **/
        
        lpht.printHashTable();
        System.out.println("-----------------##################################################################------------------");
        
        lpht.remove("Jones");
        lpht.remove("Wilson");
        
        lpht.printHashTable();
        System.out.println("-----------------##################################################################------------------");
        
        System.out.println(lpht.get("Smith"));
	}

}
