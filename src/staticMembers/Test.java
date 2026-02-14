package staticMembers;

public class Test {
	
	static {
		 System.out.println("Hiiii..... I am from static block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Demo.m1();
//		System.out.println(Demo.a);
		System.out.println("Hiiiiii..... I am from main block");

	}
	
	static {
		 System.out.println("Hiiii..... I am from 2nd static block");
	}

}
