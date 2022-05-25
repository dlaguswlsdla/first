package dto;

public class Member {
	private String userName;
	private String email;
	private String pw;
	
	public Member() {}

	public Member(String userName, String email, String pw) {
		super();
		this.userName = userName;
		this.email = email;
		this.pw = pw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	
	
}
