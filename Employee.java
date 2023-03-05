package com.seed.inDemo;

public class Employee {
	String name,design,degree;
	int age,empId;
	double salary;
	
	public Employee(String name,String design,String degree,int age,int empId,double salary)
	{
		super();
		this.name=name;
		this.design=design;
		this.degree=degree;
		this.age=age;
		this.empId=empId;
		this.salary=salary;
	}
	public double CalSal()
	{
		return salary;
	}
	public void attendence()

	{
		System.out.println("Attendence for an Employee:");
	}	
	public void work()
	{
		System.out.println("Employee is working");
	}
	public void performance()
	{
		System.out.println("Employee is performance well");
	}
}
