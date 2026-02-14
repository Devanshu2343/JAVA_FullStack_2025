package objectClass;

class Box{
	int price ;
	
	public String toString() {
		return "Price : " + price ;
	}
}

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1 = new Box();
		System.out.println(b1.toString());

	}

}

