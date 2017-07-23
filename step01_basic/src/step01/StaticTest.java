package step01;

public class StaticTest {
	int no = 10;
	static int no2 = 20; 
	// 객체 생성과 무관하게 아무때나 사용 가능 변수
	// no2(32bit 정수공간)가 실제 메모리에 생성되는 시기?
	// 메인 메소드 전에 byte code를 로드가 된 직후 문법적으로 오류가 없다면 생성됨.
	
	int getNo(){
		return no;			
	}
							
	// 객체 생성과 무관하게 아무때나 사용 가능 메소드
	static int getNo2(){
		return no2;
	}
	
	public static void main(String[] args) {
		StaticTest s = new StaticTest();
		
		System.out.println(s.getNo());//10
		System.out.println(StaticTest.getNo2());//20
		
		
		String s2 = "문자열";
		System.out.println(s2.length());
		
		// 난수 발생
		System.out.println(Math.random());
		
		// 2개의 숫자값 중 최대값
		System.out.println(Math.max(3,5));
		
		/*
		 * char char(int index){
		 * 		존재하는 문자열의 index값으로 한 음절 착출해서 반환
		 * 
		 * }
		 * char c = String.char(2); // 안 됨
		 * String v = "eee";
		 * char c = v.char(2);
		 */
	}
}
