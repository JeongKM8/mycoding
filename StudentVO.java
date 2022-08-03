package lesson.jdbc.day4;

public class StudentVO {
	private int stdNo;
	private String email;
	private int kor;
	private int eng;
	private int math;
	private int sci;
	private int hist;
	private int total;
	private String mgrCode;
	private String accCode;
	private String locCode;
	
	public StudentVO() {}
	public StudentVO(int stdNo, String email, int kor, int eng, int math, int sci, int hist, int total, String mc, String ac, String lc) {
		this.stdNo = stdNo;
		this.email = email;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sci = sci;
		this.hist = hist;
		this.total = total;
		this.mgrCode = mc;
		this.accCode = ac;
		this.locCode = lc;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+stdNo+", "+this.getQuiz1Data()+"]";
	}
	
	public int getQuiz1Data() {
		return kor+eng;
	}
	
	public int getStdNo() {
		return stdNo;
	}
	public void setStdNo(int stdNo) {
		this.stdNo = stdNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSci() {
		return sci;
	}
	public void setSci(int sci) {
		this.sci = sci;
	}
	public int getHist() {
		return hist;
	}
	public void setHist(int hist) {
		this.hist = hist;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getMgrCode() {
		return mgrCode;
	}
	public void setMgrCode(String mgrCode) {
		this.mgrCode = mgrCode;
	}
	public String getAccCode() {
		return accCode;
	}
	public void setAccCode(String accCode) {
		this.accCode = accCode;
	}
	public String getLocCode() {
		return locCode;
	}
	public void setLocCode(String locCode) {
		this.locCode = locCode;
	}
	
}
