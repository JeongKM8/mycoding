package lesson.jdbc.day4;

import java.util.Comparator;

public class StudentComparator implements Comparator<StudentVO> {

	@Override
	public int compare(StudentVO o1, StudentVO o2) {
		int result = o2.getQuiz1Data()-o1.getQuiz1Data();
		// TODO Auto-generated method stub
		if (result==0) {
			result = o2.getStdNo() - o1.getStdNo();
		}
		return result;
	}
}
