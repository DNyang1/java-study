package sec02.exam07;

public class FloatDoubleExample {
	
	public static void main(String[] args) {
		// float(4byte), double(8byte)
		// 부동 소수점 방식으로 저장
		// => 같은 크기를 갖는 int(4byte) 혹은 long(8byte)
		//  보다 더 큰 수를 저장 가능
		// byte < short < int < long < float < double
		
//		float var1 = 3.14; // 기볹적으로 컴파일러는 double 로 인식하기에,
						   // 얘는 float에 들어갈수 있는 작은 애다 하고 F 혹은 f를 붙여줘야
		float var2 = 3.14f;
		double var3 = 3.14;
		
		System.out.println(var2);
		System.out.println(var3);
		
		// 정밀도 테스트
		float var4 = 0.1234567890123456789f;
		double var5 = 0.1234567890123456789;
		
		System.out.println(var4);
		System.out.println(var5);
		
		// e 사용하기
		double var6 = 3e6; // 3.0 * 10^6
//		int var = 3e6; // E 또는 e가 있으면  => 실수 리터럴 (?)
		float var7 = 3e6f;
		double var8 = 2e-3; // 2.0 * 10^-3
		
		System.out.println(var6);
		System.out.println(var7);
		System.out.println(var8);
		
	}

}
