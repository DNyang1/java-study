package sec01.exam07;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		// new 연산자로 생성했기 떄문에 서로 다른 객체
		// 내부 데이터가 같을 때 동등 키로 판단하려면 hashcode 랑 equals 재정으해야함 
		map.put(new Student(1, "김재현"), 95);
		map.put(new Student(1, "김재현"), 100);
		
		
		System.out.println(map);
		
	}
	
}
