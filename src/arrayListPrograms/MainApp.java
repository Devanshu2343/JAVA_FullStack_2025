package arrayListPrograms;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

class Student {

    String name;
    int roll;

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", roll=" + roll + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Student s = (Student) obj;
        return roll == s.roll && name.equals(s.name);
    }
}

public class MainApp {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Dev", 2));
        students.add(new Student("Devanshu", 12));
        students.add(new Student("Jack", 21));

        System.out.println(students);

        Student keyElement = new Student("Dev", 2);
        System.out.println(students.contains(keyElement)); // TRUE

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll number: ");
        int id = sc.nextInt();

        ListIterator<Student> i = students.listIterator();
        boolean notFound = true;

        while (i.hasNext()) {
            Student temp = i.next();
            if (temp.roll == id) {
                notFound = false;
                System.out.println("Student Exists");
                System.out.println("Student Name: " + temp.name);
                break;
            }
        }

        if (notFound) {
            System.out.println("Student not in the list");
        }

        sc.close();
    }
}












//package arrayListPrograms;
//
//import java.util.ArrayList;
//import java.util.ListIterator;
//import java.util.Scanner;
//
//class Student {
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "Student [name" + name + ", id=" + roll + "]";
//	}
//	String name ;
//	int roll ;
//	
//	Student(){
//		
//	}
//	@Override
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		return super.equals(obj);
//	}
//	Student(String name , int roll){
//		this.name = name ;
//		this.roll = roll ;
//	}
//}
//
//public class MainApp {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ArrayList students  = new ArrayList();
//		students.add(new Student("Dev" , 2)) ;
//		students.add(new Student("Devanshu" , 12)) ;
//		students.add(new Student("Jack" , 21)) ;
//		System.out.println(students);
//		
//		Object keyElement  = new Student ("Dev" , 2) ;
//		System.out.println(students.contains(keyElement));
//		
//		Scanner sc = new Scanner (System.in);
//		int id = sc.nextInt();
//		
//		ListIterator i = students.listIterator();
//		boolean notFound = true ;
//		
//		while(i.hasNext()) {
//			Student temp = (Student)i.next();
//			if(temp.id == id) {
//				notFound = false;
//				System.out.println("Student Exists");
//				System.out.println("Student Name" + temp.name);
//			}
//		}
//		if (notFound) {
//			System.out.println("Student not in the list");
//		}
//		
//		
//		
//
//	}
//
//}
