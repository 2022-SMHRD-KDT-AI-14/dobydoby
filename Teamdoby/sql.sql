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
select * from bonusQuiz;

delete from bonusQuiz where num=3;

create table quizH(
num number(4),
qui varchar2(500),
ans varchar2(50),
constraint quizH_num_pk primary key(num)
);

insert into quizH
values(1, 'πÆ¡¶1', '¥‰1');

insert into quizH
values(2, 'πÆ¡¶2', '¥‰2');

insert into quizH
values(3, 'πÆ¡¶3', '¥‰3');

insert into quizH
values(4, 'πÆ¡¶4', '¥‰4');

insert into quizH
values(5, 'πÆ¡¶5', '¥‰5');

select * from quizH;

select * from ranking;

select * from quizM;

