package sec01.exam04.quiz;

import java.util.Objects;

public class Student {
	private int studentNo;
	private String name;
	private String major;
	
	
	
	public Student(int studentNo, String name, String major) {
		super();
		this.studentNo = studentNo;
		this.name = name;
		this.major = major;
	}

	@Override
	public String toString() {
		return "[studentNo=" + studentNo + ", name=" + name + ", major=" + major + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj instanceof Student member) 
			return this.studentNo == member.studentNo && this.name.equals(member.name);
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(studentNo,name);
	}

	// equals 오버라이딩 하면 보통 해시도 씀
	
	
	
}