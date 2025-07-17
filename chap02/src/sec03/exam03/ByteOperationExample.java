package sec03.exam03;

public class ByteOperationExample {

	public static void main(String[] args) {
		// 기본 전제: 두 개의 값 중 크기가 큰 타입으로 자동 형변환
		// 작은거로는 안됨, 손실도 일어날 수 있음.
		
		// 산술연산에서 int 보다 작으면 int 로 형변환
		byte x = 10;
		byte y = 20;
//		byte result = x + y; // 자동 형변환 되어서 ...(int)x + (int)y 가 됨 byte 에 저장 x
		int result = x + y;
		System.out.println(result);
		
	}
}
