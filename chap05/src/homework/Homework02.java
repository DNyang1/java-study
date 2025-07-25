package homework;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수:");
		
		int len = sc.nextInt();
		int[] arr = new int[len];

		int sum = 0;
		
		for (int i = 0; i < len; i++) {
			System.out.printf("배열 %d 번째 인덱스에 넣을 값: ", i);
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		for (int i : arr) System.out.print(i+ " ");
		System.out.println();
		System.out.println("총 합: " + sum);
		
		
	}
}
