package step01;

class Parent extends Object {
	String id;
	int pw;

	Parent() {
		super();
		System.out.println("�θ�");
	}

	void printAll() {
		System.out.println(id);
		System.out.println(pw);
	}
}

public class Child extends Parent {
	String name;

	Child() {
		super(); 
		System.out.println("�ڽ�");
	}

	void printAll() {
		super.printAll();
		System.out.println(name);
	}

	/*
	 * java.lang.Object�� toString() ��ȯ�� - ��ü��@��ġ���� ���ڿ��� ��ȯ
	 * 
	 * API �����ϴ� ���� Ŭ���� �Ǵ� �����ڰ� �����ϴ� �����Ϳ� Ŭ������(domain)�� ������ ����
	 */
	// ������
	public String toString() {
		return "�����";
	}

	public static void main(String[] args) {
		Child c = new Child(); // Object ��ü -> Parent��ü -> Child��ü ������ ����
		System.out.println(c);
		System.out.println(c.toString());
		
		System.out.println("an");
		System.out.println("an".toString());
	}

}

// ctrl + shift + f �ڵ� ����
