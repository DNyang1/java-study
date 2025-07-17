package sec02.exam04;

import java.util.Scanner;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result1 = " + result1);

		int result2 = v1 - v2;
		System.out.println("result2 = " + result2);
		
		int result3 = v1 * v2;
		System.out.println("result3 = " + result3);
		
		int result4 = v1 / v2;
		System.out.println("result4 = " + result4);
		
		int result5 = v1 % v2;
		System.out.println("result5 = " + result5);
		// 나머지 연산, 짝/홀, 배수 확인
		// 정확한 나누기 결과값을 얻으려면 double 로 선언하거나 타입변환 하기
		double result6 =  v1 / v2;
		System.out.println("result6 = " + result6);
		
		// Quiz
//		화면에서 2자리 정수를 입력받아 10의 자리 미만을 버리고
//		출력하는 프로그램을 구현하시오
//		
//		[입력]    [출력]
//		55 => 50
//		60 => 60
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2자리 정수 입력: ");
		int input = sc.nextInt();
		
		int output = (input / 10) * 10;
		System.out.println(output);
		
	}
}
