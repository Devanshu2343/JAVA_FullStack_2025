package mapPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap map = new LinkedHashMap();
		map.put(1,"Dev ");
		map.put(21,  "Dev");
		map.put(2, "Raj");
		System.out.println(map);
		
		map.putIfAbsent(2 , "Abc") ;
		System.out.println(map);
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		
		for (Object o : map.keySet()) {
			System.out.println(o);
		}
		
		for (Object o : map.entrySet()) {
			System.out.println(o);
		}
		
		for (Object o : map.values ()) {
			System.out.println(o);
		}
		
		Iterator i = map.entrySet().iterator();

		i.next();
		
		

	}

}
