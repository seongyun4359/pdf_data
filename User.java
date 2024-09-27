package package1;

public class User {
	private String id;
	private String pw;
	
	User(String pid, String ppw){
		this.id=pid;
		this.pw=ppw;
	}
	String getId() {
		return this.id;
	}
	
	String getPw() {
		return this.pw;
	}
	
	void setId(String pid) {
		this.id=pid;
	}
	void setPw(String ppw) {
		this.pw=ppw;
	}

}
