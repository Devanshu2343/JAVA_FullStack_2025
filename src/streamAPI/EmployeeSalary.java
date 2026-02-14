// use of map and filter
package streamAPI;

import java.util.Arrays;
import java.util.List;

public class EmployeeSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> l1 = Arrays.asList(1000, 2000,2500 ,5600, 4300, 7800,5800,900,560);
		
		l1.stream()
		.filter(n -> n>1500)
		.map(n -> n + (n*0.1))
		.sorted()
		.forEach(System.out::println);
		

	}

}
