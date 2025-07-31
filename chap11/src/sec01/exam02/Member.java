package sec01.exam02;

public class Member { // 명시적으로 상속받은게 없으면 자동으로 Object 를 상속
	public String id;

	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		// 매개변수의 타입이 Object 이면 모든 객체가 대입가능
		// 제일먼저 매개값이 member 타입인지 확인이 필요
		if(obj instanceof Member) {
			// id 필드에 접근하기 위해 Member 로 변환
			Member member = (Member)obj;
			// 필드값이 동일한지
			if (id.equals(member.id)) { // 여기서의 equals()는 String의 equals()임
				return true;
			}
		}
		return false;
	}
	
	
	
}
