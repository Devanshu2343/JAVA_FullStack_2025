package classProgram;

import java.util.Arrays;

public class Program1 {
    public static void main(String[] args) {

       
        Student s1 = new Student("Rahul", 1, "REG101");
        Student s2 = new Student("Priya", 2, "REG102");
        Student s3 = new Student("Aman", 3, "REG103");
        Student s4 = new Student("Sneha", 4, "REG104");

       
        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }

}


class Student {

    String name;
    int rollNo;
    String regNo;

    
    Student(String name, int rollNo, String regNo) {
        this.name = name;
        this.rollNo = rollNo;
        this.regNo = regNo;
    }

    
    void display() {
        System.out.println("Name    : " + name);
        System.out.println("Roll No : " + rollNo);
        System.out.println("Reg No  : " + regNo);
        System.out.println("----------------------");
    }
}

