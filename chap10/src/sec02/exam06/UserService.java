package sec02.exam06;

public class UserService {
	public void registerUser (int age) throws InvalidAgeException{
		
		if (age < 0) {
			// throw : 예외 발생 시키기
			throw new InvalidAgeException("나이는 0 보다 작을수없음");
			// 참고: 만약 InvalidInputException 처럼 명확히만들면 뭔지 알기 편함
		}
		System.out.println("사용자 등록 완료");
		
	}
}
