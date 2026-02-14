package arrayListPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList books= new ArrayList();
		books.add(new Book(1000));
		books.add(new Book(2000));
		books.add(new Book(100));
		books.add(new Book(1));
		books.add(new Book(500));
		System.out.println(books);
		
		Collections.sort(books);
        System.out.println(books);
	}

}
