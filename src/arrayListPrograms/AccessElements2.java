package arrayListPrograms;




import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class AccessElements2 {

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
		System.out.println("-----------");
		//Iterator -->> ListIterator
		ListIterator i = a1.listIterator(2);
		
		// moving forward
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("-----------");
		
		//moving backward
		while(i.hasPrevious()) {
			System.out.println(i.previous());
		}
		

		 
		

	}

}

