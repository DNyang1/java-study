package sec01.exam02;

public class MemberExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		// obj1 과 2 는 물리적으로 다른 객체, 논리적으론 동일객체
		Member obj3 = new Member("red");
		
		// 얘가 이제 같은 객체인지(번지수 같은지)
		if (obj1.equals(obj2)) {
			System.out.println("1과 2는 같음");
		} else {
			System.out.println("1과 2는 다름");
		}
		
		// 논리적으로 같은지
		if (obj1.equals(obj3)) {
			System.out.println("1과 3는 같음");
		} else {
			System.out.println("1과 3는 다름");
		}
	}
}
