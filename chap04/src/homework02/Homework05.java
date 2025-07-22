package homework02;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num=0;
		int sum=0;
		do {
			System.out.print("숫자(0을 입력하면 종료): ");
			num = sc.nextInt();
			if(num >= 0)
				sum+=num;
			else
				continue;
		} while (num!=0);
		System.out.println("양수의 합계: "+sum);
		
	}
}
