package step01;

public class Test {
	String name;
	int age;
	
	Test(){}
	
	
	/*
	 * static String getName(){
	 *		return name; 
	 *	}	// static ���� ���� �� ��. 
	 *     // ��ü �������� �ʾƵ� �� �� �ִ� �޼ҵ忡 ��ü�� �����ؾ� �� �� �ִ� ������ �Ἥ
	 *     
	 *     
	 * static String name;
	 * String getName(){
	 *		return name; 
	 * }	// ����. ��ü�� �������� �ʾƵ� �� �� �ִ� ������ ��ü�� �����ؾ� �� �� �ִ� �޼ҵ忡�� ����ϴ°� ����.
	 */
	
	String getName(){
		return name; 
	}
	void setName(String name){
		this.name = name;
	}
	int getAge(){
		return age;
	}
	void setAge(int age){
		this.age = age;
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.name = "������";
		t.age =  27;
		System.out.println(t.name + " " + t.age);
		
		t.setName("�����");
		t.setAge(25);
		System.out.println(t.name + " " + t.getAge());
	}

}
