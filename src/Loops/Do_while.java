package Loops;

import java.util.Scanner;

public class Do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch;
		do { 
			System.out.println("Welcome");
			System.out.println("Do you want me to print again type Y for Yes and N for No");
			 ch = sc.next().charAt(0);
		}while (ch == 'Y' || ch == 'y') ;
		sc.close();

	}

}
