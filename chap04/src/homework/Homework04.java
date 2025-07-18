package homework;

import java.util.Scanner;

//## 2) 문제
//
//- 철수네 공장은 문제가 발생했을 때, 상황별 코드를 입력하면 현재 발생한 문제 상황을 출력해주는 프로그램을 만들려고 해요.
//- 상황별 코드에 따른 문제 상황은 아래와 같습니다.
//    - 400 : 잘못된 요청입니다.
//    - 404 : 요청하신 서비스를 찾을 수 없습니다.
//    - 500 : 처리 방법을 알 수 없는 문제가 발생했습니다.
//    - 503 : 일시적인 서버 오류가 발생하였습니다.
//    - 그 외 : 알 수 없는 오류가 발생하였습니다.
//- switch문을 사용하세요.
//
//## 3) 출력 예시
public class Homework04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("=== 철수네 공장 ===");
		
		System.out.print("수집된 코드 : ");
		int code = sc.nextInt();
		
		switch (code) {
		case 400:
			System.out.println("잘못된 요청입니다");
			break;
		case 404:
			System.out.println("요청하신 서비스를 찾을 수 없습니다");
			break;
		case 500:
			System.out.println("처리 방법을 알 수 없는 문제가 발생했습니다.");
			break;
		case 503:
			System.out.println("일시적인 서버 오류가 발생하였습니다.");
			break;
		default:
			System.out.println("알 수 없는 오류가 발생하였습니다");
			break;
		}
		
	}
}
