package sec01.exam15;

import java.io.UnsupportedEncodingException;

// 문자열을 바이트 배열로 변환
// 쓰는경우?
// 1. 파일에 문자를 바이트로 넣어야할떄
// 2. 네트워크 전송할때
// 3. 암호화/해싱할때

public class StringGetBytesExample {
	public static void main(String[] args) {
		String str = "안녕하세요";
		
		// 인코딩 : 문자열을 바이트 배열로 바꾸는거
		byte[] bytes1 = str.getBytes(); // 시스템의 기본 문자셋을 사용
		System.out.println("bytes1.length: " + bytes1.length); // 15
		// 한글 1자를 UTF-8 로 인코딩 하면 3바이트가 되고, EUC-KR 로 인코딩하면 2바이트가됨
		// 디코딩: 바이트 배열을 문자열로 다시 복원하는거
		String str1 = new String(bytes1);
		System.out.println("bytes -> String: " + str1);
		
		try {
			// 특정 문자셋으로 인코딩
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length : " + bytes2.length);
			// 특정 문자셋으로 디코딩
			String str2 = new String(bytes2,"EUC-KR");
			System.out.println("bytes -> String: " + str2);

			// 특정 문자셋으로 인코딩
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length : " + bytes3.length);
			// 특정 문자셋으로 디코딩
			String str3 = new String(bytes3,"UTF-8");
			System.out.println("bytes -> String: " + str3);
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
	}
}
