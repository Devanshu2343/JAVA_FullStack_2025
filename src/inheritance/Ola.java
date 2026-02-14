package inheritance;

import java.util.Scanner;

public class Ola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("Select Cab");
		System.out.println("1 : Mini");
		System.out.println("2 : Sedan");
		System.out.println("3 : Luxury");
		
		int choice =sc.nextInt();
		
		Cab c = null;
		
		
		switch (choice) {
		case 1: {
			c = new Mini();
		}
		break;
		case 2: {
			 c = new Sedan();
			
		}
		break;
		case 3 : {
		 c = new Luxury();
			
		}
		break;
		
		default : {
			System.out.println("Invalid Input");
		}
		}
		System.out.println(c);
		sc.close();

	}

}
