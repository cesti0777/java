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
	 * 1. java.lang.Object�� equals() : 
	 * ��ü�� �ּҰ� ��
	 * Customer Ÿ�� ��
	 * ������ Customer�� ��쿡 ��� ������ ��
	 * �⺻ Ÿ�� �� : ==
	 * ��ü Ÿ�� �� : equals()
	 * 
	 * 2. �� �޼ҵ� ���� ������ Ȯ�� �ڵ带 PolyTest2���� ������ ����
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
