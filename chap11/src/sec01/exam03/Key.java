package sec01.exam03;

import java.util.Objects;

public class Key {
	public int number;

	public Key(int number) {
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("재정의한 equals 호출");
		// 먼저 Key가 맞는지 검사 후 변환
		if (obj instanceof Key comKey) {
			if (this.number == comKey.number) {
				return true;
			}
		}
		return false;
	}

	
	// Objects.hash(...) <- 가변인자 필드2, 필드3, ....
	// hashCode 만들기 쉬우라고 만들어놈
	@Override
	public int hashCode() {
		return Objects.hash(number);
	}
	// equals 써도 그 전에 hashcode 비교할떄 떙떙 해버림
	// 그래서 hashcode도 오버라이딩 해야하는 아주 귀찮은 
	// 보통 그거떄문에 String 에만 주로 씀 (String 에는 equals랑 hashcode 둘다 재정의 해놈)
	
	
	
	
	
}
