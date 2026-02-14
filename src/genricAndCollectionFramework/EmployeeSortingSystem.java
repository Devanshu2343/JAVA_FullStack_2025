package genricAndCollectionFramework;



	import java.util.ArrayList ;
	import java.util.Collections;
	import java.util.List;
	public class EmployeeSortingSystem {
	    public static void main (String [] args ){
	        List <Employee> emp = new ArrayList<>();
	        emp.add(new Employee(201, "John", 50000.0));
	        emp.add(new Employee(103, "Emma", 75000.0));
	        emp.add(new Employee(150, "Liam", 62000.0));
	        emp.add(new Employee(120, "Olivia", 58000.0)); 
	    
	     System.out.println("Employees before sorting:");
	        for (Employee e : emp) {
	            System.out.println(e);
	        }
	        System.out.println(); 
	        Collections.sort(emp);

	        System.out.println("Employees after sorting:");
	        for (Employee e : emp) {
	            System.out.println(e);
	        }

	}
	}
	class Employee implements Comparable<Employee> {
	    private int id ;
	    private String name  ;
	    private double salary ;

	    public Employee (int id , String name , double salary){
	        this.id = id ;
	        this.name = name ;
	        this.salary = salary ;
	    }

	    public int getId (){
	        return id ;
	    }
	    public String getName (){
	        return name ;
	    }
	    public double getSalary (){
	        return salary ;
	    }
	    public int compareTo (Employee o ){
	        return this.id - o.id ;
	    }
	    public String toString() {
	        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
	    }
	}
