package sec02.exam03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class ReadLineExample {

	public static void main(String[] args) throws Exception {
		
		Reader reader = 
				new FileReader(ReadLineExample.class.getResource("language.txt").getPath());
		BufferedReader br = new BufferedReader(reader);
		
		while (true) {
			String data = br.readLine(); // 한 문자씩 읽는게 아니라 한 줄씩 읽음 
			if (data == null) break; // 더 이상 데이터를 읽을 수 없으면 null 을 반환
			System.out.println(data);
		}
		br.close();
	}
}
