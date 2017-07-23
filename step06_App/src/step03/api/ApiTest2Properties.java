/*
 * ����
 * - info.properties ���Ϸ� ���� key�� ������ read�ؼ� �� �����͵� ȭ�鿡 ���
 * ���� �ܰ�
 * 1�ܰ� : properties�ڹ� �ҽ��� read
 * 2�ܰ� : key�� �����Ͱ� read
 * 3�ܰ� : , �����ڷ� ������ ����
 * 4�ܰ� : ���ص� �������� index�� �°� ������ ���
 * 
 * properties ���� read : 
 * 		- Properties ��ü ����
 * 		- load(), 2byte ������ read ������ ��ü ����(FileReader)
 * properties���Ϸ� ���� key�� ���� read
 * 		- stringPropertyNames() : Set ��ü�� ��ȯ
 * 		- �ϳ��ϳ��� ������ �ʿ� ���� Iterator ��ü ����
 * read�� key�� value�� �� read
 * 		- Properties ��ü�� ���� getProperty(String key) �� Stringr������ ��ȯ
 * value �����ؼ� �迭�� ����
 * 		- �����ڷ� ������ �����ؼ� ����
 * �迭�� ����� �����͸� ȭ�鿡 ���
 * 		- �ټ��� ������ ���� �ݺ�.....
 */ 


package step03.api;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Properties;

public class ApiTest2Properties {

	public static void main(String[] args) {
		try {
			//Properties ���Ϸ� ���� ������ Ȱ�� ������ ��ü
			Properties info = new Properties();
			//info.properties ������ Properties��ü�� ��� �����ϰ� �νĽ�Ű�� �޼ҵ�
			info.load((new FileReader("info.properties")));
			
			Iterator<String> keyAll = info.stringPropertyNames().iterator();
			
			String ages[] = null;
			String names[] = null;
			String key = null;
			String value = null;
	
			//�����͸� �ϳ��� ���ο� �迭�� ����
			while(keyAll.hasNext()){
				key = keyAll.next(); 
				value = info.getProperty(key);
				if(key.equals("key1")){
					names = value.split(",");
				}
				else if(key.equals("key2")){
					ages = value.split(",");
				}
			}
			
			//�����͸� ȭ�鿡 ���
			for(int i = 0; i < ages.length ; i++){
				System.out.println(names[i]+"("+ages[i]+"��)");
			}
		} catch (Exception e) {
			e.printStackTrace();		
		}
		
	}

}
