package sec01.exam17;

public class StringLengthExample {
	public static void main(String[] args) {
		String ssn = "7306241230123";
		int length = ssn.length();
		
		if (length == 13) {
			System.out.println("자리수 맞음");
		} else {
			System.out.println("자리수 틀림");
		}
		
		
	}
}
