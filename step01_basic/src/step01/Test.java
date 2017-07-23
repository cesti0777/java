package step01;

public class Test {
	String name;
	int age;
	
	Test(){}
	
	
	/*
	 * static String getName(){
	 *		return name; 
	 *	}	// static 변수 쓰면 안 됨. 
	 *     // 객체 생성하지 않아도 쓸 수 있는 메소드에 객체를 생성해야 쓸 수 있는 변수를 써서
	 *     
	 *     
	 * static String name;
	 * String getName(){
	 *		return name; 
	 * }	// 가능. 객체를 생성하지 않아도 쓸 수 있는 변수를 객체를 생성해야 쓸 수 있는 메소드에서 사용하는건 가능.
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
		t.name = "박지빈";
		t.age =  27;
		System.out.println(t.name + " " + t.age);
		
		t.setName("백경진");
		t.setAge(25);
		System.out.println(t.name + " " + t.getAge());
	}

}
