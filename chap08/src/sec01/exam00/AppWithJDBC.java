package sec01.exam00;

public class AppWithJDBC {

	public static void main(String[] args) {
		// 어떤 DB를 쓰든 공통 인터페이스로 접근 가능 (다형성)
		Connection conn = getConnection("MySQL");
		conn.connect();                              // DB 연결 (MySQL 또는 Oracle)
		conn.execute("SELECT * FROM member");        // 쿼리 실행
	}
	
	// DB 타입에 따라 인터페이스 구현체 반환
	public static Connection getConnection(String dbType) {
		if (dbType.equals("MySQL")) {
			return new MySQLConnection();    // MySQL 구현체
		} else if (dbType.equals("Oracle")) {
			return new OracleConnection();   // Oracle 구현체
		}
		throw new RuntimeException("지원하지 않는 DB입니다.");
	}
}

// 인터페이스 구현체 - MySQL 연결 방식 정의
class MySQLConnection implements Connection {
	public void connect() {
		System.out.println("MySQL 연결 완료");
	}
	public void execute(String sql) {
		System.out.println("MySQL 쿼리 실행: " + sql);
	}
}

// 인터페이스 구현체 - Oracle 연결 방식 정의
class OracleConnection implements Connection {
	public void connect() {
		System.out.println("Oracle 연결 완료");
	}
	public void execute(String sql) {
		System.out.println("Oracle 쿼리 실행: " + sql);
	}
}

// ✅ 장점 요약
// - Connection 인터페이스 하나로 MySQL, Oracle 모두 처리 가능
// - DB가 바뀌어도 호출 코드 수정 없이 구현체만 교체하면 됨
// - 유지보수성과 확장성이 높음
