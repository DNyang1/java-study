package sec01.homework.homework02;

import java.util.Objects;

public class Lottery {
	private String name;
	private String phone;
	public Lottery() {
	}
	public Lottery(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Lottery [name=" + name + ", phone=" + phone + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, phone);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Lottery)) {
			return false;
		}
		Lottery other = (Lottery) obj;
		return Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
	}
//	public int compareTo(Lottery l) {
//		return l-l.phone;
//	}
	
	
	
}
