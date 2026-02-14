package objectClass;



class Students{
	String name ;
	int id ;
	
	Students(){
		
	}
	Students (String name , int id){
		this.name =name ;
		this.id = id ;
	}
	
	//overriding equals(object) method to compare properties of object
	// Downcasting done to access member of child class as Object is parent class
	public boolean equals(Object o) {
		Students s = (Students ) o;
		if (this.name == s.name && this.id == s.id) {
			return true ;
		}
		return false ;
	}
	
}

public class StudentApp2 {
	public static void main(String[] args) {
		Students s1 = new Students ("Kavya" , 11) ;
		Students s2 = new Students ("Kavya" , 11) ;
		
//		multiple var pointing to same memory block
		Students s3 =s1 ;
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
	}

}
