package sec02.exam02;

public class ForSumFrom1To100Example1 {

	public static void main(String[] args) {
		// 1 ~ 100 합
		int sum = 0 ;
		
		for (int i = 1; i <= 100; i++) { // i 지금 안에서 선언했으니 밖에서 못씀, 지역변수
			sum = sum + i;
		}
		
		System.out.println("1~100합: " + sum);
	}
}
