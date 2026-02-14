package arrayListPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class BookComparator implements Comparator<Book>{
	@Override
	public int compare(Book o1 , Book o2) {
		return o1.price - o2.price ;
	}
	
}

class Book {
	int price ;
	Book(){
		
	}
	Book(int price){
		this.price = price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Book [Price=" + price+ "]";
	}

	
	
}

public class Comparatorprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList books= new ArrayList();
		books.add(new Book(1000));
		books.add(new Book(2000));
		books.add(new Book(100));
		books.add(new Book(11));
		books.add(new Book(500));
		System.out.println("==Before Sorting==");
		System.out.println(books);
		
		Collections.sort(books , new BookComparator());
		System.out.println("==After Sorting==");
        System.out.println(books);

	}

}
