package regEx;

public class AlphabetRegEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abc";
		System.out.println(s1.matches("[a-z]+"));
		System.out.println(s1.matches("[a-z]"));
		
		String s2 = "a";
		System.out.println(s2.matches("[a-z]"));
		
		System.out.println("--------------------------");
		String s3 = "ABC";
		System.out.println(s3.matches("[A-Z]+"));
		
		System.out.println("--------------------------");
		String s4 = "ABCabz";
		System.out.println(s4.matches("[a-zA-Z]+"));
		System.out.println(s4.matches("^[a-zA-Z]+$"));
		
		System.out.println("--------------------------");
		String s5 = "ABCabz24";
		System.out.println(s5.matches("^[0-9a-zA-Z]+$"));
		
		System.out.println("--------------------------");
		String s6 = "abz24@gmail.com";
		System.out.println(s6.matches("^[a-z0-9.@]+$"));
		


	}

}


