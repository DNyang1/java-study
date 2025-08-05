package sec01.exam05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample {
	
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		// 인스턴스는 다르지만 내부 데이터가 동일한 경우
		// 객체의 hashCode()의 equals()를 기준으로 판단
		set.add(new Member("김재현", 30));
		set.add(new Member("김재현", 30));

		set.remove(new Member("김재현", 30));
		
		System.out.println(set);
		
		// 요소 정렬
		// Member 처럼 사용자 정의 객체끼리 비교할 경우 비교 불가능
		// 정렬 기준으로 어떤 값을 사용할지 별도로 구현해야함
		// => Member 클래스가 Comparable 인터페이스를 구현
		Set<Member> members = new HashSet<Member>();
		members.add(new Member("김재현", 30));
		members.add(new Member("이수진", 25));
		members.add(new Member("박민수", 40));
		
		// Quiz
		// 1. Set -> List
		List<Member> memList = new ArrayList<Member>(members);
		
		// 2. 정렬 (나이 오름차순)
		Collections.sort(memList);
		
		// 3. 출력(향상된 for문)
		for (Member member : memList) {
			System.out.println(member);
		}
		
		// 다시 Set 으로 변환 (순서 유지하려면 LinkedHashSet)
		Set<Member> sortedSet = new LinkedHashSet<Member>(memList);
		for (Member member : sortedSet) {
			System.out.println(member.getName());
		}
		
		// ArrayList 의 요소에서 중복 제거하기
		List<Member> memList2 = new ArrayList<Member>();
		memList2.add(new Member("김재현",30));
		memList2.add(new Member("이수진",25));
		memList2.add(new Member("박민수",40));
		memList2.add(new Member("김재현",30));
		memList2.add(new Member("이수진",25));
		
		// Quiz
		
		Set<Member> memSet = new HashSet<Member>(memList2);

		List<Member> memList3 = new ArrayList<Member>(memSet);
		System.out.println(memList3);
		
		
	}
}
