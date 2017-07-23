package step02;

public class ApiTest {
	//static 문자열 반환
	static String getData(){
		return "문자열";
	}
	public static void main(String[] args) {
		String data = ApiTest.getData();
		
		//? 열 음절만 출력
		/*
		 * System
		 * 		out
		 * 			println호출 : 실행보류
		 * 				data.charAt(2) 결과 char값 변환
		 * 					println실행
		 */
		System.out.println(data.charAt(2));
		
		//? 문자열 길이 출력
		System.out.println(data.length());
		
		//? 문열 변환해서 출력	
		/*
		 * 여기서 +는 수학적인 연산(문의 아스키코드 + 열의 아스키코드)이 됨.
		 * ""+를 하면서 수학적인 연산자가 문자결합연산자가 됨.
		 * "" 생략시 char 값들 더할 경우 수학 연산자로 사용됨.
		 */
		System.out.println((int)data.charAt(0));//47928
		System.out.println((int)data.charAt(2));//50676
		System.out.println(data.charAt(0)+data.charAt(2));//98604
		System.out.println(""+data.charAt(0)+data.charAt(2));
		
		
	}

}
