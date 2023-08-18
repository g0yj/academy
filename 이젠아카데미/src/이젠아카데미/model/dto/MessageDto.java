package 이젠아카데미.model.dto;

/*
 drop table if exists message;
create table message( 
	mno int auto_increment,		#보낸메세지넘버
    eno int
    mcontent text not null, #보낼내용
    sno int not null,  # 보낼사람
	primary key (mno),
    foreign key(sno) references student(sno)
);
 
 
 */

	
	public class MessageDto {
		//필드
		int mon;
		int eno;
		String sname;
		String mcontent;
		int sno;

//생성자----------------------------------------------------------------------		
	//빈생성자
		public MessageDto() {}
		
	//풀생성자
		public MessageDto(int eno, int sno, String mcontent) {
			super();
			this.eno = eno;
			this.sno = sno;
			this.mcontent = mcontent;
		}

		//메세지 전송
		public MessageDto(int eno, String mcontent, int sno) {
			super();
			this.eno = eno;
			this.mcontent = mcontent;
			this.sno = sno;
		}

		public MessageDto(String sname,String mcontent) {
			super();
			this.mcontent = mcontent;
			this.sname = sname;
		}

		//메소드--------------------------------------------------------------
		@Override
		public String toString() {
			return "MessageDto [mon=" + mon + ", eno=" + eno + ", sno=" + sno + ", mcontent=" + mcontent + "]";
		}


		public String getSname() {
			return sname;
		}

		public void setSname(String sname) {
			this.sname = sname;
		}

		public int getMon() {
			return mon;
		}

		public void setMon(int mon) {
			this.mon = mon;
		}

		public int getEno() {
			return eno;
		}

		public void setEno(int eno) {
			this.eno = eno;
		}

		public int getSno() {
			return sno;
		}

		public void setSno(int sno) {
			this.sno = sno;
		}

		public String getMcontent() {
			return mcontent;
		}

		public void setMcontent(String mcontent) {
			this.mcontent = mcontent;
		}
		
		
		
}//class
