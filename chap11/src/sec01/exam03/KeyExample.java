package sec01.exam03;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		// Map : 키벨류쌍으로 저장하는 컬렉션
		// Key 가 식별자 벨류에 String 넣는 해쉬맵 생성할거임
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		hashMap.put(new Key(1), "홍길동");
		String value = hashMap.get(new Key(1));
		System.out.println(value);
		
		
		// 스트링 친구들은 재정의 되어있어서 같게나옴
		String str1 = "김재현";
		String str2 = "김재현";
		String str3 = new String("김재현");
		String str4 = new String("김재현");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		// 재정의 안된값
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}
}
