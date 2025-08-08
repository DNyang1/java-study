package sec02.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Iterator;

public class CharacterConvertStreamExample {

	// 파일로 문자를 저장하고, 저장된 문자를 다시 읽는 예제
	// 사용하는 소스 스트림은 바이트 기반 입출력 스트림이지만
	// 이름 직접 사용하지않고 Reader나 Writer로 변환하여 사용
	public static void main(String[] args) throws Exception {
		write("문자 변환 스트림");
		
		read();
	
	
	}

	private static void write(String str) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test1.txt");
		// 편의를 위해 보조 스트림을 연결헤서 문자 -> 바이트로 자동변환
		Writer writer = new OutputStreamWriter(os); // 문자기반 출력 보조 스트림 연결
		writer.write(str);
		writer.flush();
		writer.close();
	}
	
	private static void read() throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test1.txt");
		// 편의를 위해 보조 스트림을 연결헤서 문자 -> 바이트로 자동변환
		Reader reader = new InputStreamReader(is); // 문자기반 입력 보조스트림 연결
		reader.read();
		
		char[] buffer = new char[100];
		int readCharNum = reader.read(buffer); // 보조 스트림 연결로 char[] 이용가능
		
		for (int i = 0; i < readCharNum; i++) {
			System.out.println(buffer[i]);
		}
		System.out.println();
	}

}
