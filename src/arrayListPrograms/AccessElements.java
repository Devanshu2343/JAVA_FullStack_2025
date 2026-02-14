 package arrayListPrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class AccessElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		
		System.out.println(a1);
		
		//get(index)
		for (int i =0 ; i < a1.size() ; i++) {
			System.out.println(a1.get(i));
		}
		
		//forEaach
		for (Object o : a1) {
			System.out.println(o);
		}
		
		//Iterator
		Iterator i  = a1.iterator() ;
		
//		System.out.println(i.next());
//		System.out.println(i.next());
//		System.out.println(i.next());
//		System.out.println(i.next());
//		System.out.println(i.next());
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		 
		

	}

}
