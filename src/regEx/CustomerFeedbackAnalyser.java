package regEx;



import java.util.regex.*;
public class CustomerFeedbackAnalyser {
    public static void main (String[] args){
        String [] feedbacks = {
            "Great product! Bought it on 2024-03-10. Rating: 4/5 #satisfied" ,
            "Bad quality Returned on 2024-02-28. Product code: PRD-9981 #angry" ,
            "Excellent service! Rating: 5/5 #happy",
            "Delivery late on 2024-01-15, but item PRD-7766 was good. Rating: 4/5" 

        };

        String date = "\\d{4}-\\d{2}-\\d{2}" ;
        String productCode = "PRD-\\d{4}";
        String rating =  "\\d/\\d";
        String hashtags = "#\\w+" ;

        for (int i =0 ; i < feedbacks.length; i ++){
             System.out.println("Feedback " + (i + 1));

             printMatch("Date", date, feedbacks[i]);
             printMatch("Product Code", productCode, feedbacks[i]);
             printMatch("Rating", rating, feedbacks[i]);
             printMatch("Hashtags", hashtags, feedbacks[i]);

            System.out.println();
        }
    }

    public static void printMatch(String s, String regex, String text) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);

         if (m.find()) {
            System.out.println(s + ": " + m.group());
        } else {
            System.out.println(s+ ": Not provided");
        }
    }    
}