package Day1;

import java.util.Comparator;

public class StudentComparator implements Comparator<StudentVO> {
	
	@Override
	public int compare(StudentVO o1, StudentVO o2) {
		// TODO Auto-generated method stub
		int result = o2.getLoan_sum() - o1.getLoan_sum();
		return result;
	}
}
