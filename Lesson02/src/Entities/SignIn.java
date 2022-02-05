package Entities;

public class SignIn {
	private String login;
	private Integer passoword;
	
	public SignIn() {
		
	}
	
	public SignIn(String login, Integer passoword) {
		this.login = login;
		this.passoword = passoword;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public Integer getPassoword() {
		return passoword;
	}
	
	public void setPassoword(Integer passoword) {
		this.passoword = passoword;
	}
	
	public Boolean systemLogin(String login, int password) {
			
		return true;
	}
}
