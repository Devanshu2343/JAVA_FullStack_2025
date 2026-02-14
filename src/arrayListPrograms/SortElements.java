package arrayListPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class SortElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add(69);
		al1.add(78);
		al1.add(90);
		al1.add(88);
		System.out.println("--Before Sorting--");
		System.out.println(al1);
		Collections.sort(al1);
		System.out.println("--After Sorting--");
		System.out.println(al1);
		
		//Decending Order
		Collections.sort(al1, Collections.reverseOrder());
		System.out.println(al1);

	}

}
