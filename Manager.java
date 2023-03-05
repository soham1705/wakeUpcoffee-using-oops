package com.seed.inDemo;

public class Manager extends Employee 
{
	String projectName;
	int teamMember;
	double incentive;
	
	public Manager(String name,String design,String degree,int age,int empId,double salary,
		String projectName, int teamMember,double incentive	) {
		super(name,design,degree,age,empId,salary);
		this.projectName=projectName;
		this .teamMember=teamMember;
		this.incentive=incentive;
	}

}
