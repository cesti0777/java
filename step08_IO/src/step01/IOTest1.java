/*
 * �н�����
 * 1. System.in : Ű���� �ǹ�, 1byte read
 * 2. BufferedReader : ���� �޸𸮸� Ȱ���� 2byte �Է� API
 * 3. 1byte�� 2byte�� �ڵ� ȣȲ �Ұ�
 * 		- ȣȯ ����� ��� : InputStreamReader
 * 
 * 4. �������
 * 		- ������ ���� ���� Ȯ���� � ��?
	 * 		- int read() : -1 
	 * 		- String readLine() : null
 * 
 */

package step01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOTest1 {

	public static void main(String[] args) {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String data = null;
			while((data = in.readLine()) != null){ // Ű������ enter key�� ������
				System.out.println(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {//���� �߻� ������ �����ϰ� 100% ���� �����ϴ� ���
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
