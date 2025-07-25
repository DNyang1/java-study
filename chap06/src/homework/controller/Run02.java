package homework.controller;

import java.util.Scanner;

import homework.model.vo.Employee02;
import homework.model.vo.Member;
import homework.model.vo.Rectangle;

public class Run02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 객체 과제
		// 1번
		Member member = new Member();
		
		member.changeName("김철수");
		member.printName();
		
		// 2번
		Rectangle rectangle = new Rectangle(2, 2);
		rectangle.printInfo();
		
		// 3번
		
		Employee02 employee02 = new Employee02();
		
	}

}
