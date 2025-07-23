package sec04.exam03;

public class Car {
	// 필드
	int gas;
	
	// 생성자
	// 기본 생성자 사용
	
	// 메소드
	// 연료를 주입하는 메소드
	public void setGas(int gas) {
		this.gas = gas;
	}
	
	// 연료를 확인하는 메소드
	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("가스가 업습니다");
			return false;
		}
		
			System.out.println("가스가 있어요");
			return true;
	}
	
	
	// 달리는 메소드
	void run() {
		while (true) {
			if (gas>0) {
				System.out.println("달립니다.(가스 잔량: " + gas + ")");
				gas--;
			}else {
				System.out.println("멈춥니다.(가스 잔량: " + gas + ")");
				return; // 그 즉시 메소드 종료
//				break; // 가장 가까운 반복문을 탈출
			}
		}
		
	}


	
}
