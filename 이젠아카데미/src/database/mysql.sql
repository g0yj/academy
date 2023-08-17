
drop database if exists ezenacademy;
create database ezenacademy;
use ezenacademy;


drop table if exists lesson;
create table lesson(
	lno int auto_increment not null,
    lname varchar(20) not null unique,
    ltname varchar(20) not null,
    ltotalday int not null,  #총수강일
    lopenday date not null,  # 개강일
    primary key(lno)
);
drop table if exists student;
create table student(
	sno int auto_increment not null,
    sname varchar(10) not null,
	saddress varchar(10) not null,
    sphone varchar(13) not null unique,
	primary key(sno),
    lno int,
    foreign key( lno ) references lesson (lno)
);
drop table if exists board;
create table board(
   bno int auto_increment,
    sno int,
    btitle longtext not null,
    bcontent longtext not null,
    bday datetime default now(),
    bview int default 0,
    primary key(bno),
    foreign key( sno) references student (sno) on delete cascade  
);
drop table if exists attendance;
create table attendance( 
	ano int auto_increment, 
    sno int,
    aday datetime default now(),
    primary key(ano),
    foreign key( sno) references student (sno)
);


drop table if exists employee;
create table employee(  #직원
	eno int auto_increment , #직원넘버
	era varchar(10) not null, #직급
    ename varchar(10) not null, #직원이름
    primary key(eno)
  
);

drop table if exists signup;
create table signup( # 강사회원가입
	jno int auto_increment, #회원가입 시 등록되는 강사 no
    jid varchar(20) unique, #회원가입 시 강사 아이디
    jpw varchar(20) ,	#회원가입 시 강사 비밀번호
    eno int default 0,    #강사번호              # 추후 자바에서 유효성 검사.
    primary key(jno),
    foreign key( eno) references employee (eno)
);

drop table if exists message;
create table message( 
	mno int auto_increment,		#보낸메세지넘버
    mcontent text not null, #보낼내용
    sno int not null,  # 보낼사람
	primary key (mno),
    foreign key(sno) references student(sno)
);

/*select * from member m , board b where m.mno = b.mno;
select*from signup j, employee e where j.jno= e.eno;
*/
select * from lesson;
select*from student;

insert into lesson (lname,ltname,ltotalday,lopenday) values('자바','황태웅','120','2023-01-23');
insert  into lesson (lname,ltname,ltotalday,lopenday) values('파이썬','이환희','80','2023-02-24');
insert  into lesson (lname,ltname,ltotalday,lopenday) values('빅데이터','김영태','150','2023-03-13');
insert  into lesson (lname,ltname,ltotalday,lopenday) values('AI','김금배','200','2023-11-23');

insert  into student (sname,saddress,sphone,lno) values('박상빈','시흥','010-1111-1111',1);
insert  into student (sname,saddress,sphone,lno) values('고연진','인천','010-2222-2222',2);
insert  into student (sname,saddress,sphone,lno) values('이진형','부산','010-3333-3333',3);
insert  into student (sname,saddress,sphone,lno) values('황기준','대구','010-4444-4444',2);

insert into board (sno,btitle,bcontent,bday) values(1,'고연진','고연진짱','2023-03-13 19:20');
insert into board (sno,btitle,bcontent,bday) values(1,'박상빈','고연진짱짱짱','2023-04-13 20:20');
insert into board (sno,btitle,bcontent,bday) values(2,'이진형','고연진짱짱','2023-03-13 21:20');
insert into board (sno,btitle,bcontent,bday) values(3,'황기준','고연진짱짱짱짱','2023-05-13 19:40');

insert into attendance(sno,aday )values ('1','2023-11-23 20:20:20');
insert into attendance(sno,aday )values ('2','2023-12-23 19:19:19');
insert into attendance(sno,aday )values ('2','2023-11-25 12:12:12');

insert into  employee(era,ename) value ('원장','고연진');
insert into  employee(era,ename) value ('강사1','황기준');
insert into  employee(era,ename) value ('행정1','이진형');
insert into  employee(era,ename) value ('행정2','김근배');
insert into  employee(era,ename) value ('행정3' ,'정희락');
insert into  employee(era,ename) value ('강사2','김규리');
select *from employee;



insert into signup(jid,jpw,eno) values ('아이디1','1234',1);
insert into signup(jid,jpw,eno) values ('아이디2','1234',2);
insert into signup(jid,jpw,eno) values ('아이디3','1234',3);
insert into signup(jid,jpw,eno) values ('아이디4','1234',4);

insert into message(mcontent,sno) value ('문자내용1',1);
insert into message(mcontent,sno) value ('문자내용2',1);
insert into message(mcontent,sno) value ('문자내용3',3);


select*from student;
select*from lesson;
select*from board;
select*from attendance;
select*from employee;
select*from signup;
select*from message;


