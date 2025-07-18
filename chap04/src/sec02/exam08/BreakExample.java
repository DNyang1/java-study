package sec02.exam08;

import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
		while (true) {
			// 1~6 임의정수
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);

			if (num == 6)
				break; // 반복을 멈추고 빠져나감
		}
		System.out.println("프로그램 종료");
		// Quiz
//		1에서 n까지의 합을 구하는 중 합계가 1000이 넘는 순간의 
//		n과 n까지의 합을 출력하는 프로그램을 구현하시오.
//		
//		[출력]
//		45까지의 합: 1035
		Scanner sc = new Scanner(System.in);
		System.out.println("n 입력: ");
		int n = sc.nextInt();
		
		int sum = 0;
		for (int i = 1; i <= n ; i++) {
			sum += i;
			if (sum>=1000)
				break;
		}
		System.out.printf("%d 까지의 합 : %d" , n , sum);
	}
	
}
