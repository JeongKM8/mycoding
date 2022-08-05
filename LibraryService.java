package Day1;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;

public class LibraryService {
	
	LibraryDAO dao;
	
	public void solveQuiz1() {
		try {
			ArrayList<BookVO> list = dao.selectBook();
			Collections.sort(list, new BookComparator());
			for(int i=0;i<5;i++) {
				System.out.println(list.get(i).getLoan_sum());
			}
		} catch (SQLException e) {
			//	TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("1번 문제");
	}
	
	public void solveQuiz2() {
		try {
			ArrayList<StudentVO> list = dao.selectStudent();
			Collections.sort(list, new StudentComparator());
			for(int i=0;i<5;i++) {
				System.out.println(list.get(i).getLoan_sum());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("2번 문제");
	}
	
	public void solveQuiz3() {
//		try {
			ArrayList<LoanVO> list = dao.selectRentalBook();
//			Collections.sort(list, new StudentComparator());
//			int min = Integer.valueOf(list.get(0).getReturn_date())-Integer.valueOf(list.get(0).getLoad_date());
//			for(int i=1;i<list.size();i++) { 
//				if(min>Integer.valueOf(list.get(0).getReturn_date())-Integer.valueOf(list.get(0).getLoad_date())) {
//					min = Integer.valueOf(list.get(0).getReturn_date())-Integer.valueOf(list.get(0).getLoad_date());
//				}
//			}
//			System.out.println(list.get(0).getBook_no());
//		
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("3번 문제");
	}	
//	
//	public void solveQuiz4() {
//		LibraryDAO dao = new LibraryDAO();
//		try {
//			ArrayList<LoanVO> list = dao.selectRentalBook();
//			int min = Integer.valueOf(list.get(0).getReturn_date());
//			for(int i=1;i<list.size();i++) { 
//				if(min>Integer.valueOf(list.get(i).getReturn_date())) {
//					min = Integer.valueOf(list.get(i).getReturn_date());
//				}
//			}
//			System.out.println(list.get(0).getStd_no());
//	
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("4번 문제");
//	}
//	
//	public void solveQuiz5() {
//		LibraryDAO dao = new LibraryDAO();
//		int sumA = 0;
//		int sumB = 0;
//		int sumC = 0;		
//		try {
//			ArrayList<StudentVO> list = dao.selectStudent();
//			for(int i=0;i<list.size();i++) {
//				if (list.get(i).getMajor().equals("A학과")) {
//					sumA += list.get(i).getBorrowBook();
//				} else if (list.get(i).getMajor().equals("B학과")) {
//					sumB += list.get(i).getBorrowBook();
//				} else if (list.get(i).getMajor().equals("C학과")) {
//					sumC += list.get(i).getBorrowBook();
//				}
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("5번 문제");
//	}
//	
//	public void solveQuiz6() {
//		LibraryDAO dao = new LibraryDAO();
//		try {
//			ArrayList<LoanVO> list = dao.selectRentalBook();
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("6번 문제");
	}
}