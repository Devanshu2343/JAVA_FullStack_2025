package Operators;
/*
 * 3.An employee is eligible for a salary increment if their performance rating is greater than 4 or they have more than 5 years of experience, 
 * but they must not be under disciplinary action.Use a conditional operator to decide eligibility and a compound assignment operator to increase
 *  the salary.
 */

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int experience = 6 ;
		float rating = 4.2f ;
		int salary = 90000;
		int increment = 6000 ;
		boolean dis_action = false ;
		Boolean isEligible = (dis_action == true) ? false : (experience>=5 || rating >=4.0f ? true : false) ;
		salary = (isEligible == true) ? (salary += increment) : salary ;
		System.out.println(isEligible);
		System.out.println(salary);
		 
		

	}

}
