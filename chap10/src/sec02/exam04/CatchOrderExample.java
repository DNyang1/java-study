package sec02.exam04;

public class CatchOrderExample {
	public static void main(String[] args) {
		// 2가지 예외가 발생 가능
		// 하나의 try catch 문으로 합치기
		
		try {
			String data1 = args[0];
			String data2 = args[1];
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2); // "a20" 같이 문자가 섞이면 실행 예외 발생
			int result = value1 + value2;
			System.out.println(result);
//		} catch (Exception e) {
//			System.out.println(" 실행에 문제가 있다 ");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(" 매개 수가 부족함 ");
		} catch (NumberFormatException e) {
			System.out.println(" 숫자로 변환 안됨 ");
		} catch (Exception e) {
			// 모둔 예와는 얘 안에 들어가기 때문에 마지막에 써주자
			// Exception 타입을 쓰는 경우? 뭐 안나누고 일단 예외면 잡아야할때(가장많이씀)
			System.out.println(" 실행에 문제가 잇다 ");
		} finally {
			System.out.println("다시 실행하쇼");
		}
		
	}
}
