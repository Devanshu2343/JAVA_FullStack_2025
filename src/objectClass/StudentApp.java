package objectClass;



class Student{
	String name ;
	int id ;
	
	Student(){
		
	}
	Student (String name , int id){
		this.name =name ;
		this.id = id ;
	}
	

	
}

public class StudentApp {
	public static void main(String[] args) {
		Student s1 = new Student ("Kavya" , 11) ;
		Student s2 = new Student ("Kavya" , 11) ;
		
//		multiple var pointing to same memory block
		Student s3 =s1 ;
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
	}

}
