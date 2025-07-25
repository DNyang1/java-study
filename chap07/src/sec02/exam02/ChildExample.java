package sec02.exam02;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = child; // Parent 타입으로 타입 변환이 발생함.
		
		parent.method1();
		parent.method2(); // 자식쪽의 재정의된 메소드가 호출됨 흠..
//		parent.method3(); // 자식객체에만 있는건 parent 타입으로는 호출 불가능함
		
		// 정리: 참조 변수의 타입은 객체를 다룰 수 있는 리모컨이라고 생각
		
		
		
		
	}
}
