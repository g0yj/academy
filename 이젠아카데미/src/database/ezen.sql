drop database if exists ezenacademy;
create database ezenacademy;
use ezenacademy;
drop table if exists lesson;
create table lesson(
	lno_pk int auto_increment,
    lname varchar(20) not null unique,
    ltname varchar(20) not null,
    ltotalday int not null,
    lopenday date not null,
    primary key(lno_pk)
);
drop table if exists student;
create table student(
	sno_pk int auto_increment,
    sname varchar(10) not null,
    sage int not null,
	saddress varchar(10) not null,
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