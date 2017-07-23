/*
 * �н�����
 * 1. static Ű����
 * 2. ��� ��ġ
 * 		1. ����
 * 			- static ����
 * 			- ��ü �������� ��� ����
 * 			- class��.����
 * 		2. �޼ҵ�
 * 			- static ����
 * 			- ��ü �������� ��� ����
 * 			- class��.�޼ҵ�([..]);
 * 		3. static{}
 * 			- ��� user �����ϴ� �ڿ����� �� �ѹ� �ʱ�ȭ �Ҷ� ���Ǵ� ���
 * 			- ���� ����
 * 				: byte code�� �޸𸮿� ����� �� �ش� static{} byte code ��ġ���� �ٷ� ����
 */

package step02;

public class Static1 {
	int no1; // instance���� - ��ü ������ ������ ���Ӱ� ����
	static int no2;  // static���� - �����Ǵ� ��� ��ü�� �����ϴ� ����
	
	
	Static1(){
		no1++;
		no2++;
	}
	


	int getNo1() {//��ü �����Ŀ��� ȣ�� ������ �޼ҵ�
		return no1;//��ü �����ÿ� �����Ǵ� ����
	}

	int getNo2() {//���� �����Ŀ��� ȣ�� ������ �޼ҵ�
		return no2;//��ü ������ �����Ǵ� ����
	}


//	static void setNo1(int n) {	//��ü ������ ȣ�� ������ �޼ҵ�
//		no1 = n;//��ü ������ �����Ǵ� ����,  ������
//	}

	static void setNo2(int n) {//��ü ������ ȣ�� ������ �޼ҵ�
		no2 = n;//��ü ������ �����Ǵ� ����
	}

	
	static{
		System.out.println(1);
	}
	
	public static void main(String[] args) {
		System.out.println(no2);//0
		
		Static1 s1 = new Static1();
		System.out.println(s1.no1+" "+no2);//1 1

		Static1 s2 = new Static1();
		System.out.println(s1.no1+" "+no2);//1 2
		
		//java.lang.Integer Ŭ������ �޼ҵ�
		//"3"���ڿ� -> 3�̶�� int�� ��ȯ�ϱ�
		//"3"String Ÿ�� parameter / 3��ȯŸ�� int
		
//		System.out.println(Integer.parseInt("3"));		
		int v = Integer.parseInt("3");
		System.out.println(v);
		
		byte b = Byte.parseByte("3");
		
		float f = Float.parseFloat("3");
		
		char c = 'a';
		c = 97;
		System.out.println(c); // A
		
		int i2 = c;
		i2 = 'A';
		System.out.println(i2);
		
		/*
		 * ���ڿ� ��ü�� ������ ���� ��ȯ �޼ҵ� : length()
		 * int length(){} // static ������ �ȵ�. ��ü�� �־����
		 * static int length(String v){} // static �־ ��. ���ڷ� String�ִϱ�
		 */
		
		/*
		 * ?���ڿ��� index������ �� ������ �����ؼ� �ƽ�Ű ��ȣ ����� ����
		 */
		String v2 = "ABC";
		//65�� ������
		int v3 = v2.charAt(0); //A�� �̾Ƽ� int Ÿ������ ����
		System.out.println(v3); // 65
		
	}
	
	static{
		System.out.println(2);
	}
}
