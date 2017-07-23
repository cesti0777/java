/* ???
 * customer.properties 파일 read해서 해당 정보로 
 * 그 수만큼 Customer 객체생성하시고
 * 생성된 객체의 데이터들을 콘솔창에 출력해 보기
 * 
 * 요구사항 도출 -> 분석, 설계시 확장성 고려한 설계 
 * -> 개발 설계 -> 개발 -> test -> 서비스
 *
 * step02 : 이름으로 검색
 */
package step03.api;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;

import model.domain.Customer;

public class ApiTest3_2 {

	static ArrayList<Customer> all = new ArrayList<>();
	static{
		Properties info = new Properties();
		try {
			info.load(new FileReader("customer.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		Iterator<String> keyAll = info.stringPropertyNames().iterator();
		String key = null;
		String [] value = null;
		
		while(keyAll.hasNext()){
			key = keyAll.next();
			value = info.getProperty(key).split(",");
			all.add(new Customer(value[0], Integer.parseInt(value[1])));			
		}
	}
	
	static void printAll(){
		for(Customer c : all){
			System.out.println(c);
		}
	}
	
	//이름으로 검색하는 메소드
	static Customer search(String name){
		for( Customer c : all){
			if(c.getName().equals(name)){
				return c;
			}
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		printAll();
		System.out.println("------검색한 친구-------");
		System.out.println(search("한상유"));
	}

}




