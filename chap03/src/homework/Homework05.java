package homework;

import java.util.Scanner;

//1) 문제
//주민번호를 입력하면 남자인지 여자인지 출력해주는 
//프로그램을 구성해주세요.
//주민번호 문자열 정보 중 인덱스가 7인 문자의 
//값이 1 또는 3이면 남성, 2 또는 4이면 여성입니다.
//가능하다면 1,2,3,4 외의 값을 입력한 경우도 고려해보세요.
//2) 출력 예시
//주민번호(-) : 123456-1234567
//입력하신 주민번호는 남성입니다.
//​
//주민번호(-) : 123456-7891234
//입력하신 주민번호는 잘못된 값입니다.
public class Homework05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호(-) : ");
		int id = sc.next().charAt(7);

		int sexn = id - '0';
		String sex = (sexn >= 1&& sexn <=4) ? ((sexn == 1||sexn==3)?"남성":"여성"): "잘못된 값";
		
		System.out.printf("입력하신 주민번호는 %s입니다.", sex);
		
		
		
	}
}
