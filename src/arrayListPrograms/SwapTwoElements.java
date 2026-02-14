package arrayListPrograms;

import java.util.ArrayList;

public class SwapTwoElements {
	public static void swap(ArrayList<Integer> al1,int idx1 , int idx2) {
		int temp = al1.get(idx1);
		al1.set(idx1, al1.get(idx2));
		al1.set(idx2, temp);
		System.out.println(al1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(10);
		al1.add(101);
		al1.add(10001);
		al1.add(110);
		al1.add(1110);
		System.out.println(al1);
		int idx1 =0 ;
		int idx2 = 4 ;
		
		swap(al1,idx1 , idx2);

	}

}
