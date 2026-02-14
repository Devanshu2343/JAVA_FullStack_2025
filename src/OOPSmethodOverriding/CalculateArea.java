package OOPSmethodOverriding;

class Circle extends Area{
	int rad ;
	Circle(){	
	}
	Circle(int rad){
		this.rad= rad ;
	}
	
	@Override
	public void totalArea() {
		double area  = 3.14 *rad *rad ;
//		super.totalArea();
		System.out.println("Area of Circle : " + area);
	}
	
}

class Square extends Area{
	int side ;
	Square() {	
	}
	Square(int side) {
		
		this.side= side;
	}
	
	@Override
	public void totalArea() {     
//		super.totalArea();
		double area = side * side ;
		System.out.println("Area of Square : " + area);
	}
	
}

class Triangle extends Area{
	int base ;
	int height ;
	Triangle(){	
	}
	Triangle(int base , int height){
		this.base = base ;
		this.height = height ;
	}
	
	@Override
	public void totalArea() {
		
//	 	super.totalArea();
		double area = 0.5 * base * height;
		
		System.out.println("Area of Triangle : " + area);
	}	
}

class Area{
	public void totalArea() {
		System.out.println("Area of shape  : ");
	}
	
}

public class CalculateArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area a1 = new Triangle (3,4) ;
		a1.totalArea();
		Area a2 = new Circle (3);
	    a2.totalArea();
		Area a3 = new Square (5);
		a3.totalArea();
		

	}

}
