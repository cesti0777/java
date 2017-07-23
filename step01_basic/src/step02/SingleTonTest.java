package step02;

public class SingleTonTest {

	public static void main(String[] args) {
		SingleTon s = SingleTon.getInstance();
		System.out.println(s);
		System.out.println(s.getMsg());
		
		SingleTon s2 = SingleTon.getInstance();
		System.out.println(s);
		
		//SingleTon객체는 class내부에서 static 변수로 객체화 되어있으므로 같은 instance공유
	}
}
