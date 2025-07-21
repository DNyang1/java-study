package sec02.exam05;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		System.out.println(args.length);

		// 툴에서 직접 실행할떄 argument 주는 방법: Run Configurations > Arguments

		// main 메소드의 String[] 배열 매개 변수 활용
		if (args.length != 3) {
			System.out.println("값의 수가 부족합니다.");
//			System.exit(0); // 프로그램 (JVM) 강제 종료
			// 여기서 (0) 은 정상 종료를 의미
			
			return;
		}

		String Strnum1 = args[0];
		String Strnum2 = args[1];

		// Quiz : 문자열을 정수로 변환해서 더한 결과를 출력

		int num1 = Integer.parseInt(Strnum1);
		int num2 = Integer.parseInt(Strnum2);
		int result = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + result);
	}
}
