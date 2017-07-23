/*
 * 학습내용
 * 1. static 키워드
 * 2. 사용 위치
 * 		1. 변수
 * 			- static 변수
 * 			- 객체 생성없이 사용 가능
 * 			- class명.변수
 * 		2. 메소드
 * 			- static 변수
 * 			- 객체 생성없이 사용 가능
 * 			- class명.메소드([..]);
 * 		3. static{}
 * 			- 모든 user 공유하는 자원들을 단 한번 초기화 할때 사용되는 기술
 * 			- 실행 시점
 * 				: byte code가 메모리에 저장될 때 해당 static{} byte code 위치에서 바로 실행
 */

package step02;

public class Static1 {
	int no1; // instance변수 - 객체 생성시 무조건 새롭게 생성
	static int no2;  // static변수 - 생성되는 모든 객체가 공유하는 변수
	
	
	Static1(){
		no1++;
		no2++;
	}
	


	int getNo1() {//객체 생성후에만 호출 가능한 메소드
		return no1;//객체 생성시에 생성되는 변수
	}

	int getNo2() {//객세 생성후에만 호출 가능한 메소드
		return no2;//객체 생성전 생성되는 변수
	}


//	static void setNo1(int n) {	//객체 생성전 호출 가능한 메소드
//		no1 = n;//객체 생성시 생성되는 변수,  오류남
//	}

	static void setNo2(int n) {//객체 생성전 호출 가능한 메소드
		no2 = n;//객체 생성전 생성되는 변수
	}

	
	static{
		System.out.println(1);
	}
	
	public static void main(String[] args) {
		System.out.println(no2);//0
		
		Static1 s1 = new Static1();
		System.out.println(s1.no1+" "+no2);//1 1

		Static1 s2 = new Static1();
		System.out.println(s1.no1+" "+no2);//1 2
		
		//java.lang.Integer 클래스의 메소드
		//"3"문자열 -> 3이라는 int로 변환하기
		//"3"String 타입 parameter / 3반환타입 int
		
//		System.out.println(Integer.parseInt("3"));		
		int v = Integer.parseInt("3");
		System.out.println(v);
		
		byte b = Byte.parseByte("3");
		
		float f = Float.parseFloat("3");
		
		char c = 'a';
		c = 97;
		System.out.println(c); // A
		
		int i2 = c;
		i2 = 'A';
		System.out.println(i2);
		
		/*
		 * 문자열 객체의 데이터 길이 반환 메소드 : length()
		 * int length(){} // static 있으면 안됨. 객체가 있어야함
		 * static int length(String v){} // static 있어도 됨. 인자로 String주니까
		 */
		
		/*
		 * ?문자열의 index값으로 한 음절만 착출해서 아스키 번호 출력해 보기
		 */
		String v2 = "ABC";
		//65가 나오게
		int v3 = v2.charAt(0); //A만 뽑아서 int 타입으로 대입
		System.out.println(v3); // 65
		
	}
	
	static{
		System.out.println(2);
	}
}
