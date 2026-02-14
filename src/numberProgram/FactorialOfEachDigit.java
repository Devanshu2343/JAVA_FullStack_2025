package numberProgram;

public class FactorialOfEachDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 211012;
		int temp = num ;
		int fact = 1;
		
		
		while (temp!=0) {
			int lastDigit = temp %10 ;
			System.out.print("Factorial of "+ lastDigit + " : ");
			for (int i =1 ; i <=lastDigit; i++) {
				fact = fact *i ;
				
			}
			System.out.println(fact);
			fact = 1;
			

			System.out.println();
			temp = temp/10;
		}

		
		
		
	}

}
