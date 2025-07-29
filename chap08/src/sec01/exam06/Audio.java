package sec01.exam06;

public class Audio implements RemoteControl{
	// 필드
	private int volume;
	
	
	@Override
	public void turnOn() {
		System.err.println("오디오 키기;");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오 끄기");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else
			this.volume = volume;
		System.out.println("현재 오디오불륨: "+this.volume);
	}
	

	
}
