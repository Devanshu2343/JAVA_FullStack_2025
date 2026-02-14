package numberProgram;

public class SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num  = 123 ;
		int temp = num ;
		int sum =0 ;
		int product =1 ;
		
		while (temp != 0) {
		    int digit = num % 10;
		    sum = sum + digit;
		    temp = temp / 10;
		} 
		temp = num;
		
		while (temp !=0) {
			int lastDigit  = num %10 ;
			product = product* lastDigit ;
			temp= temp/10 ;
		}
		
		if (sum == product) {
			System.out.println("Spy Number");
		}
		else {
			System.out.println("Not a spy Number");
		}
		

	}

}
