package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework06 {

	public static void main(String[] args) {
		// 배열 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요: ");
		int arrlen = sc.nextInt();
		sc.nextLine(); // 버퍼 비우기
		String[] arr = new String[arrlen]; // 배열 초기화
		
		
		// 초기화 된 배열에 초기값 입력
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i+1) + "번째 문자열: ");
				arr[i] = sc.nextLine();
		}
		
		// 더 입력하시겠습니까?
		while (true) {
			System.out.print("값을 더 입력하시겠습니까?(Y/N) : ");
			String re = sc.next();
			
			// 더 입력 유무 판단
			if(re.equals("n")||re.equals("N")||re.equals("Y")||re.equals("y")) {
				if (re.equals("n")||re.equals("N"))
					break;
			}else {
				System.out.println("입력할수 없는 값입니다");
				continue;
			}
			
			// 새 배열 생성 및 기존배열 복사
			System.out.print("더 입력 하고싶은 개수: ");
			
			int parrlen = sc.nextInt(); // 길이 재정의
			arrlen +=parrlen;
			
			sc.nextLine(); // 버퍼 비우기
			
			String[] newArr = Arrays.copyOf(arr, arrlen); // 배열 재정의
			arr = newArr;
			
			// 값 추기 입력
			for (int i = arrlen-parrlen; i < arr.length; i++) {
				System.out.print((i+1) + "번째 문자열: ");
					arr[i] = sc.nextLine();
			}
			
		}
		// 반복문 종료 후 배열 출력
		for (String string : arr) {
			System.out.println(string);
		}
		
	}
}
