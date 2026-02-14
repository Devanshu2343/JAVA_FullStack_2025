package arrayListPrograms;

import java.util.ArrayList;

public class AddData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1 = new ArrayList() ;
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		a1.add(50);
		a1.add(null);
		a1.add("Hello");
		
		 System.out.println(a1);
		 
		 ArrayList a2 = new ArrayList() ;
		 a2.add(89);
		 a2.add(90);
//		 a2.add(a1);
		 a2.addAll(a1);
		 System.out.println(a2);
		 
		 a1.add(2,10);
		 a1.add(0,9);
		 System.out.println(a1);
		 
		 
		

	}

}
