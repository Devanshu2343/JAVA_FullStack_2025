package lazyInitialisation;

public class Car {
	Tyre [] tyres  = new Tyre[4] ;
	
	int i =0 ;
	//helper method
	void addTyre(Tyre tyre) {
		tyres[i] = tyre ; 
		i++ ;
	}

}
