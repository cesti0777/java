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
			System.out.println("���� ���� �����մϴ�");
			return false;
		}		
	}
	
	public void deposit(int money) {
		setcMoney(getcMoney()+money);
		System.out.println("��� �Ϸ�");
	}
	
	
	@Override
	public String toString() {
		return "Customer [�̸� : "+ getpName() + 
										" / ���� : "+getpAge() + 
										" / ������ : "+cMoney +
										" / ���� ��ȣ : " + account.getAccountNum() +
										" / ���� �ܰ� : " + account.getaMoney() + "]";
										
	}
	
	
	










//	void cwithdraw(int money, int account, String pw) {
//		if (account == a.getAccount() && pw.equals(a.getPw())) {
//			if (cMoney > money) {
//				cMoney = cMoney + money;
//				a.adeposit(money);
//			} else {
//				System.out.println("���� �����ؼ� ��� ����");
//			}
//
//		} else {
//			System.out.println("���¶� ��й�ȣ ����");
//		}
//	}
//
//	void cdeposit(int money, int account, String pw) {
//		if (account == a.getAccount() && pw.equals(a.getPw())) {
//			cMoney = cMoney - money;
//			a.awithdraw(money);
//		} else {
//			System.out.println("���¶� ��й�ȣ ����");
//		}
//	}
//
//	void accountCreate(int account, String pw) {
//		a.setAccount(account);
//		a.setaMoney(0);
//		a.setPw(pw);
//		Bank b = new Bank();
//		b.setAccount(a);
//		System.out.println("����: "+getpName()+"  "+"���¹�ȣ : "+a.getAccount()+"�� ���»����Ϸ�");
//	}

}
