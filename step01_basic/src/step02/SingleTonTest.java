package step02;

public class SingleTonTest {

	public static void main(String[] args) {
		SingleTon s = SingleTon.getInstance();
		System.out.println(s);
		System.out.println(s.getMsg());
		
		SingleTon s2 = SingleTon.getInstance();
		System.out.println(s);
		
		//SingleTon��ü�� class���ο��� static ������ ��üȭ �Ǿ������Ƿ� ���� instance����
	}
}
