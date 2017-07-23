package step01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOTest2 {

	public static void main(String[] args) {
		//키보드로 부터 read하는 객체
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//file에 2byte로 출력하는 객체
		//목적지가 file - File~/2byte로 출력 ~Writer = FileWriter : 단순 출력
		//buffer기능으로 효율적으로 출력 : BufferedWriter
		BufferedWriter out = null;
		try{
			out = new BufferedWriter(new FileWriter("kdata.txt", true)); // 입력이 없을 경우 발생하는 익셉션 처리를 위해 안으로 이동
			String data = null;	
			while((data = in.readLine()) != null){
				out.write(data);//데이터 출력만
				out.newLine();//라인 반영
				out.flush(); //버퍼 메모리에 혹여 잔존 데이터가 존재할까 하는 우려감 해소 메소드
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally { //생략시 서버 메모리 부하 야기
			try{
				if(in != null){
					in.close();
					in = null;
				}
				if(out != null){
					out.close();
					out = null;
				}
			}catch (IOException e){
				e.printStackTrace();
			}
		}

	}

}
