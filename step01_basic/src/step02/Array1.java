/*
 * �н�����
 * 1. �迭 �н�
 * 2. Ư¡
 * 		1. ��� �迭�� ������ ��ü
 * 		2. �迭 ũ��� �Һ�
 * 			- ���� �޸𸮰� �ʿ��� ��� java.util List API�� ���
 * 		3. ������ length��� �迭 ũ�Ⱚ ������ �Ӽ� �ڵ� ����
 * 3. JDK1.5 ���� ���� �߰��� �ݺ��� �߰� �н�
 * 		
 */

/*
 * Heap : ������ ��ü�� ����
 * ��ü ������ �ʱ�ȭ �Ǵ� �ܰ�
 * 			�޸� ���� -> �� ��� ������ �ʱⰪ���� �ʱ�ȭ -> ����� �ʱ�ȭ -> ������ �ʱ�ȭ
 */

package step02;

import model.domain.Person; // .*�� ������ �������ÿ�

public class Array1 {
	// int Ÿ���� �⺻ Ÿ������ �迭 ���� �� �ݺ��� Ȱ���ؼ� ���
	//step01 : ����, ����, �ʱ�ȭ �и�
	//step02 : ����, ����, �ʱ�ȭ �ѹ������� ó��
	static void m1(){
		//step01
		int[] i = null; //����  //int i[]����
		i = new  int[3];//����
		i[0] = 1; //�ʱ�ȭ
		i[1] = 2;
		i[2] = 3;
		
		//step02
		int[] i2 = {1, 2, 3};
		
		//���� �ݺ���
		for(int index = 0; index < i2.length ; index++){
			System.out.println(i2[index] + "\t");
		}
		System.out.println();
		//jdk1.5 �߰��� �ݺ���
		for(int v : i2){
			System.out.println(v + "\t");
		}
	}
	
	//Person ���� Ÿ���� �迭 ����, �ݺ��� ���
	//? step02 �ܰ� : ����, ����, �ʱ�ȭ �ѹ������� ó��
	//new Person(); new Person("master", "w25");
	static void m2(){
		Person[] all = {new Person("������","123"), 
								  new Person("������","123"), 
								  new Person("�����","123"), 
								  new Person("��ο�","123")};

		//? �Źݺ��� �̸�(getName()) ���
		for(Person v : all){
			System.out.println(v.getId());
		}
	}
	
	public static void main(String[] a){
		m1();
		System.out.println();
		m2();
	}

}
