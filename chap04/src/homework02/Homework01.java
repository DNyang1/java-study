package homework02;

import java.util.Scanner;

//과제로 구현한 실습 문제를 선택하여 실행할 수 있는 메뉴 화면을 구현하세요.
//메인 메소드를 가지고 있는 클래스 Run,
//실행 코드 메소드를 가지고 있는 Practice 클래스를 생성합니다.
//그리고, Run에서 아래 기능을 만들어서 실행할 기능을 입력하면 해당 메소드가 실행되도록 해주세요.
//2. 출력 예시
//실행할 기능을 입력하세요.
//1. 1~50까지 짝수 합하기
//2. 구구단 무한반복
//3. 탈출합시다.
//4. 게임 재시작
//5. 양수만 더하기
//6. 트리 만들기
//7. 박수박수박
//8. 문자열의 개수
//선택: 7
public class Homework01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0;
		boolean flag = true;

		while (flag) {

			System.out.println("정수1~50: ");
			num = sc.nextInt();

			if (num >= 1 && num <= 50)
				flag = false;
		}

		int sum = 0;

		for (int i = 1; i < num + 1; i++) {
			if (i % 2 == 0)
				sum += i;
		}
		System.out.printf("합계 : %d", sum);

	}
}
