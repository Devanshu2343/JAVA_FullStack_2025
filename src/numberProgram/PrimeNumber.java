package numberProgram;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 11;
		boolean isPrime = true;
        for (int i=2 ;i<num ; i++){
           if (num %i ==0){
               isPrime = false;
           }
          
        }
         if(isPrime==true ){
               System.out.println("prime");
           }
          else{
               System.out.println("not prime");
           }

	}

}
