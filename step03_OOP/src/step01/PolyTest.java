/*
 * 학습내용
 * 1. 다형성이랑?
 * 		- 상위 타입의 변수로 하위 타입 객체들 참조
 * 2. 전제조건
 *  	- 상속 관계가 전제조건
 * 3. 장점
 *  	- 코드의 재사용성 극대화
 * 4. 일부 현 추세
 * 		- 상속, 다형성을 빈번히 사용할 경우 관계형성이 안된 코드들 보다는 실행 속도가 더디다는 평도 있음
 * 		- 상속, 다형성이 곡 필요한 경우 권장하기도 함
 */

package step01;

import model.domain.Book;
import model.domain.Person;

public class PolyTest {
	
	
	static Object m(){//Object o = "data";
		return "data";//String
	}
	
	//다형성이 적용된 배열
	static Object[] m2(){
		Object[] v = new Object[3];
		v[0] = "data";
		v[1] = new Integer(3);
		v[2] = new Byte("2");
		return v;
	}
	//? 배열을 받아서 length 속성 사용하시고, print/println() 에서
	//자동 호출하는 toString()활용해서 결과값 출력하기
	static void m3(Object[] o){
		for(int i = 0 ; i < o.length ; i++){
			System.out.println(o[i].toString());
		}
	}
	public static void main(String[] args) {
		System.out.println("---1. 형변환 review---");
		String v = (String)m();
		System.out.println(v.length());
		
		System.out.println(((String)m()).length());
		System.out.println("---2. 다형성이 적용된 배열 및 재정의 메소드 review---");
		m3(m2());
		
		System.out.println("---3. 객체 타입 비교 연산자 : instanceof---");
		System.out.println(v instanceof Object);//t
		
		Integer a = new Integer(3);
		String b = "string";
		System.out.println(a instanceof Object);//t
		System.out.println(b instanceof Object);//t
		System.out.println(a instanceof Integer);//t
		
		/* instanceof 연산자 : 상속 관계의 타입끼리만 비교가 가능
		System.out.println(b instanceof Integer);//제약조건 error
		*/
		
		Person p = new Person("master", "gpfqk");
		Book k = new Book("신과 함께", "123");
		
		m4(p);
		m4(k);
		
		System.out.println("---4. step02 level up : instanceof---");
		m5(p);
		m5(k);
		
	}
	/*
	 * Person인 경우 Person만의 getId()
	 * Book인 경우 Book의 getTitle() 호출
	 * 다형성 변수를 자식만의 멤버 호출 불가. 반드시 형변환 후 자식만의 맴버 호출
	 */
	
	static void m5(Object o) {
		if(o instanceof Person){
			System.out.println(((Person) o).getId());
		}
		else if(o instanceof Book){
			System.out.println(((Book) o).getTitle());
		}
	}
	
	
	//Book 타입인 경우에만 "책"출력
	static void m4(Object o){
		if(o instanceof Person){
			System.out.println("Person 타입 입니다.");
		}
		else if(o instanceof Book){
			System.out.println("Book 타입 입니다.");
		}
	}
}
