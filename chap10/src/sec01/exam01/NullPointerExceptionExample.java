package sec01.exam01;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		String data = null; // null 로 초기화 시 참조하는 객체가 없음
		System.out.println(data.toString()); // 객체에 접근 -> 접근할 객체가 읍어요
		// NPE 발생시 . 을 찾아서 참조변수가 객체를 잠조하고 있는지 확인
		// 실행 예외의 경우 컴파일을 가능
	}
	
}
