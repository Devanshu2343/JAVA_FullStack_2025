package DecisionMakingStatement;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter num : ");
		int num = sc.nextInt();
		
		if (num %5 ==0 && num  %11 ==0) {
			System.out.println("Number is divisible by both 5 and 11");
		}
		else {
			System.out.println("Num is not divisible by either of 5 0r 11 , or might not be divisible by any of themk");
		}
		sc.close();

	}

}
