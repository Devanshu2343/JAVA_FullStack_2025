package lambdaExpressions;

interface A{
	void test ();
}

interface B {
	int add (int a , int b );
	
}

public class LambdaEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a =() -> {
			 System.out.println("HII");
		};
		a.test();
		
		B b =(x,y) ->
		{
			return x+y ;
		};
		System.out.println(b.add(20,30));

	}

}
