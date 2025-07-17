package sec02.exam08;

public class CompareOperatorExample2 {
	
	public static void main(String[] args) {
		
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3);
		// v2(int) 가 double 타입으로 변환, => 1.0 == 1.0
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5);
		// v5가 double 타입으로 변환, 두 타입의 정밀도 차이 때문에 일치하지 않음
		System.out.println(v4 + " == " + (double)v5);
		// 0.1 을 float 나 double 에 저장하면 정확히 0.1 이 저장되지 않음
		// 이는 부동소수점 표현의 한계, 이진수로 정확히 표현할 수 없음
		
		// 해결책
		// 1. float 로 바꾸어서 비교
		System.out.println((float) v4 == v5);
		
		// 2. 정수로 바꾸어서 비교
		System.out.println((int) (v4 * 10) == (v5 * 10));
		
		// 정리: float 타입과 double 타입을 비교하도록 코드를 작성하지 않는 것이 좋음
		// 실수 타입을 하나로 통일하는 것이 좋음(주로 double 타입을 사용)                
		
		// (참고) 정밀도 테스트
		double result = 7 * 0.1; // 0.1 에 매우 근사한 값
		System.out.println(result);
		// 부동소수점 방식에서 실수 연산을 하다보면 근사값이 나옴
		// 1. 정수로 바꿔 계산 해서 실수 타입으로 다시 변환
		// 2. 실수로 계산해서 올림, 내림 등을 적절히 사용한다
		
	}

}
