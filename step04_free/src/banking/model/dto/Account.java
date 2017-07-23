package banking.model.dto;

public class Account {
	private String accountNum;
	private String pw;
	private int aMoney;
	
	public Account(){}	
	public Account(String accountNum, String pw, int aMoney) {
		this.accountNum = accountNum;
		this.pw = pw;
		this.aMoney = aMoney;
	}
	
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public int getaMoney() {
		return aMoney;
	}
	public void setaMoney(int aMoney) {
		this.aMoney = aMoney;
	}
	
	
	
	
//
//	void awithdraw(int money)
//	{
//		aMoney=aMoney+money;
//	}
//	void adeposit(int money)
//	{
//		aMoney=aMoney-money;
//		
//		}
	
	
}
