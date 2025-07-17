package homework;

import java.util.Scanner;

//1) 문제
//Scanner로 문자열을 입력 받으세요.
//그 다음, 해당 문자열의 첫번째, 두번째, 세번째 문자를 출력해주는 시스템을 만들어주세요.
//2) 출력
//문자열을 입력하세요 : apple
//첫번째 문자 : a
//두번째 문자 : p
//세번째 문자 : p
public class Homework03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요: ");
		String str = sc.next();
		System.out.println("첫번째 문자" + str.substring(0,1));
		System.out.println("두번째 문자" + str.substring(1,2));
		System.out.println("세번째 문자" + str.substring(2,3));
	}
}
