package numberProgram;

public class ProductOfAllDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12349 ;
		int product = 1 ;
		while (num !=0) {
			int lastDigit  = num %10 ;
			product = product* lastDigit ;
			num= num/10 ;
		}
		System.out.println(product);
		

	}

}
