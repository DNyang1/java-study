package homework;

public class RFunction {

	public String mergeString(String str1, String str2) {
		return (str1 + str2);
	}

	public int mulInteger(int num1, int num2) {
		if (num1 < num2) {
			System.out.println("계산할수 없습니다");
			return 0;
		}
		return (num1 * num2);
	}
	
	public boolean equalsString(String str1, String str2) {
		if(str1.equals(str2))
			return true;
		return false;
	}
	
	
	
}
