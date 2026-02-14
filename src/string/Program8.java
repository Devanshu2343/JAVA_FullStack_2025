package string;

//Convert String to uppercase & lowercase

public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Helllo" ;
		char[] ch = str.toCharArray();
		
		for (int i =0 ; i <ch.length ;i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
				ch[i] = (char)(ch[i]-32);
			}
		}
		String str1 = new String(ch);
		System.out.println(str1);
		
		System.out.println(str1.toLowerCase());

	}
	
	

}
