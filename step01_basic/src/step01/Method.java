package step01;

public class Method {
	
	String name;
	String gender;
	int age;
	
	public Method() {	}
	public Method(String name2, String gender, int age) {
		this.name = name2;
		this.gender = gender;
		this.age = age;
	} //cf) Alt + Shift + R : ������ �ϰ� ����

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		Method m = new Method();
		m.setName("�����");
		// �޼ҵ� ȣ�� �� �� ���
		
		System.out.println(m.getName());
	}

}
