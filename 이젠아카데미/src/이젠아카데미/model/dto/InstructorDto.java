package 이젠아카데미.model.dto;

public class InstructorDto {
	//필드
	int eno;  //강사코드
	String era;//직급
	int jno; //로그인한 회원번호

	public InstructorDto() {}

	public InstructorDto(int eno, String era, int jno) {
		super();
		this.eno = eno;
		this.era = era;
		this.jno = jno;
	}

	public InstructorDto(String era, int jno) {
		super();
		this.era = era;
		this.jno = jno;
	}
//메소드--------------------------------------------------------

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEra() {
		return era;
	}

	public void setEra(String era) {
		this.era = era;
	}

	public int getJno() {
		return jno;
	}

	public void setJno(int jno) {
		this.jno = jno;
	}

	@Override
	public String toString() {
		return "InstructorDto [eno=" + eno + ", era=" + era + ", jno=" + jno + "]";
	}
	
	
}//c
