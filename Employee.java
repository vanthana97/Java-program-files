package com.emp;

public class Employee {
  
	public String name;
	public double sal;
	public int empid;
	@Override
	public String toString() {
		return "Employee [name=" + name + ", sal=" + sal + ", empid=" + empid + "]";
	}
	public Employee(String name, double sal, int empid) {
		super();
		this.name = name;
		this.sal = sal;
		this.empid = empid;
	}
	
}
