package day1;

import java.util.Scanner;

public class BusinessLogic {

	public void borrowBook(String student, String book) {
		BorrowBook bb = new BorrowBook(student, book);
		boolean borrowable = false;

		borrowable = bb.checkSuspention();
		if (!borrowable) {
			System.out.println("대출정지된 학생입니다.");
			bb.borrowCancell();
		}
		borrowable = bb.checkUnreturnBook();
		if (!borrowable) {
			System.out.println("미반납도서 중 연체도서가 있습니다.");
			bb.borrowCancell();
		}
		borrowable = bb.checkBrrowable();
		if (!borrowable) {
			System.out.println("도서대여는 5권까지 가능합니다.");
			bb.borrowCancell();
		}
		borrowable = bb.checkHaveBook();
		if (borrowable) {
			System.out.println("도서대여가 완료되었습니다.");
			bb.borrowConfirm();
		} else {
			System.out.println("해당 도서는 모두 대여중 입니다. 예약하시겠습니까?  >> Y/N");
			Scanner scan = new Scanner(System.in);
			String choice = scan.nextLine();
			scan.close();
			
			if (choice.equals("Y")) {
				Boolean reservationable = false;
				ReservationBook rb = new ReservationBook(student, book);
				rb.checkReservationableStu();
				if (!reservationable) {
					System.out.println("도서예약은 3권까지 가능합니다.");
					rb.reservationCancel();
				}
				rb.checkReservationableBook();
				if (!reservationable) {
					System.out.println("해당 도서의 예약인원은 2명까지 가능합니다.");
					rb.reservationCancel();
				}
				if (reservationable) {
					System.out.println("도서예약이 완료되었습니다.");
					rb.reservationConfirm();
				}

			} else if (choice.equals("N")) {
				System.out.println("도서 대여 및 예약이 취소되었습니다.");
				bb.borrowCancell();
			}
		}
	}
	
	
	public void returnBook(int stdNo, int bookNo) {
		ReturnBook rb = new ReturnBook(stdNo, bookNo);
		boolean unborrowable = rb.checkUnreturnBook();
		boolean returnable = rb.checkHaveBook();
		
		if (!unborrowable) {
			if (returnable) {
				System.out.println("도서반납이 완료되었습니다.");
				rb.returnConfirm();
			}
		} else {
			unborrowable = rb.checkSuspension();
			if (unborrowable) {
				System.out.println("대출정지일자가 갱신되었습니다.");
				rb.updateSuspension();
			} else {
				System.out.println("대출정지일자가 추가되었습니다.");
				rb.newSuspension();
			}
		}

	}
}
