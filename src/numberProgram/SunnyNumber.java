package numberProgram;

public class SunnyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int num = 145;
		int temp = num ;
		int fact = 1;
		int sum =0 ;
		
		
		while (temp!=0) {
			int lastDigit = temp %10 ;
			System.out.print("Factorial of "+ lastDigit + " : ");
			for (int i =1 ; i <=lastDigit; i++) {
				fact = fact *i ;
				
			}
			System.out.println(fact);
			sum+=fact;
			fact =1;

			System.out.println();
			temp = temp/10;
		}
		System.out.println(sum);
		if (num == sum) {
			System.out.println("Sunny Number");
		}
		else {
			System.out.println("Not a sunny number");
		}
		
		

	}

}
