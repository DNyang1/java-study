package sec02.exam10;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = {95,71,84,93,87};
		
		int sum = 0;
		for (int i : scores) sum += i;
		System.out.printf("점수 총합= %d", sum);
		System.out.println();
		
		double avg = sum / (double)scores.length;
		System.out.printf("점수 평균= %f", avg);

		// 정리:
		// 기본 for 문 보다 코드가 간결하여 자주 쓰임
		// 배열 index 값의 사용이 필요할 때는 기본 for 문을 쓰면 됨
	}
}
