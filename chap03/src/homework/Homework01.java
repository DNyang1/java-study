package homework;

import java.util.Scanner;
//1) 문제
//철수의 앵무새는 주인이 하는 말의 반대말만 하는 똑똑한 새에요.
//철수의 앵무새 처럼 우리의 프로그램도
//사용자 입력한 문자열이 “간다”와 같으면 “온다”라고 출력하고,
//그렇지 않은 경우에는 “간다”라고 출력하는 시스템을 만드세요.
//컴퓨터는 간다의 반댓말이 온다인지 알지 못합니다.
//‘!간다 == 온다’라고 쓰지 마세요.
//2) 출력 예시
//말해보세요 : 간다
//앵무새 : 온다

public class Homework01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("말해보시오:");
		String say = sc.nextLine();
		
		// 삼항 (조건) 연산자 이용
		// 변수 쪽에 equals()을 호출하면 input이 null 일경우 예외 가 발생한다
		// 리터럴이나 상수를 앞에 두면, 인풋이 널 이여도 안전하게 비교가능
		
		String parrot = (say == "간다") ? "온다" : "간다"; 
		System.out.println("앵무새:" + parrot);
		
	}
}
