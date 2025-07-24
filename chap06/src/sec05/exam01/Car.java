package sec05.exam01;

public class Car {
	// 필드
	String model;
	int speed;

	// 생성자
	public Car(String model) {
		this.model = model;
	}
	
	// 메소드(인스턴스 메서드)
	public void setSpeed(int speed) {
		this.speed = speed;

	}
	
	void run() {
		for (int i = 0; i < 50; i+=10) {
			this.setSpeed(i); // this 생략 가능
			System.out.println(this.model + "가 달림(시속기 " + this.speed + "km/h)" );
			// 위에꺼도 디스 생략가능
		}
	}
	
	
	
	
	
	
	
}
