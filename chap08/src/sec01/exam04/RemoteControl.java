package sec01.exam04;

public interface RemoteControl {
	// 상수
	int MAX_VOLUME = 10; // 우리가 따로 뭐 안해도 public static final 이 자동으로 추가됨
	int MIN_VOLUME = 0;
	
	// 추상 메소드
	// 추상 메소드라서 실행 블록은 없는 상태
	// public abstract 자동 추가
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
