package com.study.model;

public class Employee 
{
	private String firtstName;
	
	private String lastName;
	
	private int id;

	public Employee(String firtstName, String lastName, int id) {
		this.firtstName = firtstName;
		this.lastName = lastName;
		this.id = id;
	}

	public String getFirtstName() {
		return firtstName;
	}

	public void setFirtstName(String firtstName) {
		this.firtstName = firtstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [firtstName=" + firtstName + ", lastName=" + lastName + ", id=" + id + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firtstName == null) ? 0 : firtstName.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (firtstName == null) {
			if (other.firtstName != null)
				return false;
		} else if (!firtstName.equals(other.firtstName))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}
	
	
}
