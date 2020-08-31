--not null : null 허용안함
-- unique : 중복 허용 안함. 단, null은 허용
--create table table ex17(
--	num number unique not null;
--	name varchar2(15) not null
--);
-- primary key : unique and not null
-- 단 , oracle 경우 : 한테이블당 하나만 부여 가능.
drop table ex17;

create table ex17(
	num number primary key,
	name varchar2(15) not null
);