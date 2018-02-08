package com.demo.beans;

public class EmployeeBeans implements Comparable<EmployeeBeans> {
	private int id;
	private String name;
	private String salary;

	public EmployeeBeans() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeBeans(int id, String name, String salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeBeans [id=" + id + ", name=" + name + ", salary="
				+ salary + "]";
	}

	@Override
	public int compareTo(EmployeeBeans o) {
		if (this.getId() > o.getId())
			return 1;
		else
			return -1;
	}

}
