package numberProgram;

public class NeonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sum of square of digit = sum of digit
		int num  = 9 ;
		int sum =0 ;
		int squareOfNum = num *num;
		int sumOfSquare =0 ;
		
		while (num != 0) {
		    int digit = num % 10;
		    sum = sum + digit;
		    
		    num = num / 10;
		} 
		
		while ( squareOfNum != 0) {
		    int digit =  squareOfNum % 10;
		    sumOfSquare = sumOfSquare + digit;
		    
		    squareOfNum =  squareOfNum / 10;
		} 
		
		System.out.println(sum);
		System.out.println(sumOfSquare);
		if (sum == sumOfSquare) {
			System.out.println("Neon Number");
		}
		else {
			System.out.println("Not a neon number");
		}
		

	}

}
