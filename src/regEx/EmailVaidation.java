package regEx;


	
	
	import java.util.regex.*;
	public class EmailVaidation {
	    public static void main (String args[]){
	        String email = "alice@example.com";

	        String validationData = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$" ;
	        
	        Pattern p = Pattern.compile(validationData);

	        Matcher m = p.matcher(email);

	        if (m.matches()){
	            System.out.println("Valid email address");

	        }
	        else {
	            System.out.println("Invalid email address");
	        }

	    }

}
	
