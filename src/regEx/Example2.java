package regEx;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "1";
		String s2 = "12" ;
		
		// check if string conatins one digit
		System.out.println(s1.matches("\\d"));
		System.out.println(s2.matches("\\d"));
		
		System.out.println("===============");
		
		String s3 = "123" ;
		System.out.println(s3.matches("\\d+"));
		
       System.out.println("===============");
		
		String s4 = "" ;
		System.out.println(s4.matches("\\d*"));
		 System.out.println("===============");
		
		String s5 = "12345678" ;
		System.out.println(s5.matches("^\\d+$"));
		 
		
		String s6 = "12345678a" ;
		System.out.println(s6.matches("^\\d+$"));
		System.out.println("===============");
		
		String s7 = "123" ;
		System.out.println(s7.matches("\\d{3}"));
	
		
		String s8 = "1234" ;
		System.out.println(s8.matches("^\\d{3}"));
		System.out.println("===============");
		
		String s9 = "12345" ;
		System.out.println(s9.matches("^\\d{4,8}"));
		System.out.println("===============");
		
		String ss1 = "10.5";
		System.out.println(ss1.matches("^\\d+\\.\\d$"));
		
		String ss2 = "1.5";
		System.out.println(ss2.matches("^\\d\\.\\d$"));
		System.out.println("===============");
		
		String ss3 = "1563.87";
		System.out.println(ss3.matches("^\\d{3,6}\\.\\d{1,4}$"));
		
		

	}

}
