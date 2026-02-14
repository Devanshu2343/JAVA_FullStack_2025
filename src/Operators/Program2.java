package Operators;
/* 
 * A bank system verifies whether an account balance is greater than zero and the account is active. 
 * If the condition is true, allow withdrawal; otherwise, deny it.Use a conditional operator to display 
 * the message and a compound assignment operator to deduct the withdrawal amount from the balance.
 * 
 * */
public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance =9000 ;
		String status = "Active" ;
		String withdrawl = (balance >0 && status == "Active") ? "Possible" :"Not Possible" ;
		int wid_amt = 400;
		
		balance -= wid_amt ;
		System.out.println(withdrawl);

	}

}
