package banking.service;

import banking.model.dto.Banker;
import banking.model.dto.Customer;
import banking.model.dto.Person;

public class BankingService {
	
	private static BankingService instance = new BankingService();
	private Person[] personList = new Person[10];
	private int index; 

	private BankingService(){}
	
	public static BankingService getInstance(){
		return instance;
	}
	
	public Person[] getAllPerson() {
		return personList;
	}
	

	//Person 추가 
	public void personInsert(Person project) {
		if(index != personList.length){
			personList[index] = project;
			index++;
		}
		else{
			System.out.println("더이상 추가할 수 없습니다.");
		}
	}

	//customer가  banker에게 입금요청
	public void deposit(Customer c, Banker b, int money, String pw) {
		if(pw.equals(c.getAccount().getPw())){
			if(c.withdraw(money)){
				b.deposit(c, money);
			}
		}
		else {
			System.out.println("비밀번호 오류");
		}	
	}
	
	//customer가  banker에게 출금요청
	public void withdraw(Customer c, Banker b, int money, String pw) {
		if(pw.equals(c.getAccount().getPw())){
			if(b.withdraw(c, money)){
				c.deposit(money);
			}
		}
		else {
			System.out.println("비밀번호 오류");
		}	
	}
	
	//Project 개수
	public int personListSize(){
		return index;
	}
}
