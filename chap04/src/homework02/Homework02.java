package homework02;

import java.util.Iterator;
import java.util.Scanner;

public class Homework02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = 0;
		boolean flag = true;

		while (flag) {
			System.out.printf("숫자: ");
			num = sc.nextInt();
			if (num < 0)
				System.out.println("양수만 입력해주세요");
			else if (num > 9)
				System.out.println("9 이하의 숫자만 입력해주세요");
			else
				flag = false;
		}

		System.out.printf("=== %d단 ===\n", num);
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d \n", num, i, num * i);
		}
	}
	
}
