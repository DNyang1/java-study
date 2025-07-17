package homework;

import java.util.Scanner;

//## 1) 문제
//
//사용자로부터 한 자리 숫자를 입력 받아서
//
//해당 숫자의 제곱을 출력하는 프로그램을 작성하세요.
//
//단, 문자열 형태로 값을 입력 받은 다음,
//
//char 타입의 변수에 저장하세요.
public class Homework06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("한 자리 숫자를 입력하세요: ");
		char chnum = sc.nextLine().charAt(0); 
		int n1 = chnum - '0';
		System.out.println(n1 * n1);
		
	}
}
