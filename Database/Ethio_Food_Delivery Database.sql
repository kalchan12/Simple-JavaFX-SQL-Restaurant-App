
create database ethiofooddelivery;
use ethiofooddelivery;
create table Registration(
Frist_Name varchar(44) not null ,
Last_Name varchar(44)not null,
Username varchar(44)not null,
Passwords varchar(44)not null,
Email varchar(44)not null,
Phone_Number varchar(15)not null,
primary key(Username)
);

create table Paymentinfo(
Phone_Number varchar(22) not null ,
Email varchar(44)not null,
Full_Name varchar(44)not null
);
select * from registration;
select * from Paymentinfo;

