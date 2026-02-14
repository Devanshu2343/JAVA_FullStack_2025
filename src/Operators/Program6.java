package Operators;
/* 
 * A traffic system checks if a vehicle’s speed is greater than the speed limit and the driver is not an emergency service provider. 
 * Use a conditional operator to decide whether a fine should be applied and a compound assignment operator to add the fine amount to 
 * the total penalty.
 * 
 * */
public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int speed  = 90 ;
		int fine = 0 ;
		boolean isEmergency = false ;
		boolean isFine  =  (isEmergency == true) ? false : (speed > 60 ? true : false) ;
		fine = (isFine == true) ? fine +=500 : fine ;
		System.out.println(isFine);
		System.out.println(fine);
			

	}

}
