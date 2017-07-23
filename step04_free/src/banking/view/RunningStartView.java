package banking.view;

import banking.model.dto.Account;
import banking.model.dto.Banker;
import banking.model.dto.Customer;
import banking.model.dto.Person;
import banking.service.BankingService;

public class RunningStartView {

	public static void main(String[] args) {
		//고객
		Person c1 = new Customer("강화백", 26, 1000000, new Account("000-000", "hello1", 500000));
		Person c2 = new Customer("박지빈", 27, 2000000, new Account("111-111", "hello2", 1000000));
	
		//은행원
		Person b1 = new Banker("은행원1", 30, 123);
		Person b2 = new Banker("은행원2", 35, 456);
		
		
		BankingService service = BankingService.getInstance();
				
		System.out.println("***** Person 생성 후 모든 Person 검색 *****");
		service.personInsert(c1);
		service.personInsert(c2);
		service.personInsert(b1);
		service.personInsert(b2);
		
		Person[] allPersonList = service.getAllPerson();	
		RunningEndView.personListView(allPersonList);	
		System.out.println();
		
		System.out.println("***** 강화백이 은행원1에게 500000원 입금 요청하기 *****");
		service.deposit((Customer)c1,  (Banker)b1, 500000, "hello1");
		RunningEndView.personView(c1);
		System.out.println();
		
		System.out.println("***** 박지빈이 은행원1에게 300000원 입금 요청하기 *****");
		service.deposit((Customer)c2,  (Banker)b1, 300000, "hello2");
		RunningEndView.personView(c2);
		System.out.println();
		
		System.out.println("***** 강화백이 은행원1에게 700000원 출금 요청하기 *****");
		service.withdraw((Customer)c1,  (Banker)b1, 700000, "hello1");
		RunningEndView.personView(c1);
		System.out.println();
		
		System.out.println("***** 박지빈이 은행원1에게 1000000원 출금 요청하기 *****");
		service.withdraw((Customer)c2,  (Banker)b1, 1000000, "hello2");
		RunningEndView.personView(c2);
		System.out.println();
		
		System.out.println("***** 박지빈이 입금 요청 비밀번호 오류 *****");
		service.deposit((Customer)c2,  (Banker)b1, 300000, "hihihi");
		RunningEndView.personView(c2);
		System.out.println();
		
		System.out.println("***** 강화백이 은행원1에게 1500000원 입금 요청하기(가진돈 부족) *****");
		service.deposit((Customer)c1,  (Banker)b1, 1500000, "hello1");
		RunningEndView.personView(c1);
		System.out.println();
		
		System.out.println("***** c1은 누구? *****");
		RunningEndView.whoIs(c1);
		System.out.println();
		System.out.println("***** c2은 누구? *****");
		RunningEndView.whoIs(c2);
		System.out.println();
		System.out.println("***** b1은 누구? *****");
		RunningEndView.whoIs(b1);
		System.out.println();
		System.out.println("***** b2은 누구? *****");
		RunningEndView.whoIs(b2);
		System.out.println();
		
	}
}
