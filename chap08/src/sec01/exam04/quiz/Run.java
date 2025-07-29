package sec01.exam04.quiz;

public class Run {
	// Quiz
//	실행클래스를 실행하였을 떄 다음의 결과가 나오도록 관련 인터페이스와 클래스를구현
//	
//	[출력]
//	DanceRobot 은 춤을 춥니다
//	SingRobot 은 노래를 부릅니다
//	DrawRobot 은 그림을 그립니다
	
	public static void main(String[] args) {
		Actionable[] robot = new Actionable[3];
		
		robot[0] = new DanceRobot();
		robot[1] = new SingRobot();
		robot[2] = new DrawRobot();
		
		for (Actionable r : robot) {
			r.action();
		}
	}
}
