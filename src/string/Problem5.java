package string;

//Count vowels and consonants
public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str  = "Hello Buddy" ;
		String str1 = str.toLowerCase();
		char [] ch  = str1.toCharArray();
//		int n = str.length()-1;
		int cons =0 ;
		int vow =0 ;
		int space = 0;
	    for (char c : ch ) {
	    	if (c == 'a' || c == 'e' ||  c == 'i' || c == 'o' || c =='u' ) {
	    		cons ++ ;
	    	}else if (c == ' '){
	    		space ++ ;
	    		
	    	}
	    	else {
	    		vow ++ ;
	    	}
	    }
		System.out.println(cons);
		System.out.println(vow);
		System.out.println(space);

	}

}
