package method;

public class NoArgumentMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		areaOfCircle();
		areaOfSquare();
		areaOfTriangle();

	}
	public static void areaOfCircle() {
		int radius = 4 ;
	    double pie  =3.14159265359 ;
	    double area = 2 * pie * radius;
	    System.out.println("Area of Circle : " + area);
	}
	
	public static void areaOfSquare() {
		int side = 4 ;
	    int  area = side * side;
	    System.out.println("Area of Square : " + area);
	}
	
	public static void areaOfTriangle() {
		int base = 4 ;
		int height = 3 ;
	    int  area =(int) (0.5 *base * height);
	    System.out.println("Area of Triangle : " + area);
	}

}
