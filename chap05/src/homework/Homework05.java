package homework;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] choices = {"가위", "바위", "보"};
		
		int cnum=(int)(Math.random()*30)+1;
		if (cnum>10) {
			String choice = choices[0];
		}
	}
}
