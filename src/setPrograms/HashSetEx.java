package setPrograms;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		 HashSet set = new HashSet();
		 set.add(16);
		 set.add(18);
		 set.add(32);
		 set.add(null);
		 System.out.println(set);
		 
		 System.out.println(set.contains(16));
		 
		 for (Object o :set) {
			 System.out.println(o);
		 }
		 
		 

	}

}
