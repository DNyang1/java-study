package sec01.exam30;

public class StringBuilderExample {

	public static void main(String[] args) {
		// String Builder
		// 문자열을 변경가능한 객체로 만들수잇음
		// 다중연산시 메모리 절약 가능

		StringBuilder sb = new StringBuilder("Java");

		// 기존 문자열의 끝에 주어진 값을 추가
		sb.append("program Study");
		sb.append("new").append("start");
		sb.append(sb.toString());

		// 지정한 인덱스 위치에 주어진 값 삽입
		sb.insert(4, "2");
		System.out.println(sb.toString());

		// 시작부터 끝 인덱스 까지 문자열을 딴 문자열로 만듬
		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());

		// 지정 시작부터 끝 인덱스까지 삭제
		sb.delete(4, 5);
		System.out.println(sb.toString());

		// 문자열 길이 반환
		int length = sb.length();
		System.out.println(length);

		// StringBuilder 를 String 으로 반환
		String result = sb.toString();
		System.out.println(result);
		
		// 정리
		// 내부에서 문자열을 저장해서 조작하기때문에 변경이 있을때마다 문자를 만들지 않음
		// 문자열을 많이 변경할 경우 String 보다 StringBuilder 를 쓰는게 성능상 조음
		
		
	}
}
