package DecisionMakingStatement;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter num1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2 : ");
		int num2 = sc.nextInt();
		System.out.println("Enter num3 : ");
		int num3 = sc.nextInt();
		
		if (num1> num3 ) {
			if ( num1 >num2)
			    System.out.println("num1 gratest");
			
		}
		
		if (num2> num3 ) {
			if ( num2 >num1)
			    System.out.println("num2 gratest");
			
		}
		
		if (num3> num1 ) {
			if ( num3 >num2)
			    System.out.println("num3 gratest");
			
		}

		sc.close();

	}

}
