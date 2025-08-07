package sec01.exam02;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		// 데이터 도착지를 test.2db 파일로 하는 바이트 기반 파일 출력 스트림을 생성
		OutputStream os = new FileOutputStream("C:/Temp/test2.db");
		
		// 바이트 배열 한꺼번에 출력
		byte[] array = {10,20,30};
		// 배열의 모든 바이트를 출력
		os.write(array);
		
		os.flush();
		os.close();
		
		
	}
}
