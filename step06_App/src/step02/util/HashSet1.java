package step02.util;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
	
	//HashSet 에 저장된 데이터값들을 Iterator api사용하서 하나씩 한 line으로 출력하기
	static void m1(HashSet<Object> set){
		Iterator<Object> all = set.iterator();
		while(all.hasNext()){
			System.out.println(all.next());
		}
	}
	
	//? 다형성이해 및 제네릭 활용 코드로 HashSet API사용
	static void m2(){
		HashSet<String> set = new HashSet<>();
		set.add("e");
		set.add("eww");
		set.add("wee");
		set.add("e67ww");
		
		//? 한줄씩 출력 - 문자열 길이를 출력(String 클래스만의 length())
		Iterator<String> all = set.iterator();
		String s = null;
		while(all.hasNext()){//데이터 존재하나?
			s = all.next();
			System.out.println(s+"의 length : " + s.length());
		}
	}
	
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(3); //set.add(new Integer(3));
		set.add(5.6);
		set.add("a");
		set.add(35);
		set.add(5.6);
		set.add("aqq");
		System.out.println(set.toString()); // 남아있는 5.6은 13라인꺼
		m1(set);
		System.out.println("------------");
		m2();
	}

}
