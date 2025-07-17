package homework;

import java.util.Scanner;

//1) 문제
//실수형으로 국어, 영어, 수학 세 과목의 점수를 입력 받으세요.
//그 다음, 총점과 평균을 출력하세요.
//이때, 총점과 평균은 정수형으로 처리하세요. 
//실수값을 더할때는 + 부호를, 나누기할 때는 / 부호를 사용합니다.
//2) 출력
//국어 : 89
//영어 : 73
//수학 : 45
//총점 : 207
//평균 : 69
public class Homework05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("국어: ");
		double kor = sc.nextDouble();
		System.out.printf("영어: ");
		double eng = sc.nextDouble();
		System.out.printf("수학: ");
		double mat = sc.nextDouble();
		double total = kor + eng + mat;
		double avg = total / 3;
		System.out.println("총점:" + (int)total);
		System.out.println("평균:" + (int)avg);
	}

}
