package model.domain;

public class Person {
	private String id;
	private String pw; // static���� �ϸ� �� ��. �����ؼ� �ȵǴ� ������
	
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
