/*
 * Class의 forName()
 * - parameter의 값으로 설정된 class들을 메모리에 로딩
 * - API 제시자 관점
 * 		*발생 가능한 경우의 수
 * 		1. 혹여 클래스명 오타?
 * 			- 사용자에게 예외 상황 제시
 * 		2. 정상 클래스명
 * 			- byte code 로딩 완료
 * 		
 * 		* API 개발자 관점에서 사용자가 더 효율적으로 메소드 사용하게 하려면?
 * 			1. 다수의 실행 결과로 예와 판단 후 처리하게 한다 (x)
 * 			2. 개발 시점에 고려해서 조심스럽게 미연에 처리하게 한다 (o)
 * 				- 미고려시 컴파일 불가 상황으로 제시
 */
package step01.exception;

public class ExceptionTest1 {

	public static void main(String[] args) {
		//step01 : 
		//문법 ok, 단 i[7] : 실행 예외 발생
		//해결책 : i[7] -> i[1] 단순 데이터값 수정
		int[] i = {1, 2};
		System.out.println(i[1]);
		
		
		//step02 :
		//메소드 호출 문법은 오류 없음
		//단 try~catch 문장 없이는 컴파일 오류 발생
		//해결책 : try~catch 블록 처리
		try {
			Class.forName("step01.exception.A");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}

class A{
	static{
		System.out.println("A byte code 메모리에 로딩시 자동 실행");
	}
}