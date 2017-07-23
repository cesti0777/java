package step02.util;

import java.util.HashMap;

import model.domain.Person;

public class HashMap1 {

	static void m1(){
		HashMap m = new HashMap();
		m.put("key1", "������");
		m.put("key2", "�����");
		
		System.out.println(m.get("key1"));
		System.out.println(m.get("key5")); // null
		
	}
	
	/*???
	 * HadhMap�� �� �ֺ� ���� 3���� ������ id(�̸������� ����)
	 * Person ��ü ���� �����ؼ� ������
	 * key��  value�� id���� ����ϱ�
	 */
	static void m2(){
		HashMap<String, Person> hm = new HashMap<String, Person>();
		
		hm.put("id1", new Person("������" ,"123"));
		hm.put("id2", new Person("�����" ,"123"));
		hm.put("id3", new Person("���ҿ�" ,"123"));
		hm.put("id4", new Person("���¼�" ,"123"));
				
		System.out.println(hm.get("id1").getId()); // ���׸����� �������� �޼ҵ� ȣ��� ����ȯ �ʿ�
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
