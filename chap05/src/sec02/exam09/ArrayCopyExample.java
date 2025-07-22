package sec02.exam09;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// 2. System.arraycopy() 메소드 이용
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];

		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

		for (int i = 0; i < newStrArray.length; i++) {
			System.out.println(newStrArray[i] + " ");
		}
		System.out.println();

		// 3. Array.copyOf() 메소드 이용

		// Arrays.copyOf(T[] original, int newLength)
		// Original: 복사할 원본 배열
		// newLength: 복사할 새 배열의 길이(기존보다 작거나 클 수 있음)
		// original 배열의 요소들을 앞에서 부터 newLength 까지 복사한 새로운 배열을 반환,
		// 길이가 늘어난 경우, 나머지 값들은 해당 타입의 기본값으로 채워짐

		String[] newStrArray2 = Arrays.copyOf(oldStrArray, oldStrArray.length + 2);
		for (int i = 0; i < newStrArray2.length; i++) {
			System.out.println(newStrArray2[i]);
		}
	}
}
