package sec01.exam07.package2;

import sec01.exam07.package1.A;

public class D extends A { // 이번에는 다른패키지에 상속받아서
	// protected 접근 제한은 상속을 통해 사용 가능
	// 직접 객체 생성 해서 사용하는 건 여전히 안됨
	
//	protected void method() {
//		A a = new A(); // 같은 패키지에서 프로텍트는 접근 됨
//		a.field = "value"; // 물론 값도 넣어짐
//		a.method(); // 메소드도 호출됨
//	}

	public D() {
		super(); // 부모 생성자 호출
		field = "value";
		method();
	}
	
	public void method2() {
		field = "value";
		method();
		
	}
	
}
