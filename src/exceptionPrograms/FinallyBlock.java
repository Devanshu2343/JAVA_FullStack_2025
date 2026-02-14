package exceptionPrograms;

import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a : ");
		int a = sc.nextInt();
		System.out.println("Enter b :");
		int b = sc.nextInt();
		
	
		sc.close();
		
		try {
			int res = a/b ;
			System.out.println(res);
		}
		catch(Exception e) {
			System.out.println("Caught");
		}
		finally {
			System.out.println("Hiiie");
		}

	}

}
