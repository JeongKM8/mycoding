package Day1;

import java.sql.SQLException;
import java.util.ArrayList;

public class ReturnBook {
	StudentVO student;
	BookVO book;
	LoanVO loan;
	static LibraryDAO dao = new LibraryDAO();
	static DateTimeService dts = new DateTimeService();
	
	public ReturnBook(int stdNo, int bookNo) throws SQLException {
		student = dao.selectStudent(stdNo);
		book = dao.selectBook(bookNo);
	}
		
	// 학생이 대출정지상태인지 확인
		public boolean checkSuspension() {
			boolean flag = false;
			String susDate = student.getStop_date();
			if (susDate.equals("")) {
				
			} else if ((Integer.parseInt(susDate) - Integer.parseInt(dts.getNow())) > 0) {
				flag = true;
			}
			return flag;
		}
		
	// 도서 연체여부 확인
		public boolean checkUnreturnBook() {
			boolean flag = false;
			ArrayList<LoanVO> list = new ArrayList<LoanVO>();
			try {
				list = dao.selectRentalBook(student.getStd_no());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (LoanVO vo : list) {
				if (Integer.parseInt(vo.getExp_return_date()) - Integer.parseInt(dts.getNow()) < 0) {
					flag = true;
					break;
				}
			}
			return flag;
		}
		
	// 대출정지일을 새로 추가할 경우
		public boolean newSuspension() {
			boolean flag = false;
			// 학생장부 -> 학생번호 추적 -> 대출정지일을 추가하는 updateStudent 필요
			if (Integer.parseInt(student.getStop_date())-Integer.parseInt(dts.getNow()) < 0) {
				int rd = Integer.parseInt(loan.getReturn_date());
				int ed = Integer.parseInt(loan.getExp_return_date());
				dao.updateStudent(dts.calDate(dts.getNow(), rd-ed),student.getStd_no());
				flag = true;
			}
			return flag;
		}
	// 학생장부 -> 학번, 대출정지일 -> 대출정지일 추가
	
	// 대출정지일이 갱신될 경우
		public boolean updateSuspension() {
			boolean flag = false;
			ArrayList<StudentVO> svo = null;
			svo = new ArrayList<StudentVO>();
			// 학생장부 -> 학생번호 추적 -> 대출정지일을 추가하는 updateStudent 필요 (기존일에서 추가는 여기서 자체 처리)
			if (Integer.parseInt(student.getStop_date())-Integer.parseInt(dts.getNow()) > 0) {
				int rd = Integer.parseInt(loan.getReturn_date());
				int ed = Integer.parseInt(loan.getExp_return_date());
				dao.updateStudent(dts.calDate(student.getStop_date(), rd-ed),student.getStd_no());
				flag = true;
			}
			return flag;
		}
	// 학생장부 -> 학번, 대출정지일 -> 대출정지일 갱신	
	
	// 반납 확인
		public boolean returnConfirm() throws SQLException {
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
