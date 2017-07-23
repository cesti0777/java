/*
 * �н�����
 * 1. �������̶�?
 * 		- ���� Ÿ���� ������ ���� Ÿ�� ��ü�� ����
 * 2. ��������
 *  	- ��� ���谡 ��������
 * 3. ����
 *  	- �ڵ��� ���뼺 �ش�ȭ
 * 4. �Ϻ� �� �߼�
 * 		- ���, �������� ����� ����� ��� ���������� �ȵ� �ڵ�� ���ٴ� ���� �ӵ��� ����ٴ� �� ����
 * 		- ���, �������� �� �ʿ��� ��� �����ϱ⵵ ��
 */

package step01;

import model.domain.Book;
import model.domain.Person;

public class PolyTest {
	
	
	static Object m(){//Object o = "data";
		return "data";//String
	}
	
	//�������� ����� �迭
	static Object[] m2(){
		Object[] v = new Object[3];
		v[0] = "data";
		v[1] = new Integer(3);
		v[2] = new Byte("2");
		return v;
	}
	//? �迭�� �޾Ƽ� length �Ӽ� ����Ͻð�, print/println() ����
	//�ڵ� ȣ���ϴ� toString()Ȱ���ؼ� ����� ����ϱ�
	static void m3(Object[] o){
		for(int i = 0 ; i < o.length ; i++){
			System.out.println(o[i].toString());
		}
	}
	public static void main(String[] args) {
		System.out.println("---1. ����ȯ review---");
		String v = (String)m();
		System.out.println(v.length());
		
		System.out.println(((String)m()).length());
		System.out.println("---2. �������� ����� �迭 �� ������ �޼ҵ� review---");
		m3(m2());
		
		System.out.println("---3. ��ü Ÿ�� �� ������ : instanceof---");
		System.out.println(v instanceof Object);//t
		
		Integer a = new Integer(3);
		String b = "string";
		System.out.println(a instanceof Object);//t
		System.out.println(b instanceof Object);//t
		System.out.println(a instanceof Integer);//t
		
		/* instanceof ������ : ��� ������ Ÿ�Գ����� �񱳰� ����
		System.out.println(b instanceof Integer);//�������� error
		*/
		
		Person p = new Person("master", "gpfqk");
		Book k = new Book("�Ű� �Բ�", "123");
		
		m4(p);
		m4(k);
		
		System.out.println("---4. step02 level up : instanceof---");
		m5(p);
		m5(k);
		
	}
	/*
	 * Person�� ��� Person���� getId()
	 * Book�� ��� Book�� getTitle() ȣ��
	 * ������ ������ �ڽĸ��� ��� ȣ�� �Ұ�. �ݵ�� ����ȯ �� �ڽĸ��� �ɹ� ȣ��
	 */
	
	static void m5(Object o) {
		if(o instanceof Person){
			System.out.println(((Person) o).getId());
		}
		else if(o instanceof Book){
			System.out.println(((Book) o).getTitle());
		}
	}
	
	
	//Book Ÿ���� ��쿡�� "å"���
	static void m4(Object o){
		if(o instanceof Person){
			System.out.println("Person Ÿ�� �Դϴ�.");
		}
		else if(o instanceof Book){
			System.out.println("Book Ÿ�� �Դϴ�.");
		}
	}
}
