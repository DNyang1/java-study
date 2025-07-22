package homework02;


public class Homework06 {

	public static void main(String[] args) {
		

		int star = 1;
		int blank = 4;
		for (int i = 1; i <= 5; i++) {
			System.out.print(" ".repeat(blank));
			System.out.print("*".repeat(star));
			System.out.print(" ".repeat(blank));
			System.out.println();
			star +=2;
			blank--;
			
		}
	}
}
