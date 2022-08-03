package lesson.jdbc.day4;

import java.sql.Date;
import java.sql.SQLException;
import java.sql.Timestamp;

public class TestDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDB db = new TestDB();
		db.test();
	}
	
	public void testDate() {
		// sql에서 사용하는 Date에 관련된 객체 만들기
		Date date = new Date(System.currentTimeMillis());//데이터베이스 Date형
		Timestamp ts = new Timestamp(System.currentTimeMillis()); // 데이터베이스 TimeStamp형 호환. 자세한 시간 관리
	}
	
	public void test() {
		QuizSolutionService service = new QuizSolutionService();
		service.solveQuiz1V2();
		service.solveQuiz2();
		service.solveQuiz3();
		service.solveQuiz4();
	}
	
}
