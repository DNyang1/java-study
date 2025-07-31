package sec01.exam11;

public class ByteToStringExample {
	public static void main(String[] args) {
		byte[] bytes = {72,101,100,100,111,32,74,97,110,97};
		
		String str1 = new String(bytes);
		System.out.println(str1);

		String str2 = new String(bytes,6,4);
		System.out.println(str2);
		
	}
}
