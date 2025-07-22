package homework;

public class Homework01 {

	public static void main(String[] args) {
		int[] height = { 152, 180, 165, 158, 171};

		int temp;
		for (int i = 0; i < height.length; i++) {
			for (int j = 0; j < height.length-1; j++) {
				if (height[j] > height[j+1]) {
					temp = height[j];
					height[j] = height[j+1];
					height[j+1] = temp;
				}
			}
		}
		
		for (int i : height)
			System.out.print(i+",");
		
	}
}
