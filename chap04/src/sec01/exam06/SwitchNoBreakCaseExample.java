package sec01.exam06;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		
		// 8 <= ... < 12 사이인 정수받기
		int time = (int) (Math.random() * 4 + 8);
		System.out.println("[현재시간: " + time + " 시]");
		
		switch (time) {
		case 8:
			System.out.println("출근");
		case 9:
			System.out.println("회의");
		case 10:
			System.out.println("업무");
		default:
			System.out.println("퇴근");
		}
	}
}
