package 이젠아카데미.model.dto;

public class LessonDto {
	
	// 1. 필드
	
	private int lname;
	private String ltname;
	private	String ltotalday;
	
	// 2. 생성자
	
	public LessonDto() {}

	public LessonDto(int lname, String ltname, String ltotalday) {
		super();
		this.lname = lname;
		this.ltname = ltname;
		this.ltotalday = ltotalday;
	}
	
	// 3. 매소드

	public int getLname() {
		return lname;
	}

	public void setLname(int lname) {
		this.lname = lname;
	}

	public String getLtname() {
		return ltname;
	}

	public void setLtname(String ltname) {
		this.ltname = ltname;
	}

	public String getLtotalday() {
		return ltotalday;
	}

	public void setLtotalday(String ltotalday) {
		this.ltotalday = ltotalday;
	}

	@Override
	public String toString() {
		return "LessonDto [lname=" + lname + ", ltname=" + ltname + ", ltotalday=" + ltotalday + "]";
	}

	
	
	

	
	
	
	
}
