package sec02.exam11;

import java.util.Scanner;

public class ConditionalOperatorExample {

	public static void main(String[] args) {

		int score = 85;

		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + " 점은 " + grade + " 등급입니다. ");

		// Quiz
//		0~100 사이의 점수를 입력받아
//		점수가 60점 이상이면 "합격"
//		60점 미만인 경우 "불합격" 을 출력하는 프로그램을 구현하세용
//		단 음수이거나 100이 넘는 점수는 "점수입력오류"로 출력하세용
//		[입력] [출력]
//		 85	=> 합격
//	 	 50	=> 불합격
//		-10	=> 점수입력오류우

		Scanner sc = new Scanner(System.in);

		System.out.println("당신의 점수를 입력하시오");
		int score1 = sc.nextInt();

		String pass = (score1 > 0 && score1 <= 100) ? ((score1 >= 60) ? "합격" : "불합격") : "점수입력오류";
		System.out.println(pass);

	}

}
