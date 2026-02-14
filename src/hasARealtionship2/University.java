package hasARealtionship2;

public class University {
	private String universityName ;

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	
    University(){
    	
    }
    University(String universityName){
    	this.universityName = universityName ;
    }
    
    Department d = new Department("CSE");
      
}
