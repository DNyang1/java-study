package sec03.exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class GetLineStringFromKeyboard {

	public static void main(String[] args) throws Exception {
		InputStream is = System.in; // byte 기반 입력 스트림
		Reader reader = new InputStreamReader(is); // 문자 기반 Reader 로 변환
		BufferedReader br = new BufferedReader(reader); // 라인 단위로 읽기 위해 추가로 사용
		
		while (true) {
			System.out.print("입력: " ); // 바이트 기반 출력 스트림
			String lineStr = br.readLine(); // 라인단위로 문자를 읽음
			
			if ("q".equals(lineStr) || "quit".equals(lineStr)) break;
			
			System.out.println("입력된 내용: " + lineStr);
			System.out.println();
			
		}
		br.close();
		
	}
	
}
