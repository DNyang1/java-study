package homework;

public class Run {
	public static void main(String[] args) {
		ExMethodController exm = new ExMethodController();
		
		exm.printM("아 아 아 아 아ㅏㅏㅏㅏㅏㅏ");
		System.out.println(exm.oneTo100Sum());
		System.out.println(exm.evenOrOdd(7));
		System.out.println(exm.engSeach("도re미pa솔ra시"));
		exm.strLenSeach("하나둘셋넷다섯여섯일곱");
		exm.gooGoo(7);
		
	}
}
