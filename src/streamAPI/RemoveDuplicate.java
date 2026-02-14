package streamAPI;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String > l1 = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
		
		l1.stream()
		.distinct()
		.sorted((a, b) -> b.compareTo(a))
		.forEach(System.out::println);
		

	}

}
