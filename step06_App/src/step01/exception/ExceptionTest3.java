/*
 * 학습내용
 * 1. 실무형 코드
 * 2. 구조
 * 		1. 유효성 검증 후 무효한 경우에 예외 발생
 * 		2. 예외 발생될 수도 있는 상황의 코드
 * 			1. 처리방법 1 : try~catch
 * 			2. 처리방법 2 : 호출한 곳으로 예외처리 위임 throws
 */		
package step01.exception;

public class ExceptionTest3 {
	static void m1(){
		System.out.println(10/5);
	}
	// 실제 예외 발생시 메소드 내에서 처리
	static void m2(){
		try {
			Class.forName("step01.exception.A");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	// 실제 예외 발생시 호출한 곳으로 예외 처리 위임
	static void m3() throws ClassNotFoundException{
		Class.forName("step01.exception.A");
	}
	
	//di 유효성 검증 메소드
	//단 master가 아닌 경우 Exception 객체 생성해서 던.지.기
	static void idCheck(String id) throws Exception{
		if(!id.equals("master")){
			throw new Exception("넌 누구니?");
		}
		System.out.println("master 맞네요 안녕하세요");
	}
	
	//id가 중복된 경우 사용자 정의 예외를 발생하는 메소드
	//중복시 IdDoubleException 발생
	static void idCheck2(String id) throws IdDoubleException{
		if(id.equals("master")){
			throw new IdDoubleException("id 중복 불허");//로직 종료
		}
		//if 블록이 true인 경우 다음 라인 실행 불가
		System.out.println("가입 완료");
	}
	
	public static void main(String[] args) {
		try{
			idCheck2("ma");
			System.out.println("---------");
			idCheck2("master");
		}catch(IdDoubleException e2){
			e2.printStackTrace();
		}
		
		System.out.println("--------------------------");
		
		m1();
		m2();
		try {
			m3();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("--------------------------");
		
		try {
			idCheck("ma");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

