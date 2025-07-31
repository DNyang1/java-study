package sec01.exam05;

import java.util.Date;

public class ToStringExample {
	public static void main(String[] args) {
		Object obj1 = new Object();
		System.out.println(obj1.toString()); // 클래스 이름과 해시코드
		System.out.println(obj1); // 객체 출력하면 자동으로 나옴
		
		Date obj2 = new Date();
		System.out.println(obj2.toString()); // tostring 이 date에서 오버라이딩 됨
		System.out.println(obj2);
		
	}
}
