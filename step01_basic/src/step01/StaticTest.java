package step01;

public class StaticTest {
	int no = 10;
	static int no2 = 20; 
	// ��ü ������ �����ϰ� �ƹ����� ��� ���� ����
	// no2(32bit ��������)�� ���� �޸𸮿� �����Ǵ� �ñ�?
	// ���� �޼ҵ� ���� byte code�� �ε尡 �� ���� ���������� ������ ���ٸ� ������.
	
	int getNo(){
		return no;			
	}
							
	// ��ü ������ �����ϰ� �ƹ����� ��� ���� �޼ҵ�
	static int getNo2(){
		return no2;
	}
	
	public static void main(String[] args) {
		StaticTest s = new StaticTest();
		
		System.out.println(s.getNo());//10
		System.out.println(StaticTest.getNo2());//20
		
		
		String s2 = "���ڿ�";
		System.out.println(s2.length());
		
		// ���� �߻�
		System.out.println(Math.random());
		
		// 2���� ���ڰ� �� �ִ밪
		System.out.println(Math.max(3,5));
		
		/*
		 * char char(int index){
		 * 		�����ϴ� ���ڿ��� index������ �� ���� �����ؼ� ��ȯ
		 * 
		 * }
		 * char c = String.char(2); // �� ��
		 * String v = "eee";
		 * char c = v.char(2);
		 */
	}
}
