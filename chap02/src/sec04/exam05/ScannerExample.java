package sec04.exam05;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		String inputData;
		
		while (true) {
			inputData = sc.nextLine(); // 한 줄을 통째로 읽어버리는.
			System.out.println("입력된 문자열: " + inputData);
			
			
//			if (inputData == "q") // 이거 안됨
			if (inputData.equals("q")) // 이거는 됨
				break;
			
		}
		System.out.println("end");
		
		//Quiz
//		2개의 int 값을 입력받아 입력받은 값을 화면에, 로 연결하여 출력
//		[입력] 	 [출력]
//		10 20 => 10, 20
		int num1, num2;
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		
		System.out.println(num1 + "," + num2);
//      주의!
//		nextInt() 나 next() 는 입력 후 개행 문자(\n) 을 버퍼에 남김
//		따라서 그 다음이 nextLine() 을 쓰면 개행을 읽어버려서 빈 문자열 (**)이 들어감
//		해결법: 중간에 sc.nextLine()을 한번 호출해 버퍼를 정리
		
		int age = sc.nextInt(); // 25 입력 + Enter
		sc.nextLine(); // 버퍼 비우기
		String name = sc.nextLine();
		System.out.println("name: " + name);
 		
	}
}
