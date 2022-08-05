package day1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class ReturnBook {
	
	StudentVO student;
	BookVO book;
	static LibraryDAO dao = new LibraryDAO();
	static DateTimeService dts = new DateTimeService();
	
	public ReturnBook(int stdNo, int bookNo) {
		student = dao.selectStudent(stdNo);
		book = dao.selectBook(bookNo);
		
	// 학생이 대출정지상태인지 확인
		public boolean checkSuspension() {
			boolean flag = false;
			String susDate = student.getStop_date();
			if ((Integer.parseInt(susDate) - Integer.parseInt(dts.getNow())) > 0) {
				flag = true;
			}
			return flag;
		}
		
	// 반납도서 연체여부 확인
		public boolean checkUnreturnBook() {
			boolean flag = false;
			String susDate = student.getStop_date();
			if ((Integer.parseInt(susDate) - Integer.parseInt(dts.getNow())) > 0) {
				flag = true;
			}
			return flag;
		}
		
	// 대출정지일을 새로 추가할 경우
		public boolean newSuspension() {
			boolean flag = false;
			ArrayList<StudentVO> svo = null;
			svo = new ArrayList<StudentVO>();
			// 학생장부 -> 학생번호 추적 -> 대출정지일을 추가하는 updateStudent 필요
			dao.updateStudent(dts.getNow(),student.getStd_no());
			return flag;
		}
	// 학생장부 -> 학번, 대출정지일 -> 대출정지일 추가
	
	// 대출정지일이 갱신될 경우
		public boolean updateSuspension() {
			boolean flag = false;
			ArrayList<StudentVO> svo = null;
			svo = new ArrayList<StudentVO>();
			// 학생장부 -> 학생번호 추적 -> 대출정지일을 추가하는 updateStudent 필요 (기존일에서 추가는 여기서 자체 처리)
			dao.updateStudent(dts.calDate(dts.getNow(), 0),student.getStd_no());
			return flag;
		}
	// 학생장부 -> 학번, 대출정지일 -> 대출정지일 갱신	
	
	// 반납 확인
		public boolean returnConfirm() {
			boolean flag = false;
			ArrayList<LoanVO> list = new ArrayList<LoanVO>();
			
			dao.updateRentalBook("Y", book.getBook_no());
			return flag;
		}
	
			
	// 대출 된 도서인지 여부 확인
		public boolean checkHaveBook() {
			boolean flag = false;
			if (book.getLoan_yn().toUpperCase().equals("N")) {
				flag = true;
			}
			return flag;
		}
	

}
