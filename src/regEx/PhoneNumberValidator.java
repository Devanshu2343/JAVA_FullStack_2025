package regEx;





import java.util.regex.*;
public class PhoneNumberValidator {
    public static void main (String[] args){
        String phone = "+919876543210" ;

        String validatorExp = "^(\\+\\d{1,3})?\\d{10}$" ;

        Pattern p = Pattern.compile(validatorExp);

        Matcher m = p.matcher(phone);

        if (m.matches()){
            System.out.println("Valid phone number");
        }
        else {
            System.out.println("Invalid phone number");
        }

    }
}
