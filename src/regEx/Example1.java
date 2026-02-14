package regEx;


public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//traditional method
		
		String s1 = "123abc" ;
		
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if(c >= '0' && c<='9') {
				continue;
			}else {
				System.out.println("Not a numeric string");
				break;
			}
			
		}
		
		

	}

}
