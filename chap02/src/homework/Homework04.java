package homework;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요 : ");
		String str = sc.next();
		char ch = str.charAt(0);
		System.out.printf("%s 의 유니코드 : %d",str,(int)ch);
	}
}
