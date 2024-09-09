package package1;

public class Person {
	private String name;
	private String phone;
	private String addr;
	
	Person(){		
	}
	Person(String pname, String pphone, String paddr){
		this.name=pname;
		this.phone=pphone;
		this.addr=paddr;
	}
	String getName() {
		return this.name;
	}
	String getPhone() {
		return this.phone;
	}
	String getAddr() {
		return this.addr;
	}
	
	void setName(String pname) {
		this.name=pname;
	}
	void setPhone(String pphone) {
		this.phone=pphone;
	}
	void setAddr(String paddr) {
		this.addr=paddr;
	}	
}
