package sec01.exam02;

public class NullExample {

	public static void main(String[] args) {
		
//		String hobby = null;
//		System.out.println(hobby.length()); // 예외 발생 (객체가 없으니 메소드 이용 불가)
		
		String hobby = "배드민턴";
		System.out.println(hobby.length());
		
		String name = "김재현";
		name = null;
		
		// 이 때 "김재현" 이라는 객체는 쓰래기 객체가 됨
		// Garbage Collector 가 메모리에서 제거 (보통 CPU가 한가하거나 메모리가 딸릴때)
	}
}
