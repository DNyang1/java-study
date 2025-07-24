package homework.controller;

import homework.model.vo.Employee;
import homework.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		Employee em1 = new Employee();
		em1.name = "김철수";
		em1.team = "교육운영팀";
		
		Employee em2 = new Employee();
		em2.name = "이영희";
		em2.team = "경영지원팀";
		
		System.out.println(em1.name + " " + em1.team);
		System.out.println(em2.name + " " + em2.team);
		
		System.out.println();
		
		Person p1 = new Person();
		p1.phoneNumber = "01012345678";
		p1.height = 190.5;
		p1.weight = 100.2;
		
		Person p2 = new Person();
		p2.phoneNumber = "01056434563";
		p2.height = 175.4;
		p2.weight = 65.6;
		
		System.out.println(p1.phoneNumber + " " + p1.height + " " + p1.weight);
		System.out.println(p2.phoneNumber + " " + p2.height + " " + p2.weight);
		
	}
}
