package sec03.exam04.quiz;

// Quiz
// 다른 생성자를 호출하는 this() 를 써서 리펙토링 해보시오

public class Animal {
	// 필드
	String kind;
	int age;

	public Animal() {
		this("사람", 1);
	}

	public Animal(int age) {
		this("사람", age);
	}

	public Animal(String kind) {
		this(kind, 1);
	}

	public Animal(String kind, int age) {
		this.kind = kind;
		this.age = age;
	}

	// 출력 메소드
	public void info() {
		System.out.println(kind + ": " + age + "살");
	}
}