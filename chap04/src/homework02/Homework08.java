package homework02;

import java.util.Scanner;

public class Homework08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputString;
		String inputChar;

		for (;;) {

			int count = 0;

			System.out.print("문자열: ");
			inputString = sc.next();
			System.out.print("문자: ");
			inputChar = sc.next();

			for (int i = 0; i < inputString.length(); i++) {
				if (inputString.charAt(i) == inputChar.charAt(0)) {
					count++;
				}
			}

			System.out.println("포함된 개수 : " + count);

			while (true) {
				System.out.println("다시 입력하시겠습니까?");
				String repeat = sc.next();

				if (repeat.equals("y") || repeat.equals("Y")) {
					break;
				} else if (repeat.equals("n") || repeat.equals("N")) {
					System.exit(0);
				} else {
					System.out.println("잘못된 대답입니다. 다시 입력해주세용");
				}
			}

		}
	}
}
