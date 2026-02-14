package DecisionMakingStatement;

public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int side1 = 2 ;
		int side2 = 2;
		int side3 = 2 ;
		if (side1 == side2 && side1 == side3) {
			System.out.println("Equilateral Triangle");
		}
		else if (side1 == side2 || side2 ==side3 || side3 == side1) {
			System.out.println("Isosceles Triangle");
		}
		else {
			System.out.println("Scalene Triangle");
		}

	}

}
