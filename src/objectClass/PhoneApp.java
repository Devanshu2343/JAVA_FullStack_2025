package objectClass;

class Phone {
	int ram ;
	int rom ;
	
	Phone(int ram , int rom){
		this.ram =ram ;
		this.rom = rom;
	}
	
	public String toString() {
		return  "Phone --> [ Ram : " +ram +" , Rom : " + rom + "]" ;
		
	}
}

public class PhoneApp {
	public static void main (String[] args) {
		Phone p1 = new Phone(5,5);
		 System.out.println(p1);
	}

	
	

}
 
