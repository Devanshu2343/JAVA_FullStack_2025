package queuePrograms;

import java.util.ArrayDeque;

public class ArrayDequeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayDeque a = new ArrayDeque();
		a.offer(10);
		a.offer(20);
		a.offer(30);
		a.offer(40);
		//a.offer(null);
		
		a.offer("Hello");
		System.out.println(a);
		
		a.offerFirst(5);
		System.out.println(a);
		
		a.offerLast(50);
		System.out.println(a);
		
		a.poll();
		System.out.println(a);
		
		a.pollFirst();
		System.out.println(a);
		
		a.pollLast();
		System.out.println(a );

	}

}
