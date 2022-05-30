Create table user_info(
ID varchar2(20),
PW varchar2(20),
NAME varchar2(20),
constraint user_info_id_pk primary key(ID)
);

drop table user_info cascade constraints;

insert into USER_INFO values('blueskyfog');

select * 
from ranking
order by SCORE desc;


select * from USER_INFO;

desc user_info;

delete from user_info where id = 'blueskyfog';

create table ranking(
NAME varchar2(10),
ID varchar2(20),
SCORE number(6),
constraint ranking_id_fk foreign key(ID) references user_info(ID)
);

insert into ranking
values('±Ë∞«∫Û', 'smhrd1', '80');

insert into user_info
values('smhrd2', '1234', '±Ë¿±¡÷')

select * from user_info;
select * from ranking;