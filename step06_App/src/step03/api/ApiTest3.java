/*???
 * customer.properties���� read�ؼ� �ش� ������
 * �� ����ŭ Customer��ü �����ϰ�
 * ������ ��ü�� �����͵��� �ܼ�â�� ����� ����
 * 
 * step02 : �̸����� �˻�
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
		
		//Properties ���Ϸ� ���� ������ Ȱ�� ������ ��ü
		Properties info = new Properties();
		//info.properties ������ Properties��ü�� ��� �����ϰ� �νĽ�Ű�� �޼ҵ�
		try {
			info.load((new FileReader("customer.properties")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Iterator<String> keyAll = info.stringPropertyNames().iterator();
		
		String key = null;
		String[] value = null;
		
		//�����͸� �ϳ��� ���ο� �迭�� ����
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
		System.out.println("��� ���");
		printAll();
		System.out.println("-----------------------------");
		System.out.println("�̸����� �˻�");
		search("������");
	}
}
