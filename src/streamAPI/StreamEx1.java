package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

public class StreamEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
		System.out.println("===========================");
		
		//stream()
		al.stream().forEach(System.out::println);
		System.out.println("===========================");
		
		List <String> names  = Arrays.asList("Shrddha" , "Kavya" , "Ravi" , "Dikshit");
		names.stream().forEach(System.out::println);
		System.out.println("===========================");
		
		//count()
		long count = names.stream()
				.count();
		System.out.println(count);
		System.out.println("===========================");
		
		//filter()
		names.stream()
		    .filter(s -> s.length() >5)
		    .forEach(System.out::println);
		System.out.println("===========================");
		
		List <String> newName = names.stream()
				.map(name -> name.toUpperCase())
				.collect(Collectors.toList());
				 System.out.println(newName);
		
		System.out.println("===========================");
		
		
		
		List <Integer>  numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		 numbers.stream()
		    .filter(n -> n %2 ==0)
		    .forEach(System.out::println);
		 
		 
		 System.out.println("===========================");
		 //map()
		 List <Integer> doubled = numbers.stream()
              .map(n -> n*2)
              .collect(Collectors.toList());
		 System.out.println(doubled);
		 
		 System.out.println("===========================");
		 

	}

}
