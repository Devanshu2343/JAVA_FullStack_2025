package inheritance;

public class Son extends Father{
	String name = "abc" ;
	
	public void display() {
		System.out.println("Father Name : "  + super.name);
		System.out.println("Name : "  + this.name);
	}
	
	public static void main (String[] args) {
		Son s1 = new Son();
		s1.display();
	}

}
