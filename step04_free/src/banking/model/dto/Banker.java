package banking.model.dto;

public class Banker extends Person{
	//�������
	private int bankerNum;

	//������
	public Banker(){}
	public Banker(String pName, int pAge, int bankerNum) {
		super(pName, pAge);
		this.bankerNum = bankerNum;
	}
	
	//�޼ҵ�
	public int getBankerNum() {
		return bankerNum;
	}
	public void setBankerNum(int bankerNum) {
		this.bankerNum = bankerNum;
	}
	
	public void deposit(Customer c, int money) {
		Account a = c.getAccount();			
		a.setaMoney(a.getaMoney()+money);
		System.out.println("�Ա� �Ϸ�");	
	}
	
	public boolean withdraw(Customer c, int money) {
		Account a = c.getAccount();	
		if(money < a.getaMoney()){
			a.setaMoney(a.getaMoney()-money);	
			return true;
		}
		else{
			System.out.println("���¿� �ܰ� �����մϴ�");
			return false;
		}
	}
	
	
	
	@Override
	public String toString() {
		return "Customer [�̸� : "+ getpName() + 
				" / ���� : "+getpAge() + 
				" / �����ȣ : "+bankerNum + "]";
	}
}
