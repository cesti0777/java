package banking.view;

import banking.model.dto.Account;
import banking.model.dto.Banker;
import banking.model.dto.Customer;
import banking.model.dto.Person;
import banking.service.BankingService;

public class RunningStartView {

	public static void main(String[] args) {
		//��
		Person c1 = new Customer("��ȭ��", 26, 1000000, new Account("000-000", "hello1", 500000));
		Person c2 = new Customer("������", 27, 2000000, new Account("111-111", "hello2", 1000000));
	
		//�����
		Person b1 = new Banker("�����1", 30, 123);
		Person b2 = new Banker("�����2", 35, 456);
		
		
		BankingService service = BankingService.getInstance();
				
		System.out.println("***** Person ���� �� ��� Person �˻� *****");
		service.personInsert(c1);
		service.personInsert(c2);
		service.personInsert(b1);
		service.personInsert(b2);
		
		Person[] allPersonList = service.getAllPerson();	
		RunningEndView.personListView(allPersonList);	
		System.out.println();
		
		System.out.println("***** ��ȭ���� �����1���� 500000�� �Ա� ��û�ϱ� *****");
		service.deposit((Customer)c1,  (Banker)b1, 500000, "hello1");
		RunningEndView.personView(c1);
		System.out.println();
		
		System.out.println("***** �������� �����1���� 300000�� �Ա� ��û�ϱ� *****");
		service.deposit((Customer)c2,  (Banker)b1, 300000, "hello2");
		RunningEndView.personView(c2);
		System.out.println();
		
		System.out.println("***** ��ȭ���� �����1���� 700000�� ��� ��û�ϱ� *****");
		service.withdraw((Customer)c1,  (Banker)b1, 700000, "hello1");
		RunningEndView.personView(c1);
		System.out.println();
		
		System.out.println("***** �������� �����1���� 1000000�� ��� ��û�ϱ� *****");
		service.withdraw((Customer)c2,  (Banker)b1, 1000000, "hello2");
		RunningEndView.personView(c2);
		System.out.println();
		
		System.out.println("***** �������� �Ա� ��û ��й�ȣ ���� *****");
		service.deposit((Customer)c2,  (Banker)b1, 300000, "hihihi");
		RunningEndView.personView(c2);
		System.out.println();
		
		System.out.println("***** ��ȭ���� �����1���� 1500000�� �Ա� ��û�ϱ�(������ ����) *****");
		service.deposit((Customer)c1,  (Banker)b1, 1500000, "hello1");
		RunningEndView.personView(c1);
		System.out.println();
		
		System.out.println("***** c1�� ����? *****");
		RunningEndView.whoIs(c1);
		System.out.println();
		System.out.println("***** c2�� ����? *****");
		RunningEndView.whoIs(c2);
		System.out.println();
		System.out.println("***** b1�� ����? *****");
		RunningEndView.whoIs(b1);
		System.out.println();
		System.out.println("***** b2�� ����? *****");
		RunningEndView.whoIs(b2);
		System.out.println();
		
	}
}
