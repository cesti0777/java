package step01.exception;

public class ExceptionTest2 {

	public static void main(String[] args) {
		/*
		 * step02
		 */
		String s = null;
		if(s != null){
			System.out.println("string 존재");
		}else{
			//명시적으로 예외 발생
			System.out.println("null입니다");

			new Exception("null이란다");//생성만 하고 쓰레기 객체로 버림
			try {
				throw new NullPointerException("null이란다");//생성해서 처리하라 명령
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		/*
		 * step01 : 기본 문법 습득, 필요성 인식
		 */
//		System.out.println(1);
//		
//		try{
//			Class.forName("step01.exception.A22222");
//			System.out.println(2);
//			
//		}catch(ClassNotFoundException e){
//			e.printStackTrace();
//			System.out.println("예외 상황");
//		}
//		
//		System.out.println("실행되나 확인?");
	}

}
