package homework;

public class Install {

	public static void main(String[] args) {
		RFunction rf = new RFunction();
		
		System.out.println("mergeStringResult: "+rf.mergeString("국", "밥"));
		System.out.println("mulInteger: "+rf.mulInteger(5,2));
		System.out.println("equalsString: "+rf.equalsString("국","국"));
	}
}
