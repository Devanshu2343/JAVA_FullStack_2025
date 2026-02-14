package string;

//Check if String is Palindrome

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "1234321";
		int n = str.length()-1;
		boolean isPalindrome = true ;
		int i =0 ;
		while(i < n) {
			if(str.charAt(i) != str.charAt(n)) {
			   isPalindrome = false ;
			   break ;
			}
			i++;
			n--;
			
		}
		System.out.println(isPalindrome);

	}

}
