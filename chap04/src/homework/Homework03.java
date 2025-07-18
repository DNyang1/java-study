package homework;

import java.util.Scanner;

//
//2) 문제
//사용자로부터 세 개의 정수를 입력 받으세요. 
//삼항 연산자를 사용하여 세 수 중에서 가장 작은 수를 찾아서 출력하세요.
//중첩된 삼항 연산자를 사용하세요.
//3) 출력 예시
//(생략)
//선택: 3
//=== 세개의 정수 비교하기 ===
//첫 번째 정수 : 123
//두 번째 정수 : 875
//세 번째 정수 : 37
//세 수 중에서 가장 작은 수는 37입니다.
public class Homework03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== 세개의 정수 비교하기 ===");
		
		System.out.print("첫번째 정수: ");
		int num1 = sc.nextInt();
		System.out.print("첫번째 정수: ");
		int num2 = sc.nextInt();
		System.out.print("첫번째 정수: ");
		int num3 = sc.nextInt();

		if (num1 < num2) {
			if (num1 < num3)
				System.out.printf("세 수 중에서 가장 작은 수는 %d 입니다",num1);
			else
				System.out.printf("세 수 중에서 가장 작은 수는 %d 입니다",num3);
				
		} else if (num1 > num2) {
			if (num2 < num3)
				System.out.printf("세 수 중에서 가장 작은 수는 %d 입니다",num2);
			else
				System.out.printf("세 수 중에서 가장 작은 수는 %d 입니다",num3);
		}
		
	}
}
