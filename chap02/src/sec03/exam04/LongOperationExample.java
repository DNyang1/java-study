package sec03.exam04;

public class LongOperationExample {

	public static void main(String[] args) {
		// 정수 타입의 산술연산에서 하나라도 long 타입 이면 long 으로 자동 형변환
		byte x = 20;
		long y = 40;
//		int result = x + y; // byte 가 long 으로 변환, long + long
		long result = x + y;

		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000;
		long result2 = value1 + value2 + value3;
		System.out.println(result2);
	}
}
