package streamAPI;

import java.util.Arrays;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddAndEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> l1 = Arrays.asList(1,2,3,4,5,6,7,8,9,0,10,11,22,33,44,55,66,77,88,99,00);
		
		Map <Boolean, List<Integer>> res=
				l1.stream()
				.collect(Collectors.partitioningBy(n -> n % 2 == 0));
		System.out.println("Even" + res.get(true));
		System.out.println("odd" + res.get(false));

	}

}
