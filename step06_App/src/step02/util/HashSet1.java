package step02.util;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
	
	//HashSet �� ����� �����Ͱ����� Iterator api����ϼ� �ϳ��� �� line���� ����ϱ�
	static void m1(HashSet<Object> set){
		Iterator<Object> all = set.iterator();
		while(all.hasNext()){
			System.out.println(all.next());
		}
	}
	
	//? ���������� �� ���׸� Ȱ�� �ڵ�� HashSet API���
	static void m2(){
		HashSet<String> set = new HashSet<>();
		set.add("e");
		set.add("eww");
		set.add("wee");
		set.add("e67ww");
		
		//? ���پ� ��� - ���ڿ� ���̸� ���(String Ŭ�������� length())
		Iterator<String> all = set.iterator();
		String s = null;
		while(all.hasNext()){//������ �����ϳ�?
			s = all.next();
			System.out.println(s+"�� length : " + s.length());
		}
	}
	
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(3); //set.add(new Integer(3));
		set.add(5.6);
		set.add("a");
		set.add(35);
		set.add(5.6);
		set.add("aqq");
		System.out.println(set.toString()); // �����ִ� 5.6�� 13���β�
		m1(set);
		System.out.println("------------");
		m2();
	}

}
