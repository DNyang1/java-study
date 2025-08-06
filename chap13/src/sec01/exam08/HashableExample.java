package sec01.exam08;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashableExample {

	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();

		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("아이디 비번 입력");
			System.out.println("아이디:");
			String id = sc.nextLine();

			System.out.println("비밀번호: ");
			String password = sc.nextLine();

			if (map.containsKey(id)) {
				if (map.get(id).equals(password)) {
					System.out.println("로그인 성공");
					break;
				} else
					System.out.println("비밀번호 틀림");
			} else
				System.out.println("아이디 존재하지 않아요");

		}

	}
}
