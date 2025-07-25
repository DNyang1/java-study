package sec01.exam07.package1;

public class B {
	protected void method() {
		A a = new A(); // 같은 패키지에서 프로텍트는 접근 됨
		a.field = "value"; // 물론 값도 넣어짐
		a.method(); // 메소드도 호출됨
	}
}
