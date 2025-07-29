package sec01.exam00;

// 인터페이스: 공통된 동작의 "규약"을 정의
public interface Connection {
    void connect();               // DB 연결 메서드
    void execute(String sql);     // SQL 실행 메서드
}
