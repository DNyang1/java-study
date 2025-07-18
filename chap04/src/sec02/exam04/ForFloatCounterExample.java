package sec02.exam04;

public class ForFloatCounterExample {

	public static void main(String[] args) {
		// (참고) 잘못 작성된 for 문의 예
		for (float x = 0.1f; x <= 1.0; x +=0.1f) {
			System.out.println(x); // 10번을 기대했지만 실제로는 9번만 반복이 일어난다.
			// why? 정확하게 0.1이 더해지지 않기에, 1.0에서 멈추질 않는다
		}
		// 초기화식에 사용되는 볍ㄴ수는 정수 타입을 써라
		
	}
}
