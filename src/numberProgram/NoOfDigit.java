package numberProgram;

public class NoOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num  = 123678 ;
		int count =0 ;
		
		while (num != 0) {
		    count++;
		    num = num / 10;
		} 
		
		System.out.println(count);

	}

}
