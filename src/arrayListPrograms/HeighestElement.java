package arrayListPrograms;

import java.util.ArrayList;

public class HeighestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(30);
		al.add(40);
		al.add(90);
		System.out.println(al);
		
		System.out.println("======");
		
		int max = Integer.MIN_VALUE;
		for (int i =0 ; i <al.size(); i++) {
			if (al.get(i) >max) {
				max =al.get(i);
			}
		}
		System.out.println(max);


	}

}
