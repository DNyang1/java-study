package sec01.exam03;

public class Computer extends Calculator {

	// 그대로 물려받지 않고, 가져오고 Math 의 Pi 를 쓰도록재정의 해서 사용
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}	
	
	// 메소드 선언부가 틀렸을 때 예시
//	@Override // 오버라이딩이 제대로 되었는지 컴파일 단계에서 검사
//	private double areaCircle(double r) {
//		System.out.println("Computer 객체의 areaCircle() 실행");
//		return Math.PI * r * r;
//	}	
	
	// 선언부가 다르면 그냥 다른 메소드인 거
	

}
