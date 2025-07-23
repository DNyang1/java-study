package sec04.exam06;

public class Calculator {
	
	// 정사각형의 넓이
	double areaRectangle(double width) {
		return width * width;
	}
	// 직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}
	
	// 메소드 오버로딩의 조건
	// 1. 메소드명이 같아야 함
	// 2. 매개변수의 타입, 개수, 순서가 달라야함
	// 3. 매개변수명, 리턴타입이 다르다고 해서 오버로딩이 아님
	
	// 메소드 오버로딩을하는 이유?
	// 다양한 형태의 매개값을 주고 처리할 수 있도록 하기위해
	// 오버로딩을 안 쓰면 같은기능을 각각 다른 이름으로 정의해야함
	
	
}
