package lambdaExpressions;

import java.util.ArrayList;

class Book {
	String name;
	int price ;
	
	Book(){
		
	}
	Book(String name ,int price){
		this.name = name ;
		this.price= price;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + "]";
	}
	
}

public class MainBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList al = new ArrayList();
//		al.add(new Book("Java" , 100));
//		al.add(new Book("Python" , 110));
//		al.add(new Book("SQL" , 150));
//		al.add(new Book("C++" , 90));
//		System.out.println(al);
		
		Book b1 =new Book(""
				+ "Java" , 100);
		

	}

}
