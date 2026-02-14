package arrayListPrograms;

import java.util.ArrayList;
import java.util.Collections;

class Animal implements Comparable<Animal>{
	String name ;
	int age;
	
	Animal(){
		
	}
	Animal (String name , int age){
		this.name = name ;
		this.age = age ;
	}
	
	
	
	@Override
	public int compareTo(Animal o) {
		// TODO Auto-generated method stub
		
		return this.name.compareTo(o.name);
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}
	
	
	
}

public class SortingUsingComparable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   ArrayList <Animal> al = new ArrayList<>();
	   al.add(new Animal("Horse" , 3));
	   al.add(new Animal ("Dog",2));
	   al.add(new Animal("Cat",3));
	   
	   Collections.sort(al);
	   System.out.println(al);
	   
	   
		

	}

}
