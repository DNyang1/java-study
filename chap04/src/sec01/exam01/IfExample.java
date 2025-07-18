package sec01.exam01;

public class IfExample {

	public static void main(String[] args) {
		
		int score = 93;
		
		if (score >= 90) { // 조건식이 true 이기 때문에 if 문 내부 실행
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은 A 입니다");
		}
		
		if (score < 90) { // 조건식이 false 이기 때문에 if 문 내부 실행 X
			System.out.println("점수가 90보다 작습니다"); // 중괄호가 생략되면 실행 범위가 다음 한줄
			System.out.println("등급은 B 입니다");
			
		}
		
	}
}
