package step01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOTest2 {

	public static void main(String[] args) {
		//Ű����� ���� read�ϴ� ��ü
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//file�� 2byte�� ����ϴ� ��ü
		//�������� file - File~/2byte�� ��� ~Writer = FileWriter : �ܼ� ���
		//buffer������� ȿ�������� ��� : BufferedWriter
		BufferedWriter out = null;
		try{
			out = new BufferedWriter(new FileWriter("kdata.txt", true)); // �Է��� ���� ��� �߻��ϴ� �ͼ��� ó���� ���� ������ �̵�
			String data = null;	
			while((data = in.readLine()) != null){
				out.write(data);//������ ��¸�
				out.newLine();//���� �ݿ�
				out.flush(); //���� �޸𸮿� Ȥ�� ���� �����Ͱ� �����ұ� �ϴ� ����� �ؼ� �޼ҵ�
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally { //������ ���� �޸� ���� �߱�
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
