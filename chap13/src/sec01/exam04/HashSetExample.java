package sec01.exam04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

// HashSet은 특정 상황에서만 사용, List 계열보다는 빈도가 낮음
// 중복된 데이터 제거가 필요할때 유용
public class HashSetExample {
	public static void main(String[] args) {
		// Set 의 특징
		// 수학의 집합과 유사
		// 순서 없이 데이터를 저장(저장된 요소들을 순서대로 꺼낼 수 없음) 
		// 만약 저장한 순서대로 꺼내왔다면 우연
		// JVM의 내부 해시 구현에 의해 우연히 정렬된 것 순서 보장X
		// 동일한 요소를 중복해서 저장할 수 없음(저장 자체를 안함)
		// 하나의 null 만 저장 가능
		// 중복 판단 기준: hashCode() 로 버킷의 위치를 찾아 equals 로 비교
		
//		Set<String> set = new HashSet<String>();
		Set<String> set = new HashSet<>();
		
		// 객체 추가
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBatis");
		
		// Set 출력하기
		System.out.println(set);
		
		// 저장된 총 객체 수 얻기
		int size = set.size();
		System.out.println("총 객체수: " + size);
		
		// Iterator(반복자) 로 모든 객체를 하나씩 가져오기
		// 컬랙션의 요소를 하나씩 순회할 수 있도록 도와주는 인터페이스
		// 타입 파라미터는 저장된 객체와 동일하게 작성
		Iterator<String> iterator = set.iterator(); // 반복자 얻기
		while (iterator.hasNext()) {
			String element = (String) iterator.next();
			System.out.println(element);
			
			// remove(): next() 로 변환한 요소를 제거
			if ("Java".equals(element)) {
				iterator.remove();
				// 참고: remove() 는 next() 호출 이후에만 호출 가능, 한번만가능
			}
		}
		System.out.println(set);
		
		// 객체 삭제
		// index 를 가지고 있는 List 와 다르게 index 가 없음
		// 객체의 hashCode()와 equals()를 기준으로 판단
		set.remove("JDBC"); // 1객의 객체 삭제
		set.remove("iBatis"); // 1객의 객체 삭제
		
		System.out.println("총 객체수: " + set.size());
		
		// 향상된 for 문으로 모든 객체를 하나씩 가져오기
		// 인덱스가 없으므로 일반 for문 사용 불가능
		for (String element : set) {
			System.out.println(element);
		}
		
		// 모든객체를 제거하고 비운다
		set.clear();
		if (set.isEmpty()) {
			System.out.println("비어있음");
		}
		
		// HashSet 과 집합
		// 수학의 집합을 효율적으로 처리하기에 적합한 구조
		// 두 집합(HashSet)의 합집합, 교집합, 차집합 연산 가능
		Set<Integer> class1 = new HashSet<Integer>();
		class1.add(1);
		class1.add(2);
		class1.add(3);
		Set<Integer> class2 = new HashSet<Integer>();
		class2.add(2);
		class2.add(3);
		class2.add(4);
		
		// 합집합
		// 두 개의 HashSet을 하나로 합쳐줌
		// 이때 2개의 HashSet에 공통적으로 포함된 데이터는 제거
		class1.addAll(class2);
		System.out.println("합집합: " + class1);
		
		// 교집합
		class1.retainAll(class2);
		System.out.println("교집합: " + class1);
		
		// 교집합
		class1.removeAll(class2);
		System.out.println("차집합: " + class1);
		
		// 이때 객체에 값을 바꿔버리니 알아서 조심할것
		
		// 요소 정렬
		// HashSet 자체는 정렬 기능이 없다
		// 정렬할려면 다른 컬렉션으로 변환해서 알아서하시오
		// List로 만들고 Collection.sort() 로 합시다
		Set<String> fruits = new HashSet<String>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Orange");
		System.out.println(fruits);

		// Set-> List로 변환
		List<String> fruitList = new ArrayList<String>(fruits);
		
		// 정렬
		Collections.sort(fruitList);
		System.out.println(fruitList);
		
		// 필요하면 정렬된 순서를 유지하는 Set 으로 다시 변환
		Set<String> sortedSet = new LinkedHashSet<String>(fruitList);
		System.out.println(sortedSet);
		
		// Set 활용 팁 : ArrayList 의 요소에서 중복 제거하기
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Spring");
		list.add("Java"); // 중복 제거하기
		list.add("JDBC");
		System.out.println(list);
		
		// HashSet을 이용해 중복 제거
		Set<String> javaClass = new HashSet<String>(list);
		System.out.println(javaClass);
		
		// 필요시 다시 리스트로 변환
		List<String> dedupList = new ArrayList<String>(javaClass);
		System.out.println(dedupList);
		
		
	}
}
