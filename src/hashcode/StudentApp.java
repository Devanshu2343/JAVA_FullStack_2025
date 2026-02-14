package hashcode;



class Student{
	String name ;
	int id ;
	
	Student(){
		
	}
	Student (String name , int id){
		this.name =name ;
		this.id = id ;
	}

	public boolean equals (Object o) {
		Student s = (Student)o ;
		if (this.name == s.name && this.id == s.id) {
			return true ;
		}
		return false ;
	}
	
	//overriding hasgCode() method
	public  int hashCode() {
		return this.name.hashCode() + id ;
		
		 
	}
	
	
}

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student ("Dev" , 1);
		Student s2 = new Student ("Devh" , 1) ;
		  
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.hashCode() == s2.hashCode());
		
		System.out.println(s1.getClass());
		
		
		

	}
	

}
