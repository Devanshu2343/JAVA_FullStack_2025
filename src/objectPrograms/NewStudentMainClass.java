package objectPrograms;

public class NewStudentMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewStudentApp s1 = new NewStudentApp() ;
		NewStudentApp s2 = new NewStudentApp("Hrjp123") ;
		NewStudentApp s3 = new NewStudentApp("Hrjp" , "asdfs") ;
		NewStudentApp s4 = new NewStudentApp("abc" , "sdf" , "ffd56") ;
		System.out.println(s1.pan);
		System.out.println(s1.adhar);
		System.out.println(s1.VotiongCard);
		System.out.println();
		System.out.println(s2.pan);
		System.out.println(s2.adhar);
		System.out.println(s2.VotiongCard);
		System.out.println();
		System.out.println(s3.pan);
		System.out.println(s3.adhar);
		System.out.println(s3.VotiongCard);
		System.out.println();
		System.out.println(s4.pan);
		System.out.println(s4.adhar);
		System.out.println(s4.VotiongCard);
		System.out.println();

	}

}
