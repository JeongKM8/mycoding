package lesson.jdbc.day4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GisaDAO {
	
	public ArrayList<StudentVO> selectQuiz1Data(String code) throws SQLException {
		ArrayList<StudentVO> list = null;
		String sql = "select * from gisa where local_code = ?";
		list = new ArrayList<StudentVO>();
		// 커넥션 정보
		Connection con = ConnectionManager.getConnection();
		// 통로 확보
		PreparedStatement pstmt = con.prepareStatement(sql);
		// 쿼리 전송
		pstmt.setString(1, code);
		ResultSet rs = pstmt.executeQuery();
		// 쿼리 처리;
		StudentVO vo = null;
		while(rs.next()) {
			vo = new StudentVO(rs.getInt(1),rs.getString(2),rs.getInt(3),
					rs.getInt(4),rs.getInt(5),rs.getInt(6),rs.getInt(7),
					rs.getInt(8),rs.getString(9),rs.getString(10),rs.getString(11));
			list.add(vo);
		}
		ConnectionManager.closeConnection(rs, pstmt, con);
		return list;
	}
	
	public ArrayList<StudentVO> selectQuiz3Data(int score) throws SQLException {
		ArrayList<StudentVO> list = null;
		String sql = "select * from gisa where (eng+math) >=?";
		list = new ArrayList<StudentVO>();
		Connection con = ConnectionManager.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, score);
		ResultSet rs = pstmt.executeQuery();
		StudentVO vo = null;
		while(rs.next()) {
			vo = new StudentVO(rs.getInt(1),rs.getString(2),rs.getInt(3),
					rs.getInt(4),rs.getInt(5),rs.getInt(6),rs.getInt(7),
					rs.getInt(8),rs.getString(9),rs.getString(10),rs.getString(11));
			list.add(vo);
		}
		ConnectionManager.closeConnection(rs, pstmt, con);
		return list;
	}

	public ArrayList<StudentVO> selectQuiz4Data(String code1, String code2) throws SQLException {
		ArrayList<StudentVO> list = null;
		String sql = "select * from gisa where acc_code = ? or acc_code = ?";
		list = new ArrayList<StudentVO>();
		Connection con = ConnectionManager.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, code1);
		pstmt.setString(2, code2);
		ResultSet rs = pstmt.executeQuery();
		StudentVO vo = null;
		while(rs.next()) {
			vo = new StudentVO(rs.getInt(1),rs.getString(2),rs.getInt(3),
					rs.getInt(4),rs.getInt(5),rs.getInt(6),rs.getInt(7),
					rs.getInt(8),rs.getString(9),rs.getString(10),rs.getString(11));
			list.add(vo);
		}
		ConnectionManager.closeConnection(rs, pstmt, con);
		return list;
	}
}
