/*
 * 주요 API
 * 1. String 
 * 		- ""만으로 자동 객체
 *  	- 절대 불변
 *  	- 실시간 가변적인 문자열 표현엔 부적합
 *  		(해결책 : java.lang.StringBuffer & java.lang.Builder)
 *  	- JDK1.5까지 문자열 내용 수정 속도가 저하
 *  	- JDK1.5 부터는 문자열 내용 수정시 속도 향상
 *  2. 데이터 구조
 *  	1. text - 구조화 개별 처리
 *  	2. CSV - 일반 쉼표가 기준으로 데이터 구분
 *  	3. JSON[Java Script Object Notation]
 *  		- key와 value가 매핑된 데이터 구조
 *  		- 모바일/웹에서 가장 사용 빈도가 높다
 *  	4. xml
 *  	5. properties
 *  		- key와 value가 =구분자로 매핑 구조
 *  		- 영어, 숫자를 제외한 모든 언어는 유니코드로 표현해야 함.
 *  			(이클립스 등은 자동 변환 기능 포함)
 *  		- jdk/bin/유니코드로 변환해주는 프로그램도 존재
 */	
package step03.api;

public class ApiTest1 {
	static String m1(){
		return "지빈,경진,소연,태수";
	}
	public static void main(String[] args) {
		//? m1() 반환값을 String[]로 변환
		//배열 각 index 내부에는 개별 친구들 이름이 저장
		//?힌트 - String 클랙스 구분자로 문자열 분해 가능한 메소드 있나?
		//index 2의 이름 출력하기
		
		String[] all = m1().split(",");
		System.out.println(all[2]);
		
		
	}

}
