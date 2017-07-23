package step01;

public class VariableTest2 {
	int no;
	public static void main(String[] args) {
		int no = 0;// 초기화 안하면 쓸 수 없음
		System.out.println(no);//로컬 변수 호출
	
		VariableTest2 v = new VariableTest2();
		System.out.println(v.no);
	}

}
