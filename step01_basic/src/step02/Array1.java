/*
 * 학습내용
 * 1. 배열 학습
 * 2. 특징
 * 		1. 모든 배열은 무조건 객체
 * 		2. 배열 크기는 불변
 * 			- 동적 메모리가 필요한 경우 java.util List API를 사용
 * 		3. 무조건 length라는 배열 크기값 보유한 속성 자동 생성
 * 3. JDK1.5 버전 부터 추가된 반복문 추가 학습
 * 		
 */

/*
 * Heap : 생성된 객체만 저장
 * 객체 생성시 초기화 되는 단계
 * 			메모리 생성 -> 각 멤버 변수들 초기값으로 초기화 -> 명시적 초기화 -> 생성자 초기화
 */

package step02;

import model.domain.Person; // .*은 가급적 쓰지마시오

public class Array1 {
	// int 타입인 기본 타입으로 배열 생성 및 반복문 활용해서 출력
	//step01 : 선언, 생성, 초기화 분리
	//step02 : 선언, 생성, 초기화 한문장으로 처리
	static void m1(){
		//step01
		int[] i = null; //선언  //int i[]가능
		i = new  int[3];//생성
		i[0] = 1; //초기화
		i[1] = 2;
		i[2] = 3;
		
		//step02
		int[] i2 = {1, 2, 3};
		
		//정통 반복문
		for(int index = 0; index < i2.length ; index++){
			System.out.println(i2[index] + "\t");
		}
		System.out.println();
		//jdk1.5 추가된 반복문
		for(int v : i2){
			System.out.println(v + "\t");
		}
	}
	
	//Person 참조 타입의 배열 생성, 반복문 출력
	//? step02 단계 : 선언, 생성, 초기화 한문장으로 처리
	//new Person(); new Person("master", "w25");
	static void m2(){
		Person[] all = {new Person("박지빈","123"), 
								  new Person("최윤진","123"), 
								  new Person("김장원","123"), 
								  new Person("사민역","123")};

		//? 신반복문 이름(getName()) 출력
		for(Person v : all){
			System.out.println(v.getId());
		}
	}
	
	public static void main(String[] a){
		m1();
		System.out.println();
		m2();
	}

}
