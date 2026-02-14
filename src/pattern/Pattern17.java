package pattern;

public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =4 ;
		for (int i =1 ; i <=n ;i++) {
			for (int j =1 ; j <=n*2 ; j++) {
				if (i <=j && i+j<=n*2) {
					System.out.print("*" + " ");
				}else {
					System.out.print( "  ");
				}
			}
			System.out.println();
		}

	}

}
