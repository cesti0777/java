package step02;

import model.domain.Person; // ctrl+shift+o : 필요 패키지 자동 import
													 //java.lang은 import안해도 되는 유일한 패키지
public class Array2 {
	//핵심로직 = business logic = model = biz
	//Person 객체들로 배열 생성해서 반환(return)
	public Person[] getPerson(){
		Person[] all = {new Person("박지빈","cesti0777"), new Person("백경진","gpfqk")};
		return all;
	}
		
	//화면단 출력 로직 = view = presentation logic
	//Person 배열을 받아서 반복문으로 출력(argument or parameter)
	public void viewPerson(Person[] v){
		for(Person p : v){
			System.out.println(p.getId());
		}
	}
	
	public static void main(String[] args) {
		Array2 a = new Array2();
		a.viewPerson(a.getPerson());
	}
}
