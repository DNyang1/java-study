package sec02.exam10;

import java.util.Scanner;

public class AssignmentOperatorExample {

	public static void main(String[] args) {
		
		int result = 0;
		
		result += 10;
		System.out.println("result=" + result);
		
		result -= 5;
		System.out.println("result=" + result);

		result *= 3;
		System.out.println("result=" + result);
		
		result /= 5;
		System.out.println("result=" + result);

		result %= 3;
		System.out.println("result=" + result);
		
		//Quiz
//		금액을 입력받아 500원, 100원, 50원 10원, 1원 동전으로 변경하려고 합니다.
//		최소 필요한 동전의 개수를 출력하는 프로그램을 구현하세요
//		
//		[입력]
//		5640		
//		[출력]
//		500원 : 11개
//		100원 : 1개
//		50원 : 0개
//		10원 : 4개
//		1원 : 0개
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액을 입력하세요 (원): ");
		int money = sc.nextInt();
		
		int won500 = money / 500;
		int won100 = (money % 500) / 100;
		int won50 = (money % 100) / 50;
		int won10 = (money % 50) / 10;
		int won1 = (money % 10);
		
		System.out.printf("500원	: %d 개 \n", won500);
		System.out.printf("100원	: %d 개 \n", won100);
		System.out.printf("50원	: %d 개 \n", won50);
		System.out.printf("10원	: %d 개 \n", won10);
		System.out.printf("1원	: %d 개 \n", won1);
	}
}
