package sec01.exam08_2;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
	
	public static void main(String[] args) {
		// HashMap
		// 순서보장안함
		
		// LinkedHashMap
		// 저장순서보장
		
		Map<String, Object> flower = new LinkedHashMap<String, Object>();
		flower.put("name", "튤립");
		flower.put("lang", "고백");
		flower.put("price", 20000);
		flower.put("day", 10);
		System.out.println(flower);
		
		
	}
}
