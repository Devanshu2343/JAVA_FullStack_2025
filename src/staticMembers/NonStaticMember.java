package staticMembers;

public class NonStaticMember {
	{
		System.out.println("Hello from non static block");
	}
	 NonStaticMember(){
		 System.out.println("Hello from constructor");
		 
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticMember d = new NonStaticMember();

	}

}
