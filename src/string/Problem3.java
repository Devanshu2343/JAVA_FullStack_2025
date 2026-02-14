package string;

//Reverse a String

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "0123456789" ;
		char[] ch1 = str1.toCharArray();
		int n = str1.length();
		
		for (int i = n-1 ; i >0 ; i--) {
			System.out.println(ch1[i]);
		}

	}

}
