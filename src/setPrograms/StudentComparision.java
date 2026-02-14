package setPrograms;

import java.util.Comparator;
import java.util.TreeSet;

class Student {
	String name ;
	int roll ;
	Student(){
		
	}
	
	
	Student(String name , int roll){
		this.name = name ;
		this.roll = roll;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + "]";
	}
	
}
//
class StudentComparator implements Comparator<Student>{
	@Override
	public int compare(Student o1 , Student o2) {
		return o1.roll - o2.roll ;
		
	}
}

public class StudentComparision {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet <Student> set= new TreeSet<>(new StudentComparator());
		set.add(new Student("Raj" ,2));
		set.add(new Student("Avi" , 7));
		set.add(new Student("Sam" , 9));
		set.add(new Student("Dikshit" , 2));
		set.add(new Student("AviRaj" , 17));
		set.add(new Student("Harry" , 71));
		set.add(new Student("Harry" , 71));
		System.out.println(set);
		
	
		
		

	}

}
