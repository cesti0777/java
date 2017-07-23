/*�н�����
 * 1. ==
 * 		1. �⺻ Ÿ�� : �� ��
 * 		2. ��ü Ÿ�� : �ּҰ� ��
 * 
 * 2. ���ڿ� �����Ͱ� �� �޼ҵ� : equals()
 * 		1. java.lang.Object���� ����
 * 			- ��ü�� �ּҰ� �� ����
 * 			- public boolean equals(Object o){}
 * 		2. ���� Ŭ������ ��κ� ������
 * 			- ������ Ÿ�Կ� ���ؼ� ���� �ٸ� ��ü�� ���밪 ��
 */

package step01;

import model.domain.Customer;

public class PolyTest2 {
	//PolyTest2 Ÿ�Կ� ���ؼ��� true ��ȯ
	public boolean equals(Object o){
		boolean result = false;
		if(o instanceof PolyTest2){
			result = true;
		}
		return result;
	}
	
	public static void main(String[] args) {
		PolyTest2 p = new PolyTest2();
		PolyTest2 p2 = new PolyTest2();
		System.out.println(p.equals(p2));//true
		
		System.out.println("string".equals("a"));
		System.out.println("string".equals("String"));
		
		Customer p3 = new Customer("AAA", 20);
		Customer p4 = new Customer("BBB", 30);
		Customer p5 = new Customer("AAA", 20);
		
		System.out.println("------------------");
		
		System.out.println(p3.equals(p4));
		System.out.println(p3.equals(p5));
		
		
	}

}
