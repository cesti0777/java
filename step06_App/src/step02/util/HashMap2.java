package step02.util;

import java.util.HashMap;
import java.util.Iterator;

public class HashMap2 {

	// �� �޼ҵ�� �ٸ� �����ڰ� �����ؼ� ȣ�� ���Ѹ� �ο��� �޼ҵ� ����
	// key���� �𸣴� ���·� ������ �� Ȱ��
	static HashMap<String, String> getDatas(){
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("k1", "������");
		hm.put("k2", "�����");
		hm.put("k3", "���ҿ�");
		hm.put("k4", "���¼�");
		hm.put("k4", "������");
		hm.put("k4", "��ȭ��");
		
		return hm;
	}
	
	/*
	 * key�� �𸥴�.. ��� �ڵ��ؾ� �ϴ���?
	 * ��Ʈ : key�� �ߺ� ���� Ÿ���� setŸ��
	 * 			setŸ���� Iterator API�� �ϳ��� ������ ����� ����
	 */
	
	public static void main(String[] args) {
		HashMap<String, String> datas = getDatas();
	
		//��� ���� : key�� = value��
		Iterator<String> all = datas.keySet().iterator();
		String s= null;
		while(all.hasNext()){
			s = all.next();
			System.out.println(s +" = "+ datas.get(s));
		}		
	}
}
