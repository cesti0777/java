/*
 * �н�����
 * 1. java.util package
 * 2. �迭�� ��� ��, ���� �޸�, ��ü�� ���� �� Ȱ�� ������ Ÿ��
 * 3. jdk1.5 ���� �߰��� ����
 * 4. jdk1.7 ���� �߰��� ����
 * 5. jsk1.5 API���� ��ȯ�� ǥ����
 * 6. ��� �� ���� : ������ ����, ����, ���� �� ������ ������ ����
 * 		1. ����
 * 			public boolean add(Object v){}
 * 		2. ����
 * 			public Object remove(index i){}
 * 		3. ��ȯ
 * 			public Object get(int i){}
 */

package step02.util;

import java.util.ArrayList;

public class ArrayList1 {
	static void m1(){
		//11��° ������ ����� 10���� �޸� �ڵ� �߰�����
		//21���� ������ ����� 10���� �޸� �ڵ� �߰�����
		ArrayList a = new ArrayList();//10���� ���� ����
		a.add("string");//Index 0��° ����
		a.add(new Integer(3));//Index 1��° ����
		a.add("test");//Index 2��° ����
		
		//0��° ������ ���ڿ� ���� ���
		String v = (String)a.get(0);//����� Object Ÿ������ ��ȯ. ���� ����ȯ �ʼ�
		System.out.println(v.length());
		
		//index 0��° ����ϱ�
		System.out.println(a.get(0));
		System.out.println("���� ������ ���� : "+a.size());
		
		//index 0��° ������ ����
		a.remove(0);
		System.out.println(a.get(0)); // ����� �ڿ� ������ �����
		System.out.println("���� ������ ���� : "+a.size());
	}
	
	//jdk1.5���� �߰��� ����
	//���� �� �����ϴ� ������ Ÿ�� ���� - ���׸�
	static void m2(){
		ArrayList<String> a = new ArrayList<String>(); //���� String[] ���·� ��ȯ
		a.add("s");
		//a.add(new Integer(2)); //����. String Ÿ�Ը� ����
		a.add("t");
		
		String v = a.get(0);
		System.out.println(v);
	}
	
	static void m3(){
		ArrayList<String> a = new ArrayList<>(); //���� String[] ���·� ��ȯ
		a.add("s");
		//a.add(new Integer(2)); //����. String Ÿ�Ը� ����
		a.add("t");
		
		String v = a.get(0);
		System.out.println(v);
	}
	
	
	//? �Źݺ��� for(:
	static void m4(){
		//"a", new Integer(2), new Byte("3")���� ���� �� �� �ִ� ArrayList ��ü����
		//for�� ����ؼ� ���
		ArrayList<Object> a = new ArrayList<>();
		a.add(new Integer(2));
		a.add(new Byte("3"));
		for(Object v : a){
			System.out.println(v);
		}
		
		//String�鸸 ���� ������ ArrayList, Ÿ Ÿ�� ���� ����
		//for�� ����ؼ� ��� (��, for������ Object Ÿ�� ���Ұ�)
		ArrayList<String> a2 = new ArrayList<>();
		a2.add("�����");
		a2.add("������");
		for(String v : a2){
			System.out.println(v);
		}
	}
	
	public static void main(String[] args) {
		m1();
		m2();
		m3();
		m4();
	}

}
