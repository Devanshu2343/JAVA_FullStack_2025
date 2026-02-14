package string;

//mport jdk.internal.joptsimple.util.RegexMatcher;

//Count number of words
public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str  = "Hello     Buddy   Don't   sleep";
//		char[] c = str.toCharArray();
//		int count1 = 0;
//		for (int i = 0; i < c.length-1; i++) {
//			if(c[i] == ' ' && c[i+1] != ' ') {
//				count1++;
//			}
//		}
//		System.out.println(count1);
		
		String [] str1 =str.split(" ");
		int count = 0;
		for (int i = 0; i < str1.length; i++) {
			if(str1[i].isEmpty()) {
				continue;	
				}
			count++;
			System.out.println(str1[i]);	
		}
		System.out.println(count);
//		}
		
		
		
		
		
		
//		char[] ch = str.trim().toCharArray();
//
//		int count =0 ;
//		for (char c : ch) {
//			if (c == ' ') {
//				count++;
//			}
//		}
//		System.out.println(count);
//		
		
		

	}

}
