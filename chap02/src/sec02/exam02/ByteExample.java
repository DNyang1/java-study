package sec02.exam02;

public class ByteExample {
	public static void main(String[] args) {
		// byte (1byte)
		// range : -128 ~ 127
		
		byte var1 = -128;
		byte var2 = 0;
		byte var3 = 127;
		byte var4 = 125;
//		byte var4 = 128; // 데이터 타입의 지정된 범위를 벗어난 값이 입력되면 에러 발생
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var3 + var4);
	
		byte var5 = 127;
		System.out.println(var5);
		var5++;
		System.out.println(var5);
		var5++;
		System.out.println(var5);
		var5++;
		System.out.println(var5);
		
		byte var6 = -127;
		System.out.println(var6);
		var6--;
		System.out.println(var6);
		var6--;
		System.out.println(var6);
		var6--;
		System.out.println(var6);
		
	}
}