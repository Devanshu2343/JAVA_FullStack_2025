package string;

//Find length of a String (without using length())

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a  = new String ("0123456789");
		char [] b = a.toCharArray();
		int count = 0 ;
		for (char c : b) {
			System.out.print(c +" ");
			count++ ;
		}
		System.out.println();
		 System.out.println("Length : " + count);
	    

	}

}
