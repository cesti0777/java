package model.domain;

public class Customer {
	private String name;
	private int age;
	
	public Customer() {	}
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	/*
	 * ??? 
	 * 1. java.lang.Object의 equals() : 
	 * 객체의 주소값 비교
	 * Customer 타입 비교
	 * 동일한 Customer인 경우에 멤버 변수값 비교
	 * 기본 타입 값 : ==
	 * 객체 타입 값 : equals()
	 * 
	 * 2. 이 메소드 정상 구현을 확인 코드를 PolyTest2에서 개발해 보기
	 * 
	 */
	
	public boolean equals(Object o){
		boolean result = false;
		
		if(o instanceof Customer){
			Customer c = (Customer)o;
			if(c.getName().equals(getName())
					&& c.getAge()==getAge()){
				result = true;
			}
		}	
		return result;
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + "]";
	}
}
