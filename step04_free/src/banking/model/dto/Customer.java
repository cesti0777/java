package banking.model.dto;

public class Customer extends Person {

	private int cMoney;
	private Account account;

	public Customer(){}

	public Customer(String pName, int pAge, int cMoney, Account account) {
		super(pName, pAge);
		this.cMoney = cMoney;
		this.account = account;
	}

	public int getcMoney() {
		return cMoney;
	}

	public void setcMoney(int cMoney) {
		this.cMoney = cMoney;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public boolean withdraw(int money) {
		if(money < getcMoney()){
				setcMoney(getcMoney()-money);
				return true;
		} 
		else{
			System.out.println("가진 돈이 부족합니다");
			return false;
		}		
	}
	
	public void deposit(int money) {
		setcMoney(getcMoney()+money);
		System.out.println("출금 완료");
	}
	
	
	@Override
	public String toString() {
		return "Customer [이름 : "+ getpName() + 
										" / 나이 : "+getpAge() + 
										" / 가진돈 : "+cMoney +
										" / 계좌 번호 : " + account.getAccountNum() +
										" / 계좌 잔고 : " + account.getaMoney() + "]";
										
	}
	
	
	










//	void cwithdraw(int money, int account, String pw) {
//		if (account == a.getAccount() && pw.equals(a.getPw())) {
//			if (cMoney > money) {
//				cMoney = cMoney + money;
//				a.adeposit(money);
//			} else {
//				System.out.println("돈이 부족해서 출금 실패");
//			}
//
//		} else {
//			System.out.println("계좌랑 비밀번호 오류");
//		}
//	}
//
//	void cdeposit(int money, int account, String pw) {
//		if (account == a.getAccount() && pw.equals(a.getPw())) {
//			cMoney = cMoney - money;
//			a.awithdraw(money);
//		} else {
//			System.out.println("계좌랑 비밀번호 오류");
//		}
//	}
//
//	void accountCreate(int account, String pw) {
//		a.setAccount(account);
//		a.setaMoney(0);
//		a.setPw(pw);
//		Bank b = new Bank();
//		b.setAccount(a);
//		System.out.println("성함: "+getpName()+"  "+"계좌번호 : "+a.getAccount()+"로 계좌생성완료");
//	}

}
