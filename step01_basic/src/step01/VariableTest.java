/*
 * 1. 선언 위치에 따른 변수 구분
 * 		1. 맴버 변수
 * 			- class{}내부에 선언
 * 			- 실제 프로그램에서 사용 가능한 시점? 
 * 			    : 객체 생성 직후
 * 			- 객체 생성후 사용시 전처리 초기화 필수 아님
 * 				: 객체 생성시 기본 값들로 자동 초기화
 *
 * 		2. 로컬 변수
 * 			- 생성자와 메소드() 또는 {} 내부에 선언되는 변수
 * 			- 초기화 없이 절대절대절대 사용 불가
 * 				: 실행을 위한 버그를 최소화 하는 개발 기법
 * 				로컬 변수들은 선언과 동시에 무조건 초기화 권장
 * 
 * 2. 변수 특징
 * 3. 변수 타입
 * 4. 기본 타입의 형변환
 * 5. 실제 변수를 사용하기 위해서는 
 * 		반드시 메모리에 해당 타입에 맞는 변수명의 공간 생성해서 사용
 * 		- 객체 생성
 */

package step01;

public class VariableTest {
	String data = "멤버";	
	String data2;
	
	//개발자가 미코딩시 자동 생성되는 구성 요소
	VariableTest(){} // 생성자
	
	public static void main(String[] args) { // args는 로컬 변수
		String data = "로컬";  
		//System.out.println(data2); // 객체 생성 전이라 불가
		
		//객체 생성 및 멤버 변수 메모리 확보 및 값 저장
		VariableTest v = new VariableTest();
		
		/*
		 * 실행 단계 
		 * 1. main 메소드 호출
		 * 2. String 타입의 data 변수 선언(메모리 생성)
		 * 3. 로컬 문자열이 생성
		 * 4. 로컬 문자열 주소값을 data변수에 대입
		 * 5. VariableTest 변수 선언(생성)
		 * 6. 객체 생성
		 * 7. 생성된 객체의 주소값을 변수에 대입
		 */
		
		
		System.out.println(v.data2);
		System.out.println(v);//step01.VariableTest@15db9742
		System.out.println(v.data+" "+v.data2);//멤버 null
	}

}
