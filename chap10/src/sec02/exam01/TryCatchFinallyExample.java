package sec02.exam01;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		// 예외 처리 : 예외는 발생했지만 프로그램이 갑자기 종료되는 것을 막고 정상 실행을 유지
		
		try {
			// 일반 예외 : 컴파일러가 체크함
//			Class clazz = Class.forName("java.lang.String");// 주어진 이름으로 클래스를 만들어 Class 객체로 반환
			
			// 클래스가 못 찾았을떄
			Class clazz = Class.forName("java.lang.String2");// 일반 예외 발생
			
			System.out.println("클래스 찾음");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 존재 X");// 예외가 발생하면 처리하는 코드
		} finally { //(Optional) 필요하면 쓰면 됨.
			// 예외가 발생하든 말든 상관 없이 일단 실행
			System.out.println("프로그램 종료");
		}
		
		
		
	}
}
