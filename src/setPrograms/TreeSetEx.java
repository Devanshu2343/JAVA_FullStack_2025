package setPrograms;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(10);
		set.add(5);
		set.add(7);
		set.add(9);
		set.add(32);

		set.add(15);
		set.add(12);
	
//        set.add(null);  //NullPointerException
//		set.add("Hello"); //ClassCastException
//		set.add("Bye");
//		set.add("H");
//		set.add("h");
//		
		System.out.println(set);
		
		for (Object o : set) {
			System.out.println(o);
		}
		
		
	}

}
