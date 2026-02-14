package Operators;

public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score =200 ;
		int bonus = 20 ;
		boolean isCompletedOnTime = true ;
		boolean isUsedCheat = false ;
		boolean isEligible = (score <100) ? (false) : (isCompletedOnTime == true && isUsedCheat == false ? true : false) ;
		System.out.println(isEligible);
		score = (isEligible == true ? score+=bonus : score);
		System.out.println(score);

	}

}
