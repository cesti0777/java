package step02;

import model.domain.Person;

public class Array3 {
	//�迭 �����ؼ� ��ȯ�ϱ�
	static Person[] getAll(){
		Person[] all = {new Person("������","cesti0777"), new Person("�����","gpfqk")};
		return all;
	}
		
	//�迭�� ����ϱ�
	static void view(Person[] all){
		for(Person v : all){
			System.out.println(v.toString());
		}
	}
	
	//Person ��ü �޾Ƽ� �� �����ϱ�
	 static void idChange(Person v){
		 v.setId("newID");
	 }
	
	 //��� : �� �̻��� �迭 ������ ���� �Ͻ��� ���� �迭�� Person ��ü �ϳ� �����ؼ� �ٲٱ�
	public static void main(String[] args) {
		Person[] person = getAll();
		view(person);
		idChange(person[1]);
		view(person);
	}

}
