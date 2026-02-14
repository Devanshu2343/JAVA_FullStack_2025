package arrayListPrograms;

import java.util.ArrayList;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add(69);
		al1.add(78);
		al1.add(90);
		al1.add(88);
		
		// remove (index)c
		al1.remove(4);
        System.out.println(al1);
		
		
		
		ArrayList al2 = new ArrayList();
		al2.add(100);
		al2.add(69);
		al2.add(78);
		al2.add(900);
		
		al1.removeAll(al2);
		System.out.println(al1);
		
		
		ArrayList al3 = new ArrayList();
		al3.add(1000);
		al3.add(69);
		al3.add(780);
		al3.add(900);
		
		al2.retainAll(al3);
		System.out.println(al2);
		
		
		al3.clear();
		System.out.println(al3);
		
		
		
		
		

	}

}
