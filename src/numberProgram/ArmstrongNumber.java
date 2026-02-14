package numberProgram;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =154 ;
		int temp = num ;
		int sum = 0 ;
		while(temp !=0 ) {
			int lastDigit = temp %10 ;
			sum = sum + (lastDigit * lastDigit * lastDigit);
			temp = temp/10;
			
		}
		System.out.println(sum);
		if (num == sum) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not a Armstrong Number");
		}

	}

}
