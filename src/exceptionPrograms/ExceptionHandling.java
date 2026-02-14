package exceptionPrograms;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10 ;
		int b = 0 ;
		
		try {
			System.out.println(a/b);
			
			String s = null ;
			System.out.println(s.toUpperCase());
			
		}
//		catch(ArithmeticException e) {
//			System.out.println("Caught AE");
//		}
//		catch(NullPointerException e) {
//			System.out.println("Caught NFE");
//		}
//		catch(NumberFormatException e) {
//			System.out.println("Caught NFE");
//			
//		}
//		catch(Exception e) {
//			System.out.println("Caught");
//		}
		catch(ArithmeticException | NullPointerException | NumberFormatException  e) {
			e.printStackTrace();
		}

	}

}
