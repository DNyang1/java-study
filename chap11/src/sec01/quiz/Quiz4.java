package sec01.quiz;

import java.util.Scanner;

public class Quiz4 {
//	Quiz
//	반 전체 학생이 몇 명인지 입력을 받아 배열을 만들고,
//	우리반 학생들 이름을 입력받아서 모두의 이름을 배열에 추가합니다.
//	전체 학생 중에서 오늘 커피 쏠 사람을 랜덤으로 뽑으려고 해요.
//	Math.random()을 활용해서 학생 한 명을 추출하여 출력하세요.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("전체 인원 수 몇명?");
		int length = sc.nextInt();
		sc.nextLine(); // 개행문자제거

		String[] javaClass = new String[length];
		for (int i = 0; i < javaClass.length; i++) {
			javaClass[i] = sc.nextLine();
		}

		// 공식화 (int) (Math.random() * (최대값 - 최소값 + 1) + 최소값)
		int randNum = (int) (Math.random() * length);

		int count = 5;
		while (true) {
			System.out.println(count--);
			if (count == 0) {
				break;
			}
		}
		System.out.println("오늘커피" + javaClass[randNum]);

	}

}