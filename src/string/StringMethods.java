package string;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "hello" ;
		//length()
		System.out.println(s1.length());
		
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.startsWith("h"));
		System.out.println(s1.endsWith("o"));
		System.out.println(s1.charAt(0));
		
		char[] c = s1.toCharArray();
		System.out.println(c);
		
		String s2 = "Hii Hello Bye" ;
		String[] arr= s2.split(" ");
		for (int i =0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
		String x  = "HIIIII" ;
		System.out.println(x.concat("Everyone"));
		
		System.out.println(s1.substring(2));
		
		System.out.println(s1.substring(2,4));
		

	}

}
