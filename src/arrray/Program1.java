package arrray;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int [5] ;
		int n = arr.length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements of the array : ");
		for(int i =0 ; i < n ;i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i=0 ; i<n ;i++) {
			if (arr[i]%5 ==0) {
				System.out.println(arr[i]);
			}
		}
		sc.close();

	}

}
