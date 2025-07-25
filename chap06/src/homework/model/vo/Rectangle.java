package homework.model.vo;

public class Rectangle {
	private int width = 1;
	private int height = 1;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int calculateRound(int width, int height) {
		this.width = width;
		this.height = height;
		return width*2+height*2;
	}
	
	public int calculateArea(int width, int height) {
		this.width = width;
		this.height= height;
		return (width*height);
	}
	
	public void printInfo() {
		System.out.println("=== 사각형 정보 ===");
		System.out.println("1. 사각형의 둘레");
		System.out.println(calculateRound(width, height) + " cm");
		System.out.println("2. 사각형의 넓이");
		System.out.println(calculateArea(width, height) + " cm");
	}
	
}
