package step02.my;

public class Me {
	
	String name = "������";
	int age = 27;
	String job = "�л�";
	String school = "�Ǳ����б�";
	String major = "����Ʈ�����а�";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	Me(){}
	
	public static void main(String[] args) {
		
		Me me = new Me();
		
		System.out.println("�̸� : "+me.getName());
		System.out.println("���� : "+me.getAge());
		System.out.println("���� : "+me.getJob());
		System.out.println("�б� : "+me.getSchool());
		System.out.println("�а� : "+me.getMajor());
		
		me.setName("�����");
		me.setAge(25);
		me.setJob("�л�");
		me.setSchool("�Ϲ�����б�");
		me.setMajor("��ǻ�Ͱ��а�");
		
		System.out.println("---------------------");
		System.out.println("�̸� : "+me.getName());
		System.out.println("���� : "+me.getAge());
		System.out.println("���� : "+me.getJob());
		System.out.println("�б� : "+me.getSchool());
		System.out.println("�а� : "+me.getMajor());
		
	}

}
