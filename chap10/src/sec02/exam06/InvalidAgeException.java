package sec02.exam06;

// 사용자 정의 예외 만들기
// 자바에서 제공하는 표준 예외 클래스 외에, 특정상황에 맞는 예외를 만들어야 할 때 사용
// 사용자 정의 예외는 Exception 또는 RuntimeException 을 상속해서 만든다.
// Exception 을 상속하면 일반 예외
// RuntimeException 을 상속하면 실행예외

public class InvalidAgeException extends RuntimeException{
	public InvalidAgeException(String message) {
		super(message); // 부모 생성자로 예외 메세지 전달
	}
	
}
