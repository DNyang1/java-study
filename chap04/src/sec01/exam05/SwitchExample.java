package sec01.exam05;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		
		int num = (int) (Math.random() * 6) +1;
	
		switch (num) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		default:
			System.out.println("6번이 나왔습니다.");
			break;
		}
		// (정리)
		// if 문 : 조건식의 결과가 true / false 에 따라 실행
		// switch 문 : 변수의 값에 다라 실행문을 선택해서 실행
		// => 특정 값에 따라 명확하게 분기 처리 할 때에 가장 적합
		
		// Quiz
//		철수는 스위치로 조명을 조절하는 스마트 조명을 설치했다
//		조명의 밝기는 사용자가 입력한 값에 따라 조절됨
//		아래와 같은 기준을 따른다고 했을 때에
//		사용자가 입력한 값에 따라서 밝기를 출력하는 프로그램을 작성하세요
//		- 0: 조명을 끕니다
//		- 1: 어두운 조명입니다
//		- 2: 밝은 조명입니다
//		- 3: 매우 밝은 조명입니다
	//	
//		입력한 값이 위의 기준에 해당하지 않으면 "올바른 입력이 아닙니다." 라고 출력하시용
	//	
//		[출력]
//		조명의 밝기를 입력하세요 (0~3) : 3
//		현재 조명의 밝기: 매우 밝은 조명입니다
	//	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("조명의 밝기를 입력하세용 (0~3) :");
		int ss = sc.nextInt();
		String li;
		
		switch (ss) {
		case 0:
			li = "조명을 끕니다";
			break;
		case 1:
			li = "어두운 조명입니다";
			break;
		case 2:
			li = "밝은 조명입니다";
			break;	
		default:
			li = "매우 밝은 조명입니다";
			break;
		}
		
		System.out.printf("현재 조명의 밝기는: %s" ,li);
		
	}


}
