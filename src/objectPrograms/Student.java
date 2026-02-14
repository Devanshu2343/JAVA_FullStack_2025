package objectPrograms;

public class Student {
	String pan ;
	String adhar ;
	String VotiongCard ;
	
	//constructors
	Student (){
		
	}
	Student (String pan ){
		this.pan = pan ;
		
	}
	
	Student (String pan , String adhar){
		this.pan = pan ;
		this.adhar = adhar ;
	}
	
	Student (String pan , String adhar ,String VotiongCard){
		this.pan = pan ;
		this.adhar = adhar ;
		this.VotiongCard = VotiongCard ;
	}

}
