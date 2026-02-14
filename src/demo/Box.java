package demo;

public class Box {
	double length ;
	
	
	Box(){
		
	}
	
	Box(double length){
		this.length = length;
	}
	
	// public method  or factory method 
	public static Box createBox() {
		return new Box() ;
	}
	public static Box createBox(double length) {
		return new Box(length) ;
	}

}
