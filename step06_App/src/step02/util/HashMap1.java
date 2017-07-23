package step02.util;

import java.util.HashMap;

import model.domain.Person;

public class HashMap1 {

	static void m1(){
		HashMap m = new HashMap();
		m.put("key1", "박지빈");
		m.put("key2", "백경진");
		
		System.out.println(m.get("key1"));
		System.out.println(m.get("key5")); // null
		
	}
	
	/*???
	 * HadhMap에 내 주변 지인 3명의 정보를 id(이름값으로 가정)
	 * Person 객체 각각 생성해서 저장후
	 * key로  value중 id값만 출력하기
	 */
	static void m2(){
		HashMap<String, Person> hm = new HashMap<String, Person>();
		
		hm.put("id1", new Person("박지빈" ,"123"));
		hm.put("id2", new Person("백경진" ,"123"));
		hm.put("id3", new Person("강소연" ,"123"));
		hm.put("id4", new Person("김태수" ,"123"));
				
		System.out.println(hm.get("id1").getId()); // 제네릭으로 안했으면 메소드 호출시 형변환 필요
		// System.out.println(((Person)(hm.get("id1"))).getId());
		System.out.println(hm.get("id2").getId());
		System.out.println(hm.get("id3").getId());
		System.out.println(hm.get("id4").getId());
	}
	
	public static void main(String[] args) {
		m1();
		System.out.println("-------------");
		m2();
	}

}
