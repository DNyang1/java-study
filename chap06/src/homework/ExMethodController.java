package homework;

public class ExMethodController {
	// 전달된 메세지를 출력하는 메소드 구현
	void printM(String message) {
		System.out.println(message);
	}

	// 1~100까지 합을 반환하는 메소드구현
	int oneTo100Sum() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}

	String evenOrOdd(int num) {
		if (num % 2 == 0)
			return "짝수";
		return "홀수";
	}

	String engSeach(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) > 'a' || str.charAt(i) < 'Z')
				return "있음";
		}
		return "없음";
	}
	
	void strLenSeach(String str) {
		System.out.println(str.length());
	}
	
	void gooGoo(int num) {
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d x %d = %d\n",num,i,(9*i));
		}
	}

}
