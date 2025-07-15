package sec01.exam04;

public class VariableScopeExample {

	public static void main(String[] args) {

		int v1 = 15; // 얘는 main 안에서 선언한거

		if (v1 > 10) {
			int v2; // 얘는 main 안에 if 안에서 선언한거
			v2 = v1 - 10;
		}

//		int v3 = v1 + v2 + 5; // 유효범위를 벗어난 v2 변수를 사용할 수 없음

	}
}
