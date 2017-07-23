/*
 * Class�� forName()
 * - parameter�� ������ ������ class���� �޸𸮿� �ε�
 * - API ������ ����
 * 		*�߻� ������ ����� ��
 * 		1. Ȥ�� Ŭ������ ��Ÿ?
 * 			- ����ڿ��� ���� ��Ȳ ����
 * 		2. ���� Ŭ������
 * 			- byte code �ε� �Ϸ�
 * 		
 * 		* API ������ �������� ����ڰ� �� ȿ�������� �޼ҵ� ����ϰ� �Ϸ���?
 * 			1. �ټ��� ���� ����� ���� �Ǵ� �� ó���ϰ� �Ѵ� (x)
 * 			2. ���� ������ ����ؼ� ���ɽ����� �̿��� ó���ϰ� �Ѵ� (o)
 * 				- �̰���� ������ �Ұ� ��Ȳ���� ����
 */
package step01.exception;

public class ExceptionTest1 {

	public static void main(String[] args) {
		//step01 : 
		//���� ok, �� i[7] : ���� ���� �߻�
		//�ذ�å : i[7] -> i[1] �ܼ� �����Ͱ� ����
		int[] i = {1, 2};
		System.out.println(i[1]);
		
		
		//step02 :
		//�޼ҵ� ȣ�� ������ ���� ����
		//�� try~catch ���� ���̴� ������ ���� �߻�
		//�ذ�å : try~catch ��� ó��
		try {
			Class.forName("step01.exception.A");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}

class A{
	static{
		System.out.println("A byte code �޸𸮿� �ε��� �ڵ� ����");
	}
}