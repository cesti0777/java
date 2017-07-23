package banking.model.dto;

public class Banker extends Person{
	//멤버변수
	private int bankerNum;

	//생성자
	public Banker(){}
	public Banker(String pName, int pAge, int bankerNum) {
		super(pName, pAge);
		this.bankerNum = bankerNum;
	}
	
	//메소드
	public int getBankerNum() {
		return bankerNum;
	}
	public void setBankerNum(int bankerNum) {
		this.bankerNum = bankerNum;
	}
	
	public void deposit(Customer c, int money) {
		Account a = c.getAccount();			
		a.setaMoney(a.getaMoney()+money);
		System.out.println("입금 완료");	
	}
	
	public boolean withdraw(Customer c, int money) {
		Account a = c.getAccount();	
		if(money < a.getaMoney()){
			a.setaMoney(a.getaMoney()-money);	
			return true;
		}
		else{
			System.out.println("계좌에 잔고가 부족합니다");
			return false;
		}
	}
	
	
	
	@Override
	public String toString() {
		return "Customer [이름 : "+ getpName() + 
				" / 나이 : "+getpAge() + 
				" / 행원번호 : "+bankerNum + "]";
	}
}
