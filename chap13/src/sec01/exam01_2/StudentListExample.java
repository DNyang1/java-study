package sec01.exam01_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentListExample {
	public static void main(String[] args) {
		// 타입 파라미터로 사용자 정의 객체를 사용할 경우
		List<Student> studentsList = new ArrayList<Student>();
		studentsList.add(new Student("이재명", 1));
		studentsList.add(new Student("김문수", 2));
		studentsList.add(new Student("이준석", 4));

		// 객체 검색
		// 사용자 정의 객체를 사용할 경우 indexOf(), contains() 가
		// 해당 객체 존재 여부를 판단하는 기준은 equals()
		// 결국 재정의 해야함
		if (studentsList.indexOf(new Student("김재현", 30)) != -1) {
			System.out.println("있다");
		} else {
			System.out.println("없다");
		}
		
		// 요소 정렬
		
		Collections.sort(studentsList); // 재정의한 compareTo() 기준으로 정렬
		System.out.println("나이 기준 기본 정렬:");
		for (Student s : studentsList) {
			System.out.println(s.getName() + " - " + s.getAge());
		}
		
	}
}
