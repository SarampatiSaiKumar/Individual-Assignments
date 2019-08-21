package beanauthentication;

public class Details {
	 String uname;
     String password;
     public Details() {
    	 
     }
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String validate()
	   {
		if(uname.equals("anvesh")&&password.equals("password"))
		return uname;
		else
			return "GO back";
	   }

}
