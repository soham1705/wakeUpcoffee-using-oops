package com.seed.inDemo;

public class Exe {
	public static void main(String args[]) {
		Manager m = new Manager("Soham patankar","project Manager","Developer",22,786,50000.00,
				"Employee Management System",10,10000.00);
		
		System.out.println(m);
		System.out.println("name:"+m.name);
		System.out.println("design:" +m.design);
		System.out.println("degree: "+m.degree);
		System.out.println("age:"+m.age);
		System.out.println("salary :"+m.salary);
		
	}
	

}
