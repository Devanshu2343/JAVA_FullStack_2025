package wrapperClass;

public class UnboxingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Boxing 
		int a = 10 ;
		Integer i = Integer.valueOf(a);
		
		//UnBoxing
		int b = i .intValue();
		System.out.println(b);
		
		byte x =50 ;
		Byte y = Byte.valueOf(x);
		byte z = y.byteValue();
		System.out.println(z);
		
		//AutoUnBoxing
		int s = 77 ;
		Integer d  = s ;
		int f = d ;
		System.out.println(f);

	}

}
