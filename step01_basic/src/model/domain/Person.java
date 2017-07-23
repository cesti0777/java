package model.domain;

public class Person {
	private String id;
	private String pw; // static으로 하면 안 됨. 공유해선 안되는 변수라서
	
	public Person(){}
	public Person(String i, String p){
		id = i;
		pw = p;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", pw=" + pw + "]";
	}
}
