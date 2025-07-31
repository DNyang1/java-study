package sec01.quiz;

import java.util.Iterator;
import java.util.Scanner;

public class Quiz1 {
//	Quiz
//	문자열을 입력 받아 입력된 문자열 중 숫자들의 합계를 출력하시오.
//
//	[입력]
//	1) 1,2,3,4,5
//	2) 1-2-3-4-5
//	3) a1b2c3de45
//
//	[출력]
//	1) 15
//	2) 15
//	3) 15

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력");
		String str = sc.nextLine();
		
		int sum = 0;
		
		for (char ch : str.toCharArray()) {
			if (ch >= '0' && ch <= '9')
				sum += (ch - '0');
		}
		System.out.println(sum);
		
		
	}

	
	
}
