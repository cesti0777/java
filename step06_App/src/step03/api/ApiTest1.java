/*
 * �ֿ� API
 * 1. String 
 * 		- ""������ �ڵ� ��ü
 *  	- ���� �Һ�
 *  	- �ǽð� �������� ���ڿ� ǥ���� ������
 *  		(�ذ�å : java.lang.StringBuffer & java.lang.Builder)
 *  	- JDK1.5���� ���ڿ� ���� ���� �ӵ��� ����
 *  	- JDK1.5 ���ʹ� ���ڿ� ���� ������ �ӵ� ���
 *  2. ������ ����
 *  	1. text - ����ȭ ���� ó��
 *  	2. CSV - �Ϲ� ��ǥ�� �������� ������ ����
 *  	3. JSON[Java Script Object Notation]
 *  		- key�� value�� ���ε� ������ ����
 *  		- �����/������ ���� ��� �󵵰� ����
 *  	4. xml
 *  	5. properties
 *  		- key�� value�� =�����ڷ� ���� ����
 *  		- ����, ���ڸ� ������ ��� ���� �����ڵ�� ǥ���ؾ� ��.
 *  			(��Ŭ���� ���� �ڵ� ��ȯ ��� ����)
 *  		- jdk/bin/�����ڵ�� ��ȯ���ִ� ���α׷��� ����
 */	
package step03.api;

public class ApiTest1 {
	static String m1(){
		return "����,����,�ҿ�,�¼�";
	}
	public static void main(String[] args) {
		//? m1() ��ȯ���� String[]�� ��ȯ
		//�迭 �� index ���ο��� ���� ģ���� �̸��� ����
		//?��Ʈ - String Ŭ���� �����ڷ� ���ڿ� ���� ������ �޼ҵ� �ֳ�?
		//index 2�� �̸� ����ϱ�
		
		String[] all = m1().split(",");
		System.out.println(all[2]);
		
		
	}

}
