package Operators;

/* 
 * 
 * An online store gives a discount if the total purchase amount is above 2000 and the user is a premium member, or if the user is not a
 *  first-time customer. Use logical and relational operators to check conditions, the conditional operator to calculate the final price,
 *   and a compound assignment operator to reduce the bill amount.
 * 
 * */


public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bill =9000 ;
		int discount = 500 ;
		boolean isPremium = true ;
		boolean isFirstPurchase = true ;
		boolean isEligible = (bill <2000) ? false : (isFirstPurchase || isPremium == true ? true : false) ;
		bill = (isEligible == true ? bill-=discount : bill) ;
		System.out.println(isEligible);
		System.out.println(bill);
		
		

	}

}
