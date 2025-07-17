package homework;

import java.util.Scanner;

//## 문제
//
//- 보건교사 김철수는 언제나 학생들의 건강만 생각하는 학생 바보에요.
//- 김철수 선생님을 위해서 학생의 키와 몸무게를 입력하면 체질량 지수(BMI)를 출력하는 시스템을 만들어주세요.
//- 체질량 지수를 계산하는 공식은 몸무게(kg) / (키(m) * 키(m)) 입니다.
//2) 출력
//몸무게(kg) : 70.0
//키(m) : 1.80
//BMI 지수 : 21.6
public class Homework01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double weight;
		double height;
		
		System.out.println("BMI 계산 프로그램");
		System.out.print("몸무게를 입력해주세요 (단위 kg)");
		weight = sc.nextDouble();
		System.out.print("키를 입력해주세요 (단위 m)");
		height = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		System.out.println("몸무게(kg):" + weight);
		System.out.printf("키(m): %.2f\n" , height);
		System.out.printf("BMI 지수: %.1f", bmi);
	}
}
