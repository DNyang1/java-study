package sec01.exam06;

public class SportsCar extends Car{
	
	@Override
	public void speedUp() {
		speed += 10;
	}
	
//	// final 메소드는 오버라이딩 안됨
//	public void stop() {
//		System.out.println("차를 멈춤");
//		speed = 0;
//	}
}
