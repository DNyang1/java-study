package sec03.exam03;

import java.io.File;

// File 클래스
// 파일 및 폴더의 생성과 삭제
// 파일 및 폴더의 정보(이름, 경로, 크기, 최종 수정일 등) 제공
public class FileExample {

	public static void main(String[] args) {
		// 경로 구분자
		// Windows: \(역슬래시) + 호환성과 편의성을 위해 /도 자동으로 \로 변환하여 처리
		// UNIX/Linux/macOS: /(슬래시)
		
		// 자바는 별개로 File, Path 등 경로 관련 클래스 내부적으로 플랫폼별 경로 구분자 처리를 자동으로 해줌
		// 자바는 운영체제에 독립적으로 운영체제에 상관없이 같은 코드가 동작해야 하기 때문에,
		// File, Path 등 경로 관련 클래스는 내부적으로 플랫폼별 경로 구분자 처리를 자동으로 해줌
		
		// 파일 객체 생성
		// 생성자에 상대 경로(프로젝트 루트 기준)
		// 파일 객체를 생성했다고 파일이 생성되는건아님
		// 실제경로에 파일이 없더라도 예외발생x
		File dir = new File("C:/Temp/images");
		File file1 = new File("C:/Temp/file1.txt");
		File file2 = new File("C:/Temp/file2.txt");
		File file3 = new File("C:\\Temp\\file3.txt");
		
		// 해당 경로에 실제 파일이나 폴더가 있는지 검사
		// 존재하지 않으면 생성
		// 폴더 생성
		if (!dir.exists()) dir.mkdirs();

		// 파일 생성
		try {
			if (!file1.exists()) file1.createNewFile();
			if (!file2.exists()) file2.createNewFile();
			if (!file3.exists()) file3.createNewFile();
		} catch (Exception e) { System.out.println(" 파일 생성 중 오류 발생"); }
		
		// 참고: 폴더 생성 2가지 방법 차이점
		// mkdir vs mkdirs
		File dirTest = new File("C:/Temp/test/videos");
//		if (dirTest.exists()) dirTest.mkdir(); // 경로상 마지막 폴더만 만듬, 즉 상위폴더가 없음(test가 없어서) videos도 안만듬
		if (dirTest.exists()) dirTest.mkdirs(); 		

		

		
	}

	
	
	
	
	
	
	
}