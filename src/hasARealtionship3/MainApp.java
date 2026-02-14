package hasARealtionship3;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		for(int i =0 ; i < c.getTyres().length; i++) {
			System.out.println(c.getTyres()[i].getBrand());
		}

	}

}
