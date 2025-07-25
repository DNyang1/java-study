package homework;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = 0;

		while (true) {
			System.out.print("정수: ");
			len = sc.nextInt();

			if (len % 2 != 1 || len < 3) {
				System.out.println("다시 입력하세요");
			} else
				break;
		}

		int[] arr = new int[len];
		int num = 0;

		for (int i = 0; i < len; i++) {
			if (i < len / 2 + 1) {
				num++;
				arr[i] = num;
			} else {
				--num;
				arr[i] = num;
			}
		}

		for (int i : arr)
			System.out.println(i);

	}
}
