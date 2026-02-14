package anonomousClass;

class Student{
	String name ;
	
	Student (){
		
	}
	Student (String name){
		this.name = name ;
	}
	
	void display() {
		System.out.println(this.name);
	}
	
}



public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student ("Ravi") {
			public void display() {
				System.out.println("Hello Everyone....!!!!!");
			}
		};
		
		s1.display();

	}

}
