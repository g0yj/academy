drop database if exists ezenacademy;
create database ezenacademy;
use ezenacademy;
drop table if exists lesson;
create table lesson(
	lno int auto_increment not null,
    lname varchar(20) not null unique,
    ltname varchar(20) not null,
    ltotalday int not null,
    lopenday date not null,
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
    bday datetime,
    primary key(bno),
    foreign key( sno) references student (sno)
);
drop table if exists attendance;
create table attendance(
	ano int auto_increment,
    sno int,
    aday datetime,
    primary key(ano),
    foreign key( sno) references student (sno)
);
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

select*from student;
select*from lesson;
select*from board;
select*from attendance;