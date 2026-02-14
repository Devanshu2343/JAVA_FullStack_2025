//use of map
package streamAPI;

import java.util.ArrayList;
import java.util.List;

public class MultiplyBy4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> l1 = new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(60);
		
		l1.stream()
		.map(n -> n *4)
		.forEach(System.out::println);

		
		

	}

}
