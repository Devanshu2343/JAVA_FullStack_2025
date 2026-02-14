package DynamicRead;

import java.util.Scanner;

public class UserName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Username : ");
		Scanner sc = new Scanner (System.in);
		String name = sc.nextLine();
		
		System.out.println("Username : " +name);
		sc.close();

	}

}
