package hasARealtionship;

public class MainApp {
	public static void main (String[] args) {
		Car c = new Car ("BMW" ) ;
		System.out.println(c.getModelName());
		//method chaining
		System.out.println(c.getEngine().getHp());
	}

}
