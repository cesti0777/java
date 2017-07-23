package step01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOTest3 {

	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		try{
			in = new BufferedReader(new FileReader("kdata.txt")); // 파일이 없을 경우 익셉션 처리를 위해 안으로 이동
			out = new BufferedWriter(new FileWriter("seoul.txt", true));
			String data = null;	
			while((data = in.readLine()) != null){
				out.write(data);
				out.newLine();
				out.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally { 
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
