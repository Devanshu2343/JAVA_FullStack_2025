package nonPrimitiveTypeCasting;

class A{
	
}
class B extends A{
	
}
class C extends A{
	
}
class D extends C{
	
}

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// UpCasting
		A a = new D() ;
		
//		DownCasting
//		B b = (B) a; 
//		class cast exception occured here , it can be avoided using instanceof
		
		System.out.println(a instanceof A);
		System.out.println(a instanceof B);
		System.out.println(a instanceof C);
		System.out.println(a instanceof D);
		
		if (a instanceof B) {
			B b = (B)a ;
			
		}
		else {
			System.out.println("Dont have intance of this class");
		}
		

	}

}
