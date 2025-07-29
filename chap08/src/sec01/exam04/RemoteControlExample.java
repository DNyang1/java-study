package sec01.exam04;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;
//		rc = new remoteControl(); // 인터페이스는 객체의 사용 방법안을 기술한 후 작업, 객체 생성 불가
		// 그 대신 인터페이스 타입에 구현 객체를 유일하게 담기 가능
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		// 정리 : 메소드 호출 코드는 똑같은데 어떤 구현 객체가 대입되었나에 따라결과 바뀜 -> 다형성
	}
}
