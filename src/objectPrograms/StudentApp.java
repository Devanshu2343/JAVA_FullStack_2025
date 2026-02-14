package objectPrograms;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student() ;
		Student s2 = new Student("Hrjp123") ;
		Student s3 = new Student("Hrjp" , "asdfs") ;
		Student s4 = new Student("abc" , "sdf" , "ffd56") ;
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
