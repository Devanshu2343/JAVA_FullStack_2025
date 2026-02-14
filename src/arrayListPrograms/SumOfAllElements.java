package arrayListPrograms;

import java.util.ArrayList;

public class SumOfAllElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			ArrayList<Integer> al = new ArrayList<Integer>();
			al.add(59);
			al.add(67);
			al.add(83);
			al.add(10);
			
			int sum  =0 ;
			for (Integer a : al) {
				sum +=a;
			}
			
			System.out.println(sum);

	}

}