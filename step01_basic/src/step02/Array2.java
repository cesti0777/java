package step02;

import model.domain.Person; // ctrl+shift+o : �ʿ� ��Ű�� �ڵ� import
													 //java.lang�� import���ص� �Ǵ� ������ ��Ű��
public class Array2 {
	//�ٽɷ��� = business logic = model = biz
	//Person ��ü��� �迭 �����ؼ� ��ȯ(return)
	public Person[] getPerson(){
		Person[] all = {new Person("������","cesti0777"), new Person("�����","gpfqk")};
		return all;
	}
		
	//ȭ��� ��� ���� = view = presentation logic
	//Person �迭�� �޾Ƽ� �ݺ������� ���(argument or parameter)
	public void viewPerson(Person[] v){
		for(Person p : v){
			System.out.println(p.getId());
		}
	}
	
	public static void main(String[] args) {
		Array2 a = new Array2();
		a.viewPerson(a.getPerson());
	}
}
