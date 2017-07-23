package step01;

class Parent extends Object {
	String id;
	int pw;

	Parent() {
		super();
		System.out.println("부모");
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
		System.out.println("자식");
	}

	void printAll() {
		super.printAll();
		System.out.println(name);
	}

	/*
	 * java.lang.Object의 toString() 반환값 - 객체명@위치값을 문자열로 반환
	 * 
	 * API 존재하는 하위 클래스 또는 개발자가 개발하는 데이터용 클래스들(domain)을 재정의 권장
	 */
	// 재정의
	public String toString() {
		return "백경진";
	}

	public static void main(String[] args) {
		Child c = new Child(); // Object 객체 -> Parent객체 -> Child객체 순으로 생성
		System.out.println(c);
		System.out.println(c.toString());
		
		System.out.println("an");
		System.out.println("an".toString());
	}

}

// ctrl + shift + f 자동 정렬
