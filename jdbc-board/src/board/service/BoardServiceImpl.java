package board.service;

import java.util.List;

import board.dao.BoardDAO;
import board.dto.Board;

/**
 * 게시판 기능 구현
 * 실제 비즈니스 로직(핵심로직)을 작성
 */
public class BoardServiceImpl implements BoardService{

	private BoardDAO boardDAO = new BoardDAO();
	
	@Override
	public List<Board> list() {
		// DAO(데이터베이스에 접근하는 객체)로 게시글 목록을 요청하고 List<Board> 받아옴
		List<Board> boardList = boardDAO.list(); // 게시글 목록을 가져옴
		
		// 게시글 목록 데이터 반환
		return boardList;
	}

	@Override
	public Board select(int no) {
		// 게시글 번호를 DB로 넘겨주고 게시글 정보 요청
		Board board = boardDAO.select(no);
		
		// 게시글 정보 반환
		return board;
	}

	@Override
	public int insert(Board board) {
		int result = boardDAO.insert(board);
		
		if (result > 0) {
			System.out.println("데이터 등록 성공!");
		} else {
			System.out.println("데이터 등록 실패!");			
		}
		
		return result;
	}

	@Override
	public int update(Board board) {
		int result = boardDAO.update(board);
		
		if (result > 0) {
			System.out.println("데이터 수정 성공!");
		} else {
			System.out.println("데이터 수정 실패!");			
		}
		
		return result;

	}

	@Override
	public int delete(int no) {
		// TODO Auto-generated method stub
		int result = boardDAO.delete(no);
		
		if (result > 0) {
			System.out.println("데이터 삭제 성공!");
		} else {
			System.out.println("데이터 삭제 실패!");			
		}
		
		return result;
	}
	
}
