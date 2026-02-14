package objectClass;

class Phones {
	int ram ;
	int rom ;
	
	Phones(int ram , int rom){
		this.ram =ram ;
		this.rom = rom;
	}
	
	public String toString() {
		return  "Phone --> [ Ram : " +ram +" , Rom : " + rom + "]" ;
		
	}
}

public class PhoneApp2 {
	public static void main (String[] args) {
		
		Phones [] arr = new Phones[5] ;
		arr[0]= new Phones(5,5);
		arr[1] = new Phones(51,5);
		arr[2] = new Phones(5,51);
		arr[3] = new Phones(511,5);
		arr[4] = new Phones(5,115);
		
		for (int i =0 ; i < 5 ; i++) {
			System.out.println(arr[i]);
		}
	}

	
	

}
 
