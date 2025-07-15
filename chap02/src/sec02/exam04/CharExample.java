package sec02.exam04;

public class CharExample {
	public static void main(String[] args) {
		// char (2byte)
		// 하나의 문자를 유니코드로 저장
		// 유니코드 : 세계 각국의 문자를 2byte(0~65535) 범위에 매핑한 국제표준규칙

		char c1 = 'A'; // 실제로는 문자 A로 저장 X, 65가 저장됨
		char c2 = 65; // 정수 타입이라 정수값도 저장 가능
//		char cc = -65 // 음수값 저장 X
		char c3 = '\u0041'; // 유니코드를 의미 + 16진수(잘 안씀)
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uAC00';
		
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
		// (참고) 유니코드 값 알아내기
		char var = '각';
		int unicode = var;
		
		System.out.println(unicode);
	
		// (참고) 문자를 숫자로 변환
		// 문자 '0' -> 유니코드 48
		System.out.println('1' - 0);  // 49 - 0 이 됨, 출력시 49
		System.out.println('1' - '0'); // 49 - 48 이 됨, 출력시 1
		
		// 반대로 문자를 숫자로 변활 하는것도 간으
		char digit = '8';
		int numericValue = digit - '0';
		System.out.println(numericValue);
		
		/*
		 * 중요
		 * 1) 문자와 문자열은 다르다.
		 * 2) 빈 문자 처리에 대해
		 */
//		char c = ''; // 비어있으면 안됨 문자하나는 있어야함, 컴파일에러
		char c = ' '; // 공백문자 하나, 유니코드 32로 저장됨
//		char c = '  '; // 공백문자 둘, 문자가 두개라 컴파일에러남
		String str = ""; // 빈 문자열은 저장 가능 
		
	}
}
