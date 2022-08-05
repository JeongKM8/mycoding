package Day1;

import java.util.Comparator;

public class BookComparator implements Comparator<BookVO> {

	@Override
	public int compare(BookVO o1, BookVO o2) {
		// TODO Auto-generated method stub
		int result = o2.getLoan_sum() - o1.getLoan_sum();
		
		return result;
	}
}
