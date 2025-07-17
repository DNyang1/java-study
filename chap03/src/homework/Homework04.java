package homework;

import java.util.Scanner;

//1) 문제
//철수는 오늘 기말고사 시험을 보았습니다.
//국어, 수학, 영어 3과목의 각각 점수가 60점 이상이면서,
//평균 90점이 넘으면 휴대폰을 바꿔주기로 부모님과 약속을 했어요.
//3과목의 점수를 입력 받아서
//철수가 휴대폰을 바꿀 수 있는지 여부와
//합계, 평균 성적을 출력하는 프로그램을 만들어주세요.
//2) 출력 예시
//국어 : 32
//수학 : 71
//영어 : 90
//합계: 193점
//평균: 64점
//휴대폰을 바꿀 수 없습니다.
public class Homework04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("국어: ");
		int kok = sc.nextInt();
		System.out.print("수학: ");
		int mat = sc.nextInt();
		System.out.print("영어: ");
		int eng = sc.nextInt();

		int total = kok + mat + eng;
		int avg = total / 3;

		String phone = ((kok >= 60 && mat >= 60 && eng >= 60 && avg >= 90)) ? "휴대폰을 바꿀 수 있다!" : "휴대폰을 바꿀 수 없습니다";

		System.out.println("합계" + total + "점");
		System.out.println("평균" + avg + "점");

		System.out.println(phone);

	}
}
