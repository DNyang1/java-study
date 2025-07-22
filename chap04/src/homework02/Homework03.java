package homework02;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		
		for(;;) {
			System.out.print("입력: ");
			input = sc.nextLine();
			System.out.println(input);
			
			if(input.equals("탈출")) {
				System.out.println("프로그램 종료");
				break;
			}
				
		}
		
		
	}
}
