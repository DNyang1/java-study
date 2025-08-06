package sec01.homework.homework02;

import java.util.Scanner;
import java.util.Set;

public class LotteryMenu {
	// Scanner 객체 생성
	Scanner sc = new Scanner(System.in);
	// LotteryController 객체 생성 
	LotteryController lc = new LotteryController();
	
	public void mainMethod() {
		// 1. 사용자가 메인메뉴 선택
		// 2. 종료 전까지 반복 실행
		// 3. 각 메뉴 번호 입력시 해당 메소드로 이동
		// 4. 잘못된 번호 입력시
		// -> "잘못 입력하였습니다. 다시 입력해주세요." 출력 후 반복
		boolean stop = true;
		while (stop) {
			System.out.println("");
			System.out.println("===== 로또 번호 추첨 =====");
			System.out.println("원하시는 메뉴의 번호를 입력하세요.");
			System.out.println("1. 추첨 대상 추가");
			System.out.println("2. 추첨 대상 삭제");
			System.out.println("3. 추첨 대상 목록 조회");
			System.out.println("4. 당첨 대상 구성");
			System.out.println("5. 정렬된 당첨 대상 확인");
			int select = sc.nextInt();
			sc.nextLine();
			switch (select) {
			case 1:	insertObject(); break;
			case 2:	deleteObject(); break;
			case 3:	searchObject(); break;
			case 4:	break;
			case 5:	break;
			case 6:	break;
			case 9:	break;
			default: System.out.println("다시입력"); break;
			}
		}
	}
	
	// 1. 추첨 대상 추가용 view 메소드
	public void insertObject() {
		System.out.println("===== 1. 추첨 대상 추가 =====");
		// 1. 추가할 추첨 대상 수를 입력 받음
		int addCount = 0;
		while (true) {
			try {
				System.out.print("추가할 추첨 대상 수 :");
				addCount = Integer.parseInt(sc.nextLine()); 
				break;
			} catch (Exception e) {
				System.out.println("입력이 잘못되었습니다.");
			}
		}
		
		
		// 2. 입력 받은 수만큼 추첨자 이름과 핸드폰 번호 입력 받음
		int count = 0;
		while (count < addCount ) {
			System.out.print("이름: ");
			String addName = sc.nextLine();
			System.out.print("번호(- 빼고): ");
			String addPhone = sc.nextLine();
			// 3. 매개변수 생성자를 이용해서 Lottery 객체에 추첨자 정보 저장
			Lottery addLottey = new Lottery(addName, addPhone);
			// 4. Lottery 객체를 lc의 insertObject 메소드로 전달
			// * 중복된 추첨 대상인 경우
			// -> "중복된 대상입니다. 다시 입력하세요." 출력
			// -> 이어서 다시 객체 입력하도록 해줌
			if (!lc.insertObject(addLottey)) {
				System.out.println("중복된 객체입니다");
				continue;
			}
			count++;
		}
		// 5. 모든 입력이 완료되면 "n 명추가 완료되었습니다." 출력
		System.out.println(count + " 명 추가 완료" );
		
 	}
	
	// 2. 추첨 대상 삭제용 view 메소드
	public void deleteObject() {
		System.out.println("===== 1. 추첨 대상 추가 =====");
		// 1. 삭제할 대상의 이름과 휴대폰 번호 입력 받음
		System.out.println("삭제할 대상의 이름과 핸드폰 번호를 입력하세요");
		System.out.print("이름: ");
		String delName = sc.nextLine();
		System.out.print("핸드폰번호(-빼고): ");
		String delPhone = sc.nextLine();
		
		// 2. 매개변수 있는 Lottery 생성자를 이용해 객체 구성
		Lottery delLottery = new Lottery(delName, delPhone); 
		// 3. lc에 있는 deleteObject에 전달
		if (lc.deleteObject(delLottery)) {
			// 4. 전달받은 값 true면 "삭제 완료되었습니다."
			System.out.println("삭제 완료");
		} else
			// 5. false면 "존재하지 않는 대상입니다." 출력
			System.out.println("존재하지 않는 대상");
	}
	// 3. 추첨 대상 목록 조회 view 메소드
	public void searchObject() {
		// lc에 있는 searchObject에게 
		// 당첨 가능성이 있는 대상(추첨 대상) 목록 조회 요청
		Set<Lottery> list = lc.searchObject();
		
		if (list.isEmpty()) {
			System.out.println("추첨대상이 없습니다");
		} else {
			for (Lottery l: list) {
				System.out.println(l);
			}
		}
	}
	
	// 4. 당첨 대상 확인용 view 메소드
	public void winObject() {
		// lc에서 받아온 Set 객체를 표준 출력
		// lc의 winObject 리턴값이 null이면 
		if (lc.winObject()==null) {
			System.out.println("추첨 대상이 4명 넘어야 구성가능");
		} else
			System.out.println(lc.winObject());
		
		// "추첨 대상이 4명이상이어야 당첨 대상을 구성할 수 있습니다."출력
	}
	
	// 5. 정렬된 당첨 대상 확인
	public void sortedWinObject() {
		// lc에서 받아온 Set 객체를 Iterator를 통해 출력
	}
	
	// 6. 당첨 대상 검색용 view 메소드
	public void searchWinner() {
		// 1. 검색할 대상의 이름과 핸드폰 번호 받기
		// 2. Lottery의 매개변수 생성자를 이용
		// 3. 정보 담긴 객체를 lc의 searchWinner에 보내기
		// 4. 받은 결과가 true면 "축하합니다. 당첨 목록에 존재합니다."
		// 5. false면 "다음 기회에!" 출력 
	}
}
