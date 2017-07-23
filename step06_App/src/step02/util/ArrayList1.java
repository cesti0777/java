/*
 * 학습내용
 * 1. java.util package
 * 2. 배열과 흡사 단, 동적 메모리, 객체만 저장 및 활용 가능한 타입
 * 3. jdk1.5 부터 추가된 문법
 * 4. jdk1.7 부터 추가된 문법
 * 5. jsk1.5 API부터 변환된 표현법
 * 6. 사용 주 목적 : 데이터 저장, 수정, 삭제 즉 관리가 용이한 구조
 * 		1. 저장
 * 			public boolean add(Object v){}
 * 		2. 삭제
 * 			public Object remove(index i){}
 * 		3. 반환
 * 			public Object get(int i){}
 */

package step02.util;

import java.util.ArrayList;

public class ArrayList1 {
	static void m1(){
		//11번째 데이터 저장시 10개의 메모리 자동 추가생성
		//21번재 데이터 저장시 10개의 메모리 자동 추가생성
		ArrayList a = new ArrayList();//10개의 공간 생성
		a.add("string");//Index 0번째 저장
		a.add(new Integer(3));//Index 1번째 저장
		a.add("test");//Index 2번째 저장
		
		//0번째 데이터 문자열 길이 출력
		String v = (String)a.get(0);//저장시 Object 타입으로 변환. 따라서 형변환 필수
		System.out.println(v.length());
		
		//index 0번째 출력하기
		System.out.println(a.get(0));
		System.out.println("실제 데이터 개수 : "+a.size());
		
		//index 0번째 데이터 삭제
		a.remove(0);
		System.out.println(a.get(0)); // 지우면 뒤에 데이터 당겨짐
		System.out.println("실제 데이터 개수 : "+a.size());
	}
	
	//jdk1.5부터 추가된 문법
	//저장 및 관리하는 데이터 타입 제한 - 제네릭
	static void m2(){
		ArrayList<String> a = new ArrayList<String>(); //동적 String[] 형태로 변환
		a.add("s");
		//a.add(new Integer(2)); //오류. String 타입만 가능
		a.add("t");
		
		String v = a.get(0);
		System.out.println(v);
	}
	
	static void m3(){
		ArrayList<String> a = new ArrayList<>(); //동적 String[] 형태로 변환
		a.add("s");
		//a.add(new Integer(2)); //오류. String 타입만 가능
		a.add("t");
		
		String v = a.get(0);
		System.out.println(v);
	}
	
	
	//? 신반복문 for(:
	static void m4(){
		//"a", new Integer(2), new Byte("3")등을 저장 할 수 있는 ArrayList 객체생성
		//for문 사용해서 출력
		ArrayList<Object> a = new ArrayList<>();
		a.add(new Integer(2));
		a.add(new Byte("3"));
		for(Object v : a){
			System.out.println(v);
		}
		
		//String들만 저장 가능한 ArrayList, 타 타입 저장 제한
		//for문 사용해서 출력 (단, for문에선 Object 타입 사용불가)
		ArrayList<String> a2 = new ArrayList<>();
		a2.add("백경진");
		a2.add("박지빈");
		for(String v : a2){
			System.out.println(v);
		}
	}
	
	public static void main(String[] args) {
		m1();
		m2();
		m3();
		m4();
	}

}
