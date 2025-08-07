package sec01.exam04;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) {
		// 데이터 출발지를 test1.db 파일로 하는 바이트 기변 파일 입력 스트림을 생성
		try (InputStream is = new FileInputStream("C:/Temp/test1.db")){

			while (true) {
				int data = is.read();
				if (data == -1) break;
				System.out.println(data);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}
