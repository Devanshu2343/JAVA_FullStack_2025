//a program to print no greater than 10 from list
package streamAPI;

import java.util.ArrayList;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(0);
		l1.add(7);
		l1.add(23);
		l1.add(89);
		
		System.out.println(l1);
		System.out.println("=========");
		
		 l1.stream()
				.filter(n -> n >10)
				.forEach(System.out::println);
		
		
		
		
		

	}

}
