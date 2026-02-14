package lazyInitialisation;

public class MainApp {
	public static void main (String[] args) {
		Car c = new Car ();
		
		int k = c.tyres.length ;
		
		c.addTyre(new Tyre ("MRF"));
		c.addTyre(new Tyre ("MRF"));
		c.addTyre(new Tyre ("MRF"));
		c.addTyre(new Tyre ("MRF"));
	//	c.addTyre(new Tyre ("MRF"));
		
		for (int i =0 ; i < k; i++) {
			System.out.println(c.tyres[i].getBrand());
		}
		
		
	}

}
