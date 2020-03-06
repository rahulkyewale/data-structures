package com.study.circularLinkedList;

import com.study.model.Employee;

public class EmployeeNode 
{
	private Employee field;
	
	private EmployeeNode next;
	
	public EmployeeNode(Employee employee)
	{
		this.field = employee;
	}

	public Employee getField() {
		return field;
	}

	public void setField(Employee field) {
		this.field = field;
	}

	public EmployeeNode getNext() {
		return next;
	}

	public void setNext(EmployeeNode next) {
		this.next = next;
	}
	
	public String toString()
	{
		return field.toString();
	}
}
