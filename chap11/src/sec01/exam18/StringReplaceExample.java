package sec01.exam18;

public class StringReplaceExample {
	public static void main(String[] args) {
		String oldStr = "자바는 어쩌구";
		String newStr = oldStr.replace("자바", "JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);
	}
}
