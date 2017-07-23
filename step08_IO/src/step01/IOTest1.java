/*
 * 학습내용
 * 1. System.in : 키보드 의미, 1byte read
 * 2. BufferedReader : 버퍼 메모리를 활용한 2byte 입력 API
 * 3. 1byte와 2byte는 자동 호황 불가
 * 		- 호환 기능의 기술 : InputStreamReader
 * 
 * 4. 고려사항
 * 		- 데이터 존재 유무 확인은 어떤 값?
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
			while((data = in.readLine()) != null){ // 키보드의 enter key가 기준점
				System.out.println(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {//예외 발생 유무와 무관하게 100% 실행 보장하는 블록
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
