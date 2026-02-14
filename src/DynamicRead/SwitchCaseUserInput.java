package DynamicRead;

import java.util.Scanner;

public class SwitchCaseUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a character from a-c : ");
		Scanner sc = new Scanner (System.in);
		char ch = sc.next().charAt(0);
		switch(ch) {
		case 'a' : System.out.println("A for Apple");
		 break ;
		case 'b' : System.out.println("B for Ball");
		 break ;
		case 'c' : System.out.println("C for Cat");
		 break;
		default : System.out.println("Out For Range");
		}
		sc.close();
		

	}

}
