package step01.exception;

public class ExceptionTest2 {

	public static void main(String[] args) {
		/*
		 * step02
		 */
		String s = null;
		if(s != null){
			System.out.println("string ����");
		}else{
			//��������� ���� �߻�
			System.out.println("null�Դϴ�");

			new Exception("null�̶���");//������ �ϰ� ������ ��ü�� ����
			try {
				throw new NullPointerException("null�̶���");//�����ؼ� ó���϶� ���
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		/*
		 * step01 : �⺻ ���� ����, �ʿ伺 �ν�
		 */
//		System.out.println(1);
//		
//		try{
//			Class.forName("step01.exception.A22222");
//			System.out.println(2);
//			
//		}catch(ClassNotFoundException e){
//			e.printStackTrace();
//			System.out.println("���� ��Ȳ");
//		}
//		
//		System.out.println("����ǳ� Ȯ��?");
	}

}
