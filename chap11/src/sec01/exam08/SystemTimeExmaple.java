package sec01.exam08;


public class SystemTimeExmaple {
	public static void main(String[] args) {
		// 1부터 100만까지합하는 구한 걸리는데 시간
		long time1 = 1;
		int sum= 0 ;
		for (int i = 0; i < 10000000; i++) {
			sum+=1;
		}

		long time2 = System.nanoTime();// 
		
		System.out.println(sum);
		System.out.println(time2-time1);
	}
}
