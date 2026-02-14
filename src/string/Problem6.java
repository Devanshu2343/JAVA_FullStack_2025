package string;
//Count number of characters

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello Buddy" ;
		String str1  = str.toLowerCase();
		int count =0 ;
		char [] ch = str1.toCharArray();
		for (char c : ch) {
			if (c>= 'a' && c<='z') {
				count++ ;
			}
		}
		System.out.println(count);

	}

}
