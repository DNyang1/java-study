package sec01.exam10;

public class ResourcePathExample {
	
	public static void main(String[] args) {
		Class c1 = Car.class;
		
		// Class 객체는 해당 클래스의 파일 정보를 가지고있음
		// 이걸로 다른 리소스 파일의 정보를 얻을수있음
		String photo1Path = c1.getResource("photo1.jpg").getPath();
		System.out.println(photo1Path);
		
		String photo2Path = c1.getResource("images/photo2.jpg").getPath();
		System.out.println(photo2Path);
		
		
	}
}
