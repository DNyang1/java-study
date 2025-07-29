package sec01.exam04;

public class Television implements RemoteControl{
	// 필드
	private int volume;
	
	
	@Override
	public void turnOn() {
		System.err.println("티비 키기;");
	}

	@Override
	public void turnOff() {
		System.out.println("티비 끄기");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) { // 인터페이스명. 상수명으로 명확하게 출처 나타냄
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else
			this.volume = volume;
		System.out.println("현재 오디오불륨: "+this.volume);
	}
	

	
}
