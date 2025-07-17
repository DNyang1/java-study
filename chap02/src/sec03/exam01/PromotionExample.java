package sec03.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue; // 1byte -> 4byte, 자동 형변환
		System.out.println("intValue: " + intValue);
		
		char charValue = '가';
		intValue = charValue; // 2byte -> 4byte, 자동 형변환
		System.out.println("intValue: " + intValue);

		intValue = 30;
		long longValue = intValue; // 4byte -> 8byte, 자동 형변환
		System.out.println("longValue: " + longValue);
		
		longValue = 100;
		float floatValue = longValue; // 실제 저장가능 범위는 long < float, 자동 형변환
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5f;
		double doubleValue = floatValue; // 4byte -> 8byte, 자동 형변환
		System.out.println("doubleValue: " + doubleValue);
		
		// 주의! byte -> char 로 자동 형변환 불가
		byte byteVal = 65;
//		char charVal = byteVal // char에는 음수없어서 byte 가 들어가기 X
		
		
		
	}
}
