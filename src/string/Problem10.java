package string;

//Remove spaces from a String

public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Today  is  sunday ! ! !   ! !!!!  " ;
		String res ="";
		char [] ch = str.toCharArray();
		for (int i =0 ; i < ch.length; i++) {
		  if(ch[i] != ' ') {
			  res = res+ch[i];
		  }
		}
		System.out.println(res);

	}

}
