package 이젠아카데미.model.dto;

public class InstructorDto {
	//필드
	int sno;
	int eno;
	String sname;
	String saddress;
	String sphone;
	

	//빈생성자
	public InstructorDto() {}

	// 강사별 학생 정보 받아오기 위한 생성자
	public InstructorDto(int sno, int eno, String sname, String saddress, String sphone) {
		super();
		this.sno = sno;
		this.eno = eno;
		this.sname = sname;
		this.saddress = saddress;
		this.sphone = sphone;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	public String getSphone() {
		return sphone;
	}

	public void setSphone(String sphone) {
		this.sphone = sphone;
	}

	@Override
	public String toString() {
		return "InstructorDto [sno=" + sno + ", eno=" + eno + ", sname=" + sname + ", saddress=" + saddress
				+ ", sphone=" + sphone + "]";
	}

	
	
	
	
}//c
