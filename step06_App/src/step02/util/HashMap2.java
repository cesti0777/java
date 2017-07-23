package step02.util;

import java.util.HashMap;
import java.util.Iterator;

public class HashMap2 {

	// 현 메소드는 다른 개발자가 구현해서 호출 권한만 부여한 메소드 가정
	// key들은 모르는 상태로 데이터 값 활용
	static HashMap<String, String> getDatas(){
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("k1", "박지빈");
		hm.put("k2", "백경진");
		hm.put("k3", "강소연");
		hm.put("k4", "김태수");
		hm.put("k4", "최윤진");
		hm.put("k4", "강화백");
		
		return hm;
	}
	
	/*
	 * key를 모른다.. 어떻게 코딩해야 하는지?
	 * 힌트 : key는 중복 불허 타입의 set타입
	 * 			set타입은 Iterator API로 하나씩 데이터 사용이 가능
	 */
	
	public static void main(String[] args) {
		HashMap<String, String> datas = getDatas();
	
		//출력 형식 : key값 = value값
		Iterator<String> all = datas.keySet().iterator();
		String s= null;
		while(all.hasNext()){
			s = all.next();
			System.out.println(s +" = "+ datas.get(s));
		}		
	}
}
