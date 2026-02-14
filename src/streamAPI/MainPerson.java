package streamAPI;

import java.util.ArrayList;

class Person {
	private String name ;
	private int age ;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
}


public class MainPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Person> newPerson = new ArrayList<>();
		
		Person p1 = new Person();
		p1.setName("Avi");
		p1.setAge(12);
		
		Person p2 = new Person();
		p2.setName("Dev");
		p2.setAge(15);
		
		Person p3 = new Person();
		p3.setName("Alok");
		p3.setAge(16);
		
		Person p4 = new Person();
		p4.setName("Avisekh");
		p4.setAge(11);
		
		Person p5 = new Person();
		p5.setName("Ravi");
		p5.setAge(10);
		
		Person p6 = new Person();
		p6.setName("Ankit");
		p6.setAge(18);
		
		newPerson.add(p1);
		newPerson.add(p2);
		newPerson.add(p3);
		newPerson.add(p4);
		newPerson.add(p5);
		newPerson.add(p6);
		
		 newPerson.stream()
            .filter(person -> person.getName().startsWith("A"))
            .forEach(System.out::println);
		
	
		System.out.println("=======");
		   newPerson.stream()
		     .filter(person -> person.getAge() >14)
		     .forEach(System.out::println);
		
		
		

	}

}
