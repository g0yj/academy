package 이젠아카데미.model.dto;

public class StudentDto {
	
	String sname;
	int sage;
	String saddress;
	
	public StudentDto() {
	}
	
	public StudentDto(String sname, int sage, String saddress) {
		super();
		this.sname = sname;
		this.sage = sage;
		this.saddress = saddress;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSage() {
		return sage;
	}

	public void setSage(int sage) {
		this.sage = sage;
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	@Override
	public String toString() {
		return "StudentDto [sname=" + sname + ", sage=" + sage + ", saddress=" + saddress + "]";
	}

	
	
	
	
}
