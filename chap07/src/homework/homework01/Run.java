package homework.homework01;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		// 3명의 학생 정보를 기록할 수 있게 객체 배열 할당 (Student[]) 
		Student[] studentsArr = new Student[3];
		
		// 사용데이터 참고하여 3명의 학생 정보 초기화 
		studentsArr[0] = new Student("김철수", 20, 178.2, 70.0, 1, "정보시스템공학과");
		studentsArr[1] = new Student("이영희", 23, 167.0, 54.0, 4, "물리학과");
		studentsArr[2] = new Student("홍길동", 21, 197.6, 86.0, 2, "경영학과");

		// 위의 학생 정보 모두 출력      
		for (Student student : studentsArr) {
			System.out.println("=== " + student.name + " ===");
			System.out.println("나이 : " + student.getAge());
			System.out.println("키 : " + student.getHeight());
			System.out.println("몸무게 : " + student.getWeight());
			System.out.println("학년 : " + student.getGrade());
			System.out.println("전공 : " + student.getMajor());
		}

		// 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당 (Employee[]) 
		Employee[] employeesArr = new Employee[10];
		
		// 사원들의 정보를 키보드로 계속 입력 받고   --> while(true) 무한 반복문을 통해 
		// 입력받은 정보들을 가지고 매개변수 생성자를 이용하여 객체배열에 객체 생성 
		// 한 명씩 추가 될 때마다 카운트함 
		 
		// 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가 
		// ‘n’일 경우 더 이상 그만 입력 받도록.. 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== 사원 입력받기 ===");
		int count=0;
		while (true) {
			employeesArr[count] = new Employee();
			System.out.print("이름 : ");
			employeesArr[count].setName(sc.next());
			System.out.print("나이 : ");
			employeesArr[count].setAge(sc.nextInt());
			System.out.print("키 : ");
			employeesArr[count].setHeight(sc.nextDouble());
			System.out.print("몸무게 : ");
			employeesArr[count].setWeight(sc.nextDouble());
			System.out.print("급여 : ");
			employeesArr[count].setSalary(sc.nextInt());
			System.out.print("부서 : ");
			employeesArr[count].setDept(sc.next());

			
			System.out.print("계속 추가하시겠습니까? ");
			String rep = sc.next();
			if (rep.equals("y")) count++;
			else break;
			
			
		}
		  
		// 배열에 담긴 사원들의 정보를 모두 출력
		for (Employee employee : employeesArr) {
			if (employee == null) break;
			System.out.println("=== " + employee.getName() + " ===");
			System.out.println("나이 : " + employee.getAge());
			System.out.println("키 : " + employee.getHeight());
			System.out.println("몸무게 : " + employee.getWeight());
			System.out.println("학년 : " + employee.getSalary());
			System.out.println("전공 : " + employee.getDept());
		}
		
	}
}
