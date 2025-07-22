package homework02;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		boolean flag = true;
		do {
			System.out.println("게임을 실행합니다!");
			flag = true;
			System.out.println("게임을 다시 플레이 하시겠습니까?(yes / no)");
			String replay = sc.next();
			
			
			if (replay.equals("yes")) {
				
			}else {
				System.out.println("게임을 종료합니다.");
				flag = false;
			}
		} while (flag);

	}
}
