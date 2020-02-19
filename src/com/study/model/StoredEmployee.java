package com.study.model;

public class StoredEmployee 
{
	public String key;
	
	public Employee value;

	public StoredEmployee(String key, Employee value) {
		this.key = key;
		this.value = value;
	}
}
