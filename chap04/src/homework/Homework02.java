package homework;

import java.util.Scanner;

//2) 문제
//철수는 월과 기온을 입력받아서 계절과 주의보/경보를 출력하려고 합니다.
//3,4,5월은 봄, 6,7,8월은 여름, 9,10,11월은 가을, 12,1,2월은 겨울입니다. 
//겨울은 기온에 따라 특별한 주의보/경보를 가집니다.
//기온이 -15도 이하이면 한파 경보
//기온이 -12 이하이면 한파 주의보
//여름도 기온에 따라 특별한 주의보/경보가 발생합니다.
//기온이 35도 이상이 되면 폭염 경보
//기온이 33도 이상이면 폭염 주의보
//만일 1~12월 사이가 아닌 월을 입력하면 해당하는 계절이 없다고 알려주세요. 
//중첩된 if~else if~else문을 사용하세요
//3) 출력 예시
//(생략)
//선택: 2
//=== 일기예보 ===
//월 : 7
//기온 : 38
//여름 폭염 경보
public class Homework02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== 일기예보 ===");
		
		System.out.println("월: ");
		int month = sc.nextInt();
		System.out.println("기온: ");
		int temper = sc.nextInt();

		if (month == 3 || month == 4 || month == 5) { // 봄
			System.out.println("봄 ");
		} else if (month == 6 || month == 7 || month == 8) {
			System.out.print("여름 ");
			if (temper >= 35)
				System.out.println("폭염 경보");
			else if (temper >= 33)
				System.out.println("폭염 주의보");
		} else if (month == 9 || month == 10 || month == 11) {
			System.out.println("가을 ");
		} else if (month == 12 || month == 1 || month == 2) {
			System.out.print("겨울 ");
			if (temper <= -15)
				System.out.println("한파 경보");
			else if (temper <= -12)
				System.out.println("한파 주의보");
		} else
			System.out.println("해당하는 계절이 없어용");

	}
}
