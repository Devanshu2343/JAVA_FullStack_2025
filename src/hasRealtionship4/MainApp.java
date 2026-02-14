package hasRealtionship4;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book();
		for (int i=0 ; i <b1.getPage().length ;i++) {
			System.out.println(b1.getPage()[i].getColourOfPage());
		}

	}

}
