package homework02;

import java.util.Scanner;

public class Homework07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		do {
			System.out.print("정수: ");
			num = sc.nextInt();
			
			if(num>0) {
				for (int i = 1; i <= num; i++) {
					if(i%2!=0)
						System.out.print("박");
					else
						System.out.print("수");
				}
				System.out.println();
			}else {
				System.out.println("양수가 아닙니다");

			}
		} while (num<=0);
		

	}
}
