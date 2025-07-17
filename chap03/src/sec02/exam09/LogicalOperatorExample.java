package sec02.exam09;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		
		int charCode = 'A'; // 65
		System.out.println(charCode);
		
		if ((charCode >= 65) & (charCode <= 90)) { // t & t => t
			System.out.println("대문자네요");
		}
		
		if ((charCode >= 97) && (charCode <= 122)) { // f && => f (short-circuit 에 의해 f 가 나왓으니 연산x)
			System.out.println("소문자네요");
		}

		if (!(charCode < 48) && !(charCode > 57)) { // t && f = f
			System.out.println("숫자네요");
		}
		
		int value = 6;
		if ((value % 2 == 0) | (value % 3 == 0)) { // t | t
			System.out.println("2 또는 3의 배수이군요");
		}
		
		if ((value % 2 == 0) || (value % 3 == 0)) { // t | 숏서킷 발생 뒤에꺼 검사x
			System.out.println("2 또는 3의 배수이군요");
		}
		
		// 정리: 연산이 결과는 같은데 효율성이 높으므로 두개를 씀
	}
	
}
