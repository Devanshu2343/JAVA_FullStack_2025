package numberProgram;

//sum of digits in java

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num  = 1236 ;
		int sum =0 ;
		
		while (num != 0) {
		    int digit = num % 10;
		    sum = sum + digit;
		    num = num / 10;
		} 
		
		System.out.println(sum);


	}

}
