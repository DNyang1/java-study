package sec01.exam04.quiz;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Song {
	String name;
	String singer;
	public Song() {
	}
	public Song(String name, String singer) {
		this.name = name;
		this.singer = singer;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, singer);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Song)) {
			return false;
		}
		Song other = (Song) obj;
		return Objects.equals(name, other.name) && Objects.equals(singer, other.singer);
	}
	@Override
	public String toString() {
		return "{제목=" + name + ", 가수=" + singer + "}";
	}
	
}

public class Quiz1 {
//	Quiz
//	노래 정보를 담고 있는 Song 클래스를 설계하고
//	메인 메소드에서 아래와 같은 작업을 수행하세요.
//  1. HashSet 타입의 객체 2개 생성
//  2. 아래 사용 데이터 참고하여 HashSet 요소 3개씩 추가
//  3. HashSet 출력
	
//	Song 클래스
//	1. 필드
//		- name: String
//		- singer: String
//	2. 생성자
//		+ Song()
//		+ Song(name: String, singer: String)
//	3. 메소드
//  	중복되는 요소를 추가했을 때 저장되지 않도록 hashCode()와 equals() 재정의
//		출력 예시에 맞춰 toString() 재정의
	
//	[사용 데이터]
//	HashSet객체   name         singer
//	songSet1     APT.         로제
//	songSet1     Whiplash     에스파
//	songSet1     POWER        G-DRAGON
//	songSet2     Whiplash     에스파
//	songSet2     HAPPY        DAY6
//	songSet2     HAPPY        DAY6
	
//	[출력]
//	[{제목=Whiplash, 가수=에스파}, {제목=APT., 가수=로제}, {제목=POWER, 가수=G-DRAGON}]
//	[{제목=Whiplash, 가수=에스파}, {제목=HAPPY, 가수=DAY6}]
	
	public static void main(String[] args) {

		Set<Song> songSet1 = new HashSet<Song>();
		Set<Song> songSet2 = new HashSet<Song>();
		
		songSet1.add(new Song("APT." , "로제"));
		songSet1.add(new Song("Whiplash" , "에스파"));
		songSet1.add(new Song("POWER" , "G-DRAGON"));
		songSet2.add(new Song("Whiplash" , "에스파"));
		songSet2.add(new Song("HAPPY" , "DAY6"));
		songSet2.add(new Song("HAPPY" , "DAY6"));
		
		System.out.println(songSet1);
		System.out.println(songSet2);
		
	}

}