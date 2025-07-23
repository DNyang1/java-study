package sec03.exam03.quiz;

public class Animal {
	// 필드
	String kind;
	int age;
	
	public Animal() {
	}
	public Animal(String kind) {
		this.age = 1;
		this.kind = kind;

	}
	public Animal(String kind, int age) {
		this.kind = kind;
		this.age = age;
	}	
	public Animal(int age) {
		this.kind = "사람";
		this.age = age;
	}
	
	
	// 출력 메소드
    public void info() {
        System.out.println(kind + ": " + age + "살");
    }
}