package banking.model.dto;

public class Person {
	private String pName;
	private int pAge;

	public Person(){}
	public Person(String pName, int pAge) {
		this.pName = pName;
		this.pAge = pAge;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpAge() {
		return pAge;
	}

	public void setpAge(int pAge) {
		this.pAge = pAge;
	}

}
