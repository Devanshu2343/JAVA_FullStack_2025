package polymorpism;

//1. Employee Salary System
//
//Create a Java application for an organization where different employees have different salary calculations.
//Define a base class Employee with a method calculateSalary().
//Create subclasses like Developer, Manager, and Intern that override the method.
//Use runtime polymorphism to calculate salaries without knowing the employee type in advance.
//

class Employee{
	double salary =10000 ;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(double salary) {
		// TODO Auto-generated constructor stub
		this.salary = salary;
	}
	
	
	
	public void calculateSalary() {
		System.out.println("Base Salary of employee" + salary);
		
	}
}
class Developer extends Employee{
	public void calculateSalary() {
		System.out.println("Base Salary of employee" + 5*salary);
		
	}	
	
}
class Manager extends Employee{
	public void calculateSalary() {
		System.out.println("Base Salary of employee" + 5*salary);
		
	}
	
}

class Intern extends Employee{
	public void calculateSalary() {
		System.out.println("Base Salary of employee" + 5*salary);
		
	}
	
}

public class Polymorphism1 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
