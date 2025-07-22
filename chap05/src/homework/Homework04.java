package homework;

import java.util.Arrays;

public class Homework04 {

	public static void main(String[] args) {
		
		int[] arr = new int[6];
		int count = 0;
		boolean duplicate;
		
		while (true){
			duplicate = false;
			
			arr[count]=(int)(Math.random()*45)+1;
			
			for (int i = 0; i < count; i++) {
				if(arr[i] == arr[count]) {
					duplicate = true;
					break;
				}
			}
			
			if (!duplicate) 
				count++;
			
			if (arr[5] !=0)
				break;
		}
		
		
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
