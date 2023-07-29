/*
create database university;

show databases; 

use university;

show tables;

create table login(username varchar(20),password varchar(20));

create table student(name varchar(40),fname varchar(40),rollno varchar(40),dob varchar(40),address varchar(100),phone varchar(40),email varchar(40),x varchar(40),xii varchar(40),adhar varchar(20),course varchar(40),branch varchar(40));

create table teacher(name varchar(40),fname varchar(40),empid varchar(40),dob varchar(40),address varchar(100),phone varchar(40),email varchar(40),x varchar(40),xii varchar(40),adhar varchar(20),education varchar(40),deprtment varchar(40));

insert into login values("riya","0607");

update student 
set email="co21mukeshrathod@gmail.com"
where name="mukesh";

select*from teacher;

select*from fee;

select *from studentleave;

select*from teacherleave;
 

desc teacher;

create table subject(rollno varchar(20),
semester varchar(20),
subject1 varchar(50),
subject2 varchar(50),
subject3 varchar(50),
subject4 varchar(50),
subject5 varchar(50)
);



create table marks(rollno varchar(20),
semester varchar(20),
marks1 varchar(50),
marks2 varchar(50),
marks3 varchar(50),
marks4 varchar(50),
marks5 varchar(50)
);

show tables;

create table teacher(name varchar(40),fname varchar(40),empid varchar(40),dob varchar(40),address varchar(100),phone varchar(40),email varchar(40),x varchar(40),xii varchar(40),adhar varchar(20),education varchar(40),department varchar(40));

create table studentleave(
rollno varchar(20),date varchar(50),duratin varchar(20)
);

create table teacherleave(
EmpId varchar(20),date varchar(50),duratin varchar(20)
);

select*from subject;

select*from fee; 

create table fee(
course varchar(20),
semester1 varchar(20),
semester2 varchar(20),
semester3 varchar(20),
semester4 varchar(20),
semester5 varchar(20),
semester6 varchar(20),
semester7 varchar(20),
semester8 varchar(20)
);



insert into fee values("BTech","48000","43000","46000","47000","44000","47000","48000","49000");

insert into fee values("Bsc","48000","43000","46000","47000","44000","47000","","");

insert into fee values("BCA","45000","34000","46000","47000","44000","47000","48000","49000");

insert into fee values("MTech","65000","60000","46000","47000","","","","");

insert into fee values("MSc","45000","43000","46000","47000","","","","");

insert into fee values("MCA","43000","42000","46000","47000","","","","");

insert into fee values("BCom","43000","42000","46000","47000","45000","43000","","");

insert into fee values("MCom","43000","42000","46000","47000","45000","46000","","");


create table collegefee(
rollno varchar(20),
course varchar(20),
branch varchar(20),
semester varchar(20),
total varchar(20));

*/

