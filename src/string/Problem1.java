package string;

//Print a String

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Dev" ;
		System.out.println(a);
		
		String b = new String("Raj") ;
		System.out.println(b);
		
		StringBuffer c = new StringBuffer("Abc");
	    System.out.println(c);
	    
	    StringBuilder d = new StringBuilder("Cde");
	    System.out.println(d);
	    
	    System.out.println(a.getClass().getName());
        System.out.println(b.getClass().getName());
        System.out.println(c.getClass().getName());
        System.out.println(d.getClass().getName());
		 
		 

	}

}
