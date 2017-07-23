package step02.my;

public class Me {
	
	String name = "박지빈";
	int age = 27;
	String job = "학생";
	String school = "건국대학교";
	String major = "소프트웨어학과";
	
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
		
		System.out.println("이름 : "+me.getName());
		System.out.println("나이 : "+me.getAge());
		System.out.println("직업 : "+me.getJob());
		System.out.println("학교 : "+me.getSchool());
		System.out.println("학과 : "+me.getMajor());
		
		me.setName("백경진");
		me.setAge(25);
		me.setJob("학생");
		me.setSchool("하버드대학교");
		me.setMajor("컴퓨터공학과");
		
		System.out.println("---------------------");
		System.out.println("이름 : "+me.getName());
		System.out.println("나이 : "+me.getAge());
		System.out.println("직업 : "+me.getJob());
		System.out.println("학교 : "+me.getSchool());
		System.out.println("학과 : "+me.getMajor());
		
	}

}
