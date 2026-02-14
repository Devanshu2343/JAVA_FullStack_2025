package numberProgram;

public class FactorOfEachDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 120 ;
		
		while (num!=0) {
			int lastDigit = num %10 ;
			System.out.print("Factors of "+ lastDigit + " : ");
			for (int i =1 ; i <=lastDigit; i++) {
				if (num % i ==0) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
			num = num/10;
		}

	}

}
