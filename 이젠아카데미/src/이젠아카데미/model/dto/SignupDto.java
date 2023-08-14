package 이젠아카데미.model.dto;

public class SignupDto {

	private String jname; //가입한 학생이름
	private String jid;	//가입 학생 아이디
	private String jpw;// 가입학생 비번
	private int sno;//가입 학생 sno (수업등록에서 부여한 번호로 예정)
	
	//1. 빈생성자
		public SignupDto() {}
	//2. 풀생성자
		public SignupDto(String jname, String jid, String jpw, int sno) {
		super();
		this.jname = jname;
		this.jid = jid;
		this.jpw = jpw;
		this.sno = sno;}
	//3. 로그인 ( 학생이 직접 게시물 수정 시 )
		public SignupDto(String jid, String jpw) {
			super();
			this.jid = jid;
			this.jpw = jpw;}
	//4. 회원가입
		public SignupDto(String jname, String jid, String jpw) {
			super();
			this.jname = jname;
			this.jid = jid;
			this.jpw = jpw;}
		
//메소드-------------------------------------------------------------------		
		public String getJname() {
			return jname;
				
		}
		public void setJname(String jname) {
			this.jname = jname;
		}
		public String getJid() {
			return jid;
		}
		public void setJid(String jid) {
			this.jid = jid;
		}
		public String getJpw() {
			return jpw;
		}
		public void setJpw(String jpw) {
			this.jpw = jpw;
		}
		public int getSno() {
			return sno;
		}
		public void setSno(int sno) {
			this.sno = sno;
		}
		@Override
		public String toString() {
			return "SignupDto [jname=" + jname + ", jid=" + jid + ", jpw=" + jpw + ", sno=" + sno + "]";
		}

		
		
		
		
	
	
}
