package sec02.exam02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class NonBufferVsBufferExample {

	public static void main(String[] args) throws Exception {
		// 기본 스트림 코드
		String OriginalFilePath1 = NonBufferVsBufferExample
								.class.getResource("originalFile1.jpg").getPath();
		String targetFilePaht1 = "C:/Temp/targetFile1.jpg";
		FileInputStream fis = new FileInputStream(OriginalFilePath1);
		FileOutputStream fos = new FileOutputStream(targetFilePaht1);
		
		// 버퍼 보조 스트림 코드
		String OriginalFilePath2 = NonBufferVsBufferExample
				.class.getResource("originalFile1.jpg").getPath();
		String targetFilePaht2 = "C:/Temp/targetFile1.jpg";
		FileInputStream fis2 = new FileInputStream(OriginalFilePath1);
		FileOutputStream fos2 = new FileOutputStream(targetFilePaht1);
			// 여까진 기본코드
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		

		// 기본 스트림 코드로 복사한거
		long nonBufferTime = copy(fis,fos);
		System.out.println("버퍼 안쓴거 " + nonBufferTime);
		
		// 버퍼 보조 스트림을 이용해서 복사한거
		long bufferTime = copy(bis, bos);
		System.out.println("버퍼 쓴거 " + bufferTime);
		
		fis.close();
		fos.close();
		bis.close();
		bos.close();
		
	}

	static int data = -1; // 입력 스트림으로 부터 데이터를 전혀 읽지 않았을 경우를;
	
	// 매개변수 타입은 부모로 일단 해줍시다
	private static long copy(InputStream is, OutputStream os) throws Exception {
		long start = System.nanoTime(); // 시작 시간 저장
		
		// 파일 복사
		// 원본 파일에서 읽은 1byte를 타겟 파일로 바로 출력
		while (true) {
			data = is.read(); // 바이트를 읽어서
			if (data == -1) break;
			os.write(data); // 바이트를 출력
		}
		os.flush();
		
		long end = System.nanoTime(); // 끝 시간 저장
		return end - start; // 복사에 걸린 시간 리턴
	}
}
