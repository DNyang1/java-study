package homework;

import java.util.Scanner;

//1) 문제
//인테리어의 신 철수는 안방을 꾸미는 일을 의뢰 받았습니다.
//방의 가로, 세로 값을 키보드로 입력하면
//방의 면적과 둘레를 계산하여 출력해주는 시스템을 만들어주세요. 
//면적 : 가로 * 세로
//둘레 : (가로+세로)*2
//2) 출력
//가로 : 13.5
//세로 : 41.7
//면적 : 562.95
//둘레 : 110.4
public class Homework02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double length, width, per, area, pe;
		
		System.out.print("가로를 입력해 주세여");
		length = sc.nextDouble();
		System.out.print("세로를 입력해 주세여");
		width = sc.nextDouble();
		
		area = length * width;
		pe = length + width;
		per = pe*2;

		System.out.printf("가로: %.1f\n", length);
		System.out.printf("세로: %.1f\n", width);
		System.out.printf("면적: %.2f\n", area);
		System.out.printf("둘레: %.1f", per);
		
		
	}
}
