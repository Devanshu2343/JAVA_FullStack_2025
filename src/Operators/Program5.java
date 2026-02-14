package Operators;
/* 
 * 5.A student gets extra time in an exam if they are physically challenged or their attendance is below 60% but approved by the administration. 
 * Use a conditional operator to decide the extra time and a compound assignment operator to add extra minutes to the exam duration.
 * 
 * */

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean physically_challenged = true ;
		int attendance = 55 ;
		boolean isApproved = true  ;
		boolean isEligible = (isApproved == false) ? false : (physically_challenged == true || attendance<60 ? true :false) ;
		System.out.println(isEligible);

	}

}
