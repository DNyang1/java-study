package sec01.exam01;

// 자식 클래스: 일반적인 특성은 물려받고 추가로 자식만의 맴버로 구성
// 여기서는 CellPhone 을 확장하여 DMB 기능만 추가된 클래스
public class DmbCellPhone extends CellPhone{
	// 필드
	int channel;
	
	// 생성자
	public DmbCellPhone(String model, String color, int channel) {
		super(); // 부모 생성자 호출(자동으로 추가됨 원래)
		this.model = model; // 부모(CellPhone)로 부터 물려받은거
		this.color = color; // 이하동일
		this.channel = channel;
		
	}
	
	// 메서드
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}

}
