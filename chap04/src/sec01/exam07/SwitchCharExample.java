package sec01.exam07;

public class SwitchCharExample {

	public static void main(String[] args) {
		
		char grade = 'B';
		
		// char 타입도 올 수 있다. (대소문자 구분 함)
		// 여러 케이스를 묶을 수 있다
		switch (grade) {
		case 'A':
		case 'a':
			// 'A' , 'a' 일때 실행
			System.out.println("우수 회원");
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원");
			break;
		default:
			System.out.println("손님 회원");
			break;
		}
		
		// Quiz
		// 위 switch 문을 if 문으로 변경
		
		if (grade == 'A' || grade == 'a')
			System.out.println("우수 회원");
		else if (grade == 'B' || grade == 'b')
			System.out.println("일반 회원");
		else
			System.out.println("손님 회원");
	}
}
