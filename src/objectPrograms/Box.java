package objectPrograms;

class Box {
//	non static variables
	double length ;
	double breadth ;
	
//	Constructor
	Box(double length , double breadth){
		this.length = length ;
		this.breadth = breadth ;
		
	}
//	non-static method
	public double getArea() {
		return length*breadth;
	}
	

}
 