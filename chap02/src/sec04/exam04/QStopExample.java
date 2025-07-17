package sec04.exam04;


public class QStopExample {
	
	public static void main(String[] args) throws Exception {
		
		int keyCode;
		String tel1="010", tel2="123", tel3="4567";
		System.out.printf("전화: %1$s-%2$s-%3$s", tel1, tel2, tel3);
		
		while (true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			
			if (keyCode == 113){
				break;
			}
		}
	}

}
