package sec01.exam00;

public class AppWithoutJDBC {

	public static void main(String[] args) {
		String dbType = "MySQL";  // 또는 "Oracle"

		if (dbType.equals("MySQL")) {
			MySQLDatabase mysql = new MySQLDatabase();
			mysql.connectToMySQL();                            // DB 연결
			mysql.runMySQLQuery("SELECT * FROM member");       // 쿼리 실행
		} else if (dbType.equals("Oracle")) {
			OracleDatabase oracle = new OracleDatabase();
			oracle.openOracleConnection();                     // DB 연결
			oracle.executeOracleSQL("SELECT * FROM member");   // 쿼리 실행
		}
	}
}

// MySQL 전용 클래스 (메서드명도 다름)
class MySQLDatabase {
	public void connectToMySQL() {
		System.out.println("MySQL에 연결합니다.");
	}
	public void runMySQLQuery(String sql) {
		System.out.println("MySQL 쿼리 실행: " + sql);
	}
}

// Oracle 전용 클래스 (메서드명도 다름)
class OracleDatabase {
	public void openOracleConnection() {
		System.out.println("Oracle에 연결합니다.");
	}
	public void executeOracleSQL(String sql) {
		System.out.println("Oracle 쿼리 실행: " + sql);
	}
}

// ⚠️ 문제점 요약
// - DB마다 클래스와 메서드명이 전부 달라서 공통화가 불가능
// - DB가 바뀌면 전체 코드를 고쳐야 함 (유지보수 어려움)
// - 다형성이 적용되지 않음
