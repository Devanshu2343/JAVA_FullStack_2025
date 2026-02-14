package setPrograms;
import java.util.*;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet set = new LinkedHashSet();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
     	set.add(null);
		set.add("Hello");
		
		System.out.println(set);
		
		for (Object o : set) {
			 System.out.println(o  );
		}

	}

	 

}
