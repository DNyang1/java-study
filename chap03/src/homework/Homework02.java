package homework;

import java.util.Scanner;
//1) 문제
//철수는 화이트 데이를 맞아서 친구들에게 사탕을 나눠주려고 해요.
//인싸인 철수는 매일 친구의 수가 달라지고,
//사탕을 몇 개 살 수 있는지도 아직 알 수 없어요.
//그래서 철수의 친구 수와 구입한 사탕 개수를 입력하면
//친구 한명당 최대 몇개의 사탕을 나눠줄 수 있고,
//남는 사탕의 개수는 몇개인지를 
//출력하는 시스템을 만들고자 합니다.
//2) 출력 예시
//친구 수 : 29
//사탕의 수 : 100
//1인당 사탕 개수 : 3개
//남는 사탕 개수 : 13개
public class Homework02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("구슬의 개수: ");
		int bead = sc.nextInt();
		String even = (bead % 2 == 0) ? "짝수" : "홀수";
		System.out.printf("구슬의 개수는 %s 입니다.", even);

	}

}
