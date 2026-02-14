package arrray;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[4];
		System.out.println("Enter the element of Array : ");
		Scanner sc = new Scanner(System.in);
		 for (int i =0 ; i <=arr.length-1 ; i++) {
			   arr[i] = sc.nextInt() ;
		 }
		 for (int i =0 ; i<=arr.length-1;i++) {
			 System.out.println(arr[i]);
		 }
		 sc.close();

	}

}
