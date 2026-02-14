package hasARealtionship2;

public class Department {
	private String departmentName ;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	//constructor 
	Department(){
		
	}
	Department (String departmentName){
		this.departmentName = departmentName ;
	}

}
