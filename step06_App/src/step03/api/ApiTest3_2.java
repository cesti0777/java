/* ???
 * customer.properties ���� read�ؼ� �ش� ������ 
 * �� ����ŭ Customer ��ü�����Ͻð�
 * ������ ��ü�� �����͵��� �ܼ�â�� ����� ����
 * 
 * �䱸���� ���� -> �м�, ����� Ȯ�强 ����� ���� 
 * -> ���� ���� -> ���� -> test -> ����
 *
 * step02 : �̸����� �˻�
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
	
	//�̸����� �˻��ϴ� �޼ҵ�
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
		System.out.println("------�˻��� ģ��-------");
		System.out.println(search("�ѻ���"));
	}

}




