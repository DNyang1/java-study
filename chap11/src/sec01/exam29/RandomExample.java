package sec01.exam29;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		// Random 클래스
		// Math.random() 보다 더 다양한 기능과 제어를 제공
		// 정수, 실수, 논리값 등 다양한 타입의 난수 생성
		Random random = new Random();
		
		// 아래 주석 해제한 뒤 실행 해볼것
		// random.setSeed(1234);
		// 시드(seed)란?
		// 난수 생성기의 "초기값"
		// 동일한 시드를 넣으면 항상 같은 순서
		// 시드를 지정 안하면 지금 시간에따라 대충지정
		
		int randInt1 = random.nextInt();
		int randInt2 = random.nextInt();
		int randInt3 = random.nextInt();
		// 범위 지정 (이상, 미만)
		int randInt4 = random.nextInt(0, 10); // 0 ~ 9
		int randInt5 = random.nextInt(0, 10); // 0 ~ 9
		int randInt6 = random.nextInt(0, 10); // 0 ~ 9
		
		System.out.println(randInt1);
		System.out.println(randInt2);
		System.out.println(randInt3);
		System.out.println(randInt4);
		System.out.println(randInt5);
		System.out.println(randInt6);
		
		double randDouble1 = random.nextDouble();
		double randDouble2 = random.nextDouble();
		// 범위 지정 (이상, 미만)
		double randDouble3 = random.nextDouble(0,10);
		double randDouble4 = random.nextDouble(0,10);
		
		System.out.println(randDouble1);
		System.out.println(randDouble2);
		System.out.println(randDouble3);
		System.out.println(randDouble4);
	
		boolean randBoolean1 = random.nextBoolean();
		boolean randBoolean2 = random.nextBoolean();

		System.out.println(randBoolean1);
		System.out.println(randBoolean2);
		

	}
}
