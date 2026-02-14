package encapsulation;

public class UserDetails {
	private String userName ;
	private String pwd ;
	
	//setter 
	public void setUserData(String userName , String pwd) {
		this.userName = userName ;
		this.pwd = pwd ;

		
		
	}
	
	//getter 
	public String getUserData() {
		String userDatas = "Username : "  + userName + "\nPassword  :" + pwd ;
		return userDatas ;
		
	}

}
