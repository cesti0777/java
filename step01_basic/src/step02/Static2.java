/*
 * 주요사항
 * 1. 생성자 호출해서 객체가 생성되는 단계
 * 		- 생성자가 호출됨
 * 		-> 생성자 보유한 클래스의 각 멤버 변수들이 완벽하게 메모리에 생성됨
 * 		-> 생성자 실제 실행
 * 2. 결론 
 * 		: 메모리에 멤버 변수들 생성이 우선
 */

package step02;

import javax.sound.midi.Synthesizer;

public class Static2 {
	/*
	 * 1. 객체들 생성 시점은 언제?  
	 * 		C c = new C();
	 * 		- ???객체 생성 확인은 어떻게 하면 좋을가요?
	 * 		- 힌트 : 생성자 호출..은 객체 생성 의미
	 * 		- 육안으로 확인하고 싶다면???
	 * 	
	 * 2. 더이상의 객체 생성 없이 각 클래스가 보유한 메소드 호출 문법은?
	 */
	public static void main(String[] args) {
		C c = new C();
		System.out.println(c);//C객체의 주소값
		System.out.println(c.b);//B객체의 주소값
		System.out.println(c.b.a);//A객체의 주소값
		
		c.b.a.a();
		c.b.b();
		c.c();
	}

}

class A{
	A(){
		System.out.println("A생성자 호출 = A객체 생성");
	}
	void a(){
		System.out.println("a 메소드 호출");
	}
	static{
		System.out.println("A static 블록");
	}
}

class B{
	A a = new A();
	B(){
		System.out.println("B생성자 호출 = B객체 생성");
	}
	void b(){
		System.out.println("b 메소드 호출");
	}
	static{
		System.out.println("B static 블록");
	}
}

class C{
	B b = new B(); 
	C(){// 객체가 생성될 때는 멤버변수와 생성자의 선언 위치에 상관없이 멤버변수가 먼저 생성이되고 생성자 호출 됨.
		System.out.println("C생성자 호출 = C객체 생성");
	}	
	void c(){
		System.out.println("c 메소드 호출");
	}
	static{
		System.out.println("C static 블록");
	}// byte code 생성될때 바로 불림. 제일 먼저 불리게 됨.
}
