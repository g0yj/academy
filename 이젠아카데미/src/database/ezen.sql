drop database if exists ezenacademy;
create database ezenacademy;
use ezenacademy;
drop table if exists lesson;
create table lesson(
	lno_pk int auto_increment not null,
    lname varchar(20) not null unique,
    ltname varchar(20) not null,
    ltotalday int not null,
    lopenday date not null,
    primary key(lno_pk)
);
drop table if exists student;
create table student(
	sno_pk int auto_increment not null,
    sname varchar(10) not null,
	saddress varchar(10) not null,
    sphone varchar(13) not null unique,
	primary key(sno_pk),
    lno_fk int,
    foreign key( lno_fk ) references lesson (lno_pk)
);
drop table if exists board;
create table board(
	bno_pk int auto_increment,
    sno_fk int,
    btitle longtext not null,
    bcontent longtext not null,
    bday datetime,
    primary key(bno_pk),
    foreign key( sno_fk ) references student (sno_pk)
);
drop table if exists attendance;
create table attendance(
	ano_pk int auto_increment,
    sno_fk int,
    aday datetime,
    primary key(ano_pk),
    foreign key( sno_fk ) references student (sno_pk)
);
select * from lesson;
select*from student;

insert into lesson (lname,ltname,ltotalday,lopenday) values('자바','황태웅','120','2023-01-23');
insert  into lesson (lname,ltname,ltotalday,lopenday) values('파이썬','이환희','80','2023-02-24');
insert  into lesson (lname,ltname,ltotalday,lopenday) values('빅데이터','김영태','150','2023-03-13');
insert  into lesson (lname,ltname,ltotalday,lopenday) values('AI','김금배','200','2023-11-23');

insert  into student (sname,saddress,sphone,lno_fk) values('박상빈','시흥','010-1111-1111',1);
insert  into student (sname,saddress,sphone,lno_fk) values('고연진','인천','010-2222-2222',2);
insert  into student (sname,saddress,sphone,lno_fk) values('이진형','부산','010-3333-3333',3);
insert  into student (sname,saddress,sphone,lno_fk) values('황기준','대구','010-4444-4444',2);

insert into board (sno_fk,btitle,bcontent,bday) values(1,'고연진','고연진짱','2023-03-13 19:20');
insert into board (sno_fk,btitle,bcontent,bday) values(1,'박상빈','고연진짱짱짱','2023-04-13 20:20');
insert into board (sno_fk,btitle,bcontent,bday) values(2,'이진형','고연진짱짱','2023-03-13 21:20');
insert into board (sno_fk,btitle,bcontent,bday) values(3,'황기준','고연진짱짱짱짱','2023-05-13 19:40');

insert into attendance(sno_fk,aday )values ('1','2023-11-23 20:20:20');
insert into attendance(sno_fk,aday )values ('2','2023-12-23 19:19:19');
insert into attendance(sno_fk,aday )values ('2','2023-11-25 12:12:12');

select*from student;
select*from lesson;
select*from board;
select*from attendance;