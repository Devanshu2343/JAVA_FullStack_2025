package string;

public class StringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s1 = new StringBuffer();
		
		StringBuffer s2 = new StringBuffer("12345678901234567");

		
		
		//append
		s1.append("Hello");
		System.out.println(s1);
		
		//insert
		s1.insert(1,"Hiiie" ) ;
		System.out.println(s1);
		
		//reverse
		s1.reverse();
		System.out.println(s1);
		
		//replace
		s1.replace(1, 3, "Zero") ;
		System.out.println(s1);
		
		//delete
		s1.delete(2,5);
		System.out.println(s1);
		
		
		//capacity
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		System.out.println(s2.length());
		System.out.println(s2.capacity());

		

	}

}
