/*
 * 로직
 * - info.properties 파일로 부터 key로 데이터 read해서 각 데이터들 화면에 출력
 * 개발 단계
 * 1단계 : properties자바 소스로 read
 * 2단계 : key로 데이터값 read
 * 3단계 : , 구분자로 데이터 분해
 * 4단계 : 분해된 데이터의 index에 맞게 데이터 출력
 * 
 * properties 파일 read : 
 * 		- Properties 객체 생성
 * 		- load(), 2byte 단위로 read 가능한 객체 생성(FileReader)
 * properties파일로 부터 key를 먼저 read
 * 		- stringPropertyNames() : Set 객체로 반환
 * 		- 하나하나의 데이터 필요 따라서 Iterator 객체 생성
 * read한 key로 value값 또 read
 * 		- Properties 객체로 부터 getProperty(String key) 로 Stringr값으로 반환
 * value 가공해서 배열에 저장
 * 		- 구분자로 데이터 분해해서 저장
 * 배열에 저장된 데이터를 화면에 출력
 * 		- 다수의 데이터 따라서 반복.....
 */ 


package step03.api;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Properties;

public class ApiTest2Properties {

	public static void main(String[] args) {
		try {
			//Properties 파일로 부터 데이터 활용 가능한 객체
			Properties info = new Properties();
			//info.properties 파일을 Properties객체가 사용 가능하게 인식시키는 메소드
			info.load((new FileReader("info.properties")));
			
			Iterator<String> keyAll = info.stringPropertyNames().iterator();
			
			String ages[] = null;
			String names[] = null;
			String key = null;
			String value = null;
	
			//데이터를 하나씩 새로운 배열에 저장
			while(keyAll.hasNext()){
				key = keyAll.next(); 
				value = info.getProperty(key);
				if(key.equals("key1")){
					names = value.split(",");
				}
				else if(key.equals("key2")){
					ages = value.split(",");
				}
			}
			
			//데이터를 화면에 출력
			for(int i = 0; i < ages.length ; i++){
				System.out.println(names[i]+"("+ages[i]+"세)");
			}
		} catch (Exception e) {
			e.printStackTrace();		
		}
		
	}

}
