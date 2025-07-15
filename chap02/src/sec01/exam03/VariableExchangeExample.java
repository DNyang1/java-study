package sec01.exam03;

public class VariableExchangeExample {

	public static void main(String[] args) {

		int x = 3;
		int y = 5;
		System.out.println("x: " + x + ", y: " + y);

//		y = x; // x에 저장된 값을 변수 y에 저장
		System.out.println("x: " + x + ", y: " + y);
		
		int temp;
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("x: " + x + ", y: " + y);
		
	}

}
