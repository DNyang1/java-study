package sec01.exam12;

import java.io.IOException;

public class KeyboardToStringExample {
	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];

		// byte 배열에 키보드 입력값 저장
		System.out.println("입력: ");
		int readByteNo = System.in.read(bytes);
		// 입력 스트림에서 바이트들을 여러 개 읽어 뱅려에 저장 , 바이트 수를 반환
		// System.in : 시스템의 표준 입력 장치(키보드)
		// read(): 입력된 키코드를 읽어라

		System.out.println(readByteNo);
		// 예: hello 엔터를 치면 바이트에 저장하고 7을 리턴
		// 엔터의 2개 입력 까지 추가되서 7임

		String str = new String(bytes, 0, readByteNo - 2);
		System.out.println(str);
	}
}
