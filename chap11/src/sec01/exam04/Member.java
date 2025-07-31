package sec01.exam04;

import java.util.Objects;

import sec01.exam04.Member;

public class Member { // 명시적으로 상속받은게 없으면 자동으로 Object 를 상속
	public String id;

	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if (id.equals(member.id)) { 
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

//	@Override
//	public int hashCode() {
//		// id가 같은거는 동일한 해시가 나오도록 만들어줄거임
//		return id.hashCode(); // String은 문자열이 같으면 동일한 해시가 나오도록 재정이되어잇음
//	}
	

	
	
	
	
}
