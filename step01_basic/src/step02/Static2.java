/*
 * �ֿ����
 * 1. ������ ȣ���ؼ� ��ü�� �����Ǵ� �ܰ�
 * 		- �����ڰ� ȣ���
 * 		-> ������ ������ Ŭ������ �� ��� �������� �Ϻ��ϰ� �޸𸮿� ������
 * 		-> ������ ���� ����
 * 2. ��� 
 * 		: �޸𸮿� ��� ������ ������ �켱
 */

package step02;

import javax.sound.midi.Synthesizer;

public class Static2 {
	/*
	 * 1. ��ü�� ���� ������ ����?  
	 * 		C c = new C();
	 * 		- ???��ü ���� Ȯ���� ��� �ϸ� ��������?
	 * 		- ��Ʈ : ������ ȣ��..�� ��ü ���� �ǹ�
	 * 		- �������� Ȯ���ϰ� �ʹٸ�???
	 * 	
	 * 2. ���̻��� ��ü ���� ���� �� Ŭ������ ������ �޼ҵ� ȣ�� ������?
	 */
	public static void main(String[] args) {
		C c = new C();
		System.out.println(c);//C��ü�� �ּҰ�
		System.out.println(c.b);//B��ü�� �ּҰ�
		System.out.println(c.b.a);//A��ü�� �ּҰ�
		
		c.b.a.a();
		c.b.b();
		c.c();
	}

}

class A{
	A(){
		System.out.println("A������ ȣ�� = A��ü ����");
	}
	void a(){
		System.out.println("a �޼ҵ� ȣ��");
	}
	static{
		System.out.println("A static ���");
	}
}

class B{
	A a = new A();
	B(){
		System.out.println("B������ ȣ�� = B��ü ����");
	}
	void b(){
		System.out.println("b �޼ҵ� ȣ��");
	}
	static{
		System.out.println("B static ���");
	}
}

class C{
	B b = new B(); 
	C(){// ��ü�� ������ ���� ��������� �������� ���� ��ġ�� ������� ��������� ���� �����̵ǰ� ������ ȣ�� ��.
		System.out.println("C������ ȣ�� = C��ü ����");
	}	
	void c(){
		System.out.println("c �޼ҵ� ȣ��");
	}
	static{
		System.out.println("C static ���");
	}// byte code �����ɶ� �ٷ� �Ҹ�. ���� ���� �Ҹ��� ��.
}
