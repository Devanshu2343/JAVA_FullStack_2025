package objectPrograms;

public class NewStudentApp {
	String pan ;
	String adhar ;
	String VotiongCard ;
	
	//constructors
	NewStudentApp (){
		
	}
	NewStudentApp (String pan ){
		this();
		this.pan = pan ;
		
	}
	
	NewStudentApp (String pan , String adhar){
		//this.pan = pan ;
		this(pan);
		this.adhar = adhar ;
	}
	
	NewStudentApp (String pan , String adhar ,String VotiongCard){
//		this.pan = pan ;
//		this.adhar = adhar ;
		this(pan , adhar);
		this.VotiongCard = VotiongCard ;
	}


}
