/*???
 * customer.properties파일 read해서 해당 정보로
 * 그 수만큼 Customer객체 생성하고
 * 생성된 객체의 데이터들을 콘솔창에 출력해 보기
 * 
 * step02 : 이름으로 검색
 */
package step03.api;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;

import model.domain.Customer;

public class ApiTest3 {

	static ArrayList<Customer> a = new ArrayList<>() ;	
	
	static{
		
		//Properties 파일로 부터 데이터 활용 가능한 객체
		Properties info = new Properties();
		//info.properties 파일을 Properties객체가 사용 가능하게 인식시키는 메소드
		try {
			info.load((new FileReader("customer.properties")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Iterator<String> keyAll = info.stringPropertyNames().iterator();
		
		String key = null;
		String[] value = null;
		
		//데이터를 하나씩 새로운 배열에 저장
		while(keyAll.hasNext()){
			key = keyAll.next(); 
			value = info.getProperty(key).split(",");
			a.add(new Customer(value[0], Integer.parseInt(value[1])));				
		}
	}
	
	static void printAll(){
		for(Customer c : a){
			System.out.println(c);
		}
	}
	
	static void search(String name){
		Customer cust = null;
		for(int i = 0; i < a.size() ; i++){
			cust = a.get(i);
			if(cust.getName().equals(name)){
				System.out.println(cust.toString());
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("모두 출력");
		printAll();
		System.out.println("-----------------------------");
		System.out.println("이름으로 검색");
		search("이태현");
	}
}
