package sec05.exam04;

public class Singleton {

	// Step 2
	private static final Singleton singleton = new Singleton();
	// private 로 외부에서 변경 못하게 막기
	// => 단 하나의 객체만 만들어 사용(공유)하기 위해
	
	
	
	// Step 1
	private Singleton() {} // 외부에서 호출 불가하게 private 로 만들기
	
	//
	
	// Step 3
	public static Singleton getInstance() { // 싱글톤 객체를 반환하는 메소드
		// 자기 자신의 객체를 리턴
		return singleton;
	}
}
