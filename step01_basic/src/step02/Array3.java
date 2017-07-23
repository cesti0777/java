package step02;

import model.domain.Person;

public class Array3 {
	//배열 생성해서 반환하기
	static Person[] getAll(){
		Person[] all = {new Person("박지빈","cesti0777"), new Person("백경진","gpfqk")};
		return all;
	}
		
	//배열값 출력하기
	static void view(Person[] all){
		for(Person v : all){
			System.out.println(v.toString());
		}
	}
	
	//Person 객체 받아서 값 수정하기
	 static void idChange(Person v){
		 v.setId("newID");
	 }
	
	 //결론 : 더 이상의 배열 생성은 절대 하시지 말고 배열의 Person 객체 하나 선정해서 바꾸기
	public static void main(String[] args) {
		Person[] person = getAll();
		view(person);
		idChange(person[1]);
		view(person);
	}

}
