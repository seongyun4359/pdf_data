drop database if exists madang;
create database madang;
use madang;
create table book
(
bookid int auto_increment not null primary key,
bookname varchar(20) not null,
publisher varchar(10) not null,
price int not null
);

insert into book values(null, '축구의 역사', '굿스포츠', 7000);
insert into book values(null, '축구아는 여자', '나무수', 13000);
insert into book values(null, '축구의 이해', '대한 미디어', 7000);
insert into book values(null, '골프 바이블', '대한 미디어', 35000);
insert into book values(null, '피겨 교본', '굿스포츠', 8000);
insert into book values(null, '역도 단계별 기술', '굿스포츠', 6000);
insert into book values(null, '야구의 추억', '이상 미디어', 20000);
insert into book values(null, '야구를 부탁해', '이상 미디어', 13000);
insert into book values(null, '올림픽 이야기', '삼성당', 7500);
insert into book values(null, 'Olympic Champions', 'Pearson', 13000);


create table customer
( 
custid int auto_increment not null primary key,
name varchar(10) not null,
address varchar(20) not null,
phone char(13)
);

insert into customer values (null, '박지성','영국 맨체스타', '000-5000-0001');
insert into customer values (null, '김연아','대한민국 서울', '000-6000-0001');
insert into customer values (null, '장미란','대한민국 강원도', '000-7000-0001');
insert into customer values (null, '추신수','미국 클리브랜드', '000-8000-0001');
insert into customer values (null, '박세리','대한민국 대전', null);

create table orders
(
orderid int auto_increment not null primary key,
custid int not null,
bookid int not null,
saleprice int not null,
orderdate date not null,
foreign key(custid) references customer(custid),
foreign key(bookid) references book(bookid)
);

insert into orders values(null, 1,1, 6000, '2014-07-01');
insert into orders values(null, 1,3, 21000, '2014-07-03');
insert into orders values(null, 2,5, 8000, '2014-07-03');
insert into orders values(null, 3,6, 6000, '2014-07-04');
insert into orders values(null, 4,7, 20000, '2014-07-05');
insert into orders values(null, 1,2, 12000, '2014-07-07');
insert into orders values(null, 4,8, 13000, '2014-07-07');
insert into orders values(null, 3,10, 12000, '2014-07-08');
insert into orders values(null, 2,10, 7000, '2014-07-09');
insert into orders values(null, 3,8, 13000, '2014-07-10');