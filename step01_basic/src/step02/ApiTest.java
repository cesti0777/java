package step02;

public class ApiTest {
	//static ���ڿ� ��ȯ
	static String getData(){
		return "���ڿ�";
	}
	public static void main(String[] args) {
		String data = ApiTest.getData();
		
		//? �� ������ ���
		/*
		 * System
		 * 		out
		 * 			printlnȣ�� : ���ຸ��
		 * 				data.charAt(2) ��� char�� ��ȯ
		 * 					println����
		 */
		System.out.println(data.charAt(2));
		
		//? ���ڿ� ���� ���
		System.out.println(data.length());
		
		//? ���� ��ȯ�ؼ� ���	
		/*
		 * ���⼭ +�� �������� ����(���� �ƽ�Ű�ڵ� + ���� �ƽ�Ű�ڵ�)�� ��.
		 * ""+�� �ϸ鼭 �������� �����ڰ� ���ڰ��տ����ڰ� ��.
		 * "" ������ char ���� ���� ��� ���� �����ڷ� ����.
		 */
		System.out.println((int)data.charAt(0));//47928
		System.out.println((int)data.charAt(2));//50676
		System.out.println(data.charAt(0)+data.charAt(2));//98604
		System.out.println(""+data.charAt(0)+data.charAt(2));
		
		
	}

}
