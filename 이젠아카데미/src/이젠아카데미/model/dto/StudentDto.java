package 이젠아카데미.model.dto;

public class StudentDto {
	
	int sno;
	String sname;
	String saddress;
	String sphone;
	int lno;


// 생성자-------------------------------------------------------------------------	
	// 1.기본생성자
	public StudentDto() {
	}
	// 2.풀생성자
	public StudentDto(int sno, String sname, String saddress, String sphone, int lno) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.saddress = saddress;
		this.sphone = sphone;
		this.lno = lno;
	}

	
	// 3.로그인 생성자
	
	public StudentDto(int sno, String sname) {
		super();
		this.sno = sno;
		this.sname = sname;
	}
	
	
	
	// 4. 학생정보수정을 위한 생성자
	public StudentDto(String sname, String saddress, String sphone, int lno) {
		super();
		this.sname = sname;
		this.saddress = saddress;
		this.sphone = sphone;
		this.lno = lno;
	}


public StudentDto(String sname, String sphone) {
		super();
		this.sname = sname;
		this.sphone = sphone;
	}
	// 메소드-------------------------------------------------------------
	public int getSno() {
		return sno;
	}


	public void setSno(int sno) {
		this.sno = sno;
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

	public int getLno() {
		return lno;
	}

	public void setLno(int lno) {
		this.lno = lno;
	}

	@Override
	public String toString() {
		return "StudentDto [sno=" + sno + ", sname=" + sname + ", saddress=" + saddress + ", sphone=" + sphone + "]";
	}
	

	
	
}
