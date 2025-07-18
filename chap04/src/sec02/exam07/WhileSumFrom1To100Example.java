package sec02.exam07;

import java.util.Scanner;

public class WhileSumFrom1To100Example {

	public static void main(String[] args) {

		// 1~100 합

		int sum = 0;
		int i = 1;
		while (i <= 100) {
			sum += i;
			i++;
			System.out.print("집가고싶다");
		}
		System.out.printf("\n1~ %d 합: %d", (i - 1), sum);

		// (참고) 무한루프
		int count = 1;
		while (true) {
			System.out.println("무한반복 " + count);

			// 실제 사용 예: 특정 조건을 만족하면 멈추도오록
			if (count == 60)
				break;
			count++;
		}

		count = 1;
		boolean flag = true;
		while (flag) {
			System.out.println("무한반복 " + count);

			// 실제 사용 예: 특정 조건을 만족하면 멈추도오록
			if (count == 60)
				flag = false;
			count++;
		}

		// do~while 문으로 작성
		// 1~100 합
		sum = 0;
		i = 1;
		do {	// 처음 한번은 무조건 실행
			sum += i;
			i++;
		} while (i <= 100);// 세미콜론 피일수우
		System.out.printf("\n1~ %d 합: %d\n", (i - 1), sum); 
		
		// 최소 한 번은 실행해야 하는 로직에 유용하지만, 실무에서는 거의 사용되지 않음
		
		// Quiz1: 1부터 100까지 홀수의 합
		
		i=1;
		int oddsum=0;
		while (i<=100) {
			if(i%2!=1)
				oddsum += i;
				i++;
		}
		System.out.println(oddsum);
		// Quiz2:
//		화면에서 자연수를 입력받아서 각 자리수의 합을 출력하는 프로그램을 구현하시오.
//
//		[입력]    [출력]
//		 123   =>  6
//		 12345 =>  15
//		
//		힌트: 
//		1) 마지막 자리 수 더하기
//		2) 마지막 자리 제거
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("자연수를 입력하시오");
		int num = sc.nextInt();
		i = 10;
		sum = 0;
		while(num>0) {
			sum = sum + (num % i);
			num = num / i;
		}
		System.out.println(sum);
	}
}
