package genricAndCollectionFramework;




import java.util.ArrayList ;
import java.util.Collections;
import java.util.List;

public class StudentPerformance {
    public static void main (String[] args){
        List<Student> s = new ArrayList<>();
         s.add(new Student(101, "Alice", 85));
        s.add(new Student(102, "Bob", 72));
        s.add(new Student(103, "Charlie", 90));
        s.add(new Student(104, "Diana", 78));

        System.out.println(" Students before sorting:");
        for (Student st : s) {
            System.out.println(st);
        }
        System.out.println();
        Collections.sort(s);

        System.out.println("Students after sorting (by marks ascending):");
        for (Student st : s) {
            System.out.println(st);
        }
    }
}

class Student implements Comparable<Student> {
    private int rollNo ;
    private String name ;
    private int marks ;

     Student (int rollNo , String name , int marks){
        this.rollNo= rollNo ;
        this.name = name ;
        this.marks = marks ;
    }
     public int getRollNo(){
        return rollNo ;
     }
     public String getName(){
        return name ;

     }
     public int getMarks(){
        return marks;
     }
     public int compareTo (Student s){
        return (int)this.marks  - (int)s.marks ;
     }
     public String toString(){
        return "RollNo: " + rollNo + ", Name: " + name + ", Marks: " +marks ;
     }



}