Create table user_info(
ID varchar2(20),
PW varchar2(20),
NAME varchar2(10),
constraint user_info_id_pk primary key(ID)
);

CREATE TABLE quizL(
num VARCHAR2(4), 
qui VARCHAR2(500) NOT NULL, 
ans VARCHAR2(50) NOT NULL,
CONSTRAINT quizL_num_pk PRIMARY KEY(num),
CONSTRAINT quizL_qui_uk UNIQUE(qui),
CONSTRAINT quizL_ans_uk UNIQUE(ans)
);

<<<<<<< HEAD
CREATE TABLE quizM(
num VARCHAR2(4), 
qui VARCHAR2(500) NOT NULL, 
ans VARCHAR2(50) NOT NULL,
CONSTRAINT quizM_num_pk PRIMARY KEY(num),
CONSTRAINT quizM_qui_uk UNIQUE(qui),
CONSTRAINT quizM_ans_uk UNIQUE(ans)
=======
insert into ranking
values('김건빈', 'smhrd1', '80');

insert into user_info
values('smhrd2', '1234', '김윤주')

select * from user_info;
select * from ranking;
select * from bonusQuiz;

delete from bonusQuiz where num=3;

create table quizH(
num number(4),
qui varchar2(500),
ans varchar2(50),
constraint quizH_num_pk primary key(num)
>>>>>>> branch 'master' of https://github.com/2022-SMHRD-KDT-AI-14/dobydoby.git
);


CREATE TABLE quizH(
num VARCHAR2(4), 
qui VARCHAR2(500) NOT NULL, 
ans VARCHAR2(50) NOT NULL,
CONSTRAINT quizH_num_pk PRIMARY KEY(num),
CONSTRAINT quizH_qui_uk UNIQUE(qui),
CONSTRAINT quizH_ans_uk UNIQUE(ans)
);

CREATE TABLE ranking(
NAME VARCHAR2(10) NOT NULL, 
ID VARCHAR2(20) NOT NULL, 
SCORE VARCHAR2(6) NOT NULL,
CONSTRAINT ranking_ID_fk FOREIGN KEY(ID) REFERENCES user_info(ID)
);

INSERT into quizL
values('1', '문자열 타입으로, 자바의 기본타입이 아닌 클래스 타입을 무엇이라고 하는가?', 'STRING' );

INSERT into quizL
values ('2', '속해있는 반복문 하나를 완전히 빠져나갈때 사용하는 명령문은 무엇이라 하는가?(대문자로 기입)', 'BREAK' );

INSERT into quizL
values ('3', '소스 파일을 컴퓨터가 이해할 수 있는 기계어로 변화하는 것을 무엇이라고 하는가?(한글로 기입)','컴파일');

INSERT into quizL
values ('4', 'WHILE문을 사용해서 무한 반복 시, 조건식으로 들어가는 단어는?(대문자로 기입)', 'TRUE');

INSERT into quizL
values ('5', '객체 지향 프로그램의 특징 중 하나로  외부에서 데이터에 직접적으로 접근 방지하는것을 무엇이라고 하는가?(한글로 기입)', '캡슐화');

INSERT into quizL
values ('6',  'ArrayList의 값을 추가하기 위한 메소드는 무엇인가?(소문자로 기입)', 'add' );

INSERT into quizL
values ('7', '인터페이스를 정의하기 위해 쓰는 키워드는 무엇인가?(대문자로 기입)', 'INTERFACE');

INSERT into quizL
values ('8', '프로그램에서 데이터를 저장하는 공간이며, 프로그램 실행에 따라 값이 변하는 것을 무엇이라고 하는가?', '변수');

INSERT into quizL
values ('9', 'JAVA의 아버지라고도 불리우는 자바의 창시자는 누구인가?(6글자, 한글로 기입)', '제임스고슬링');

INSERT into quizL
values ('10',' 자바의 기본 타입 중 논리 타입을 서술하시오(소문자로 기입)', 'boolean' );

INSERT into quizM
values ('1', 'Dead lock이라고도 불리는 여러 개의 트랜잭션이 실행되지 못하고 무한정 기다리는 상태를 무엇이라고 하는가?', '교착상태' );

INSERT into quizM
values ('2', '데이터를 가공해서 모아 놓은 집합을 무엇이라고 하는가?(한글로 기입)', '데이터베이스' );

INSERT into quizM
values ('3', '테이블을 구성하는 열을 무엇이라고 하는가?(한글로 기입)', '컬럼' );

INSERT into quizM
values ('4', '다른 테이블의 컬럼을 참조하는 키를 무엇이라고 하는가?', 'foreign key');

INSERT into quizM
values ('5', '행을 제한하는 조건절을 무엇이라고 하는가(대문자로 기입)?', 'WHERE' );

INSERT into quizM
values ('6', '연산자 중 뒤따르는 조건이 False 이면 True를 반환하는 연산자는 무엇인가?(대문자로 기입)', 'NOT');

INSERT into quizM
values ('7', '어느 한 쪽 데이터가 더 많을 때 쓰는 조인 유형은?(한글로 기입)', '포괄조인' );

INSERT into quizM
values ('8', '쿼리안에 쿼리가 들어가 있는 이중 쿼리문을 무엇이라 하는가?(한글로기입)', '서브쿼리' );

INSERT into quizM
values ('9', '트랜잭션의 적용이 완료되었다고 판단되는 시점에서 그 종료를 요구하는 동작을 무엇이라고 하는가?(대문자로 기입)','COMMIT');

INSERT into quizM
values ('10', '현재의 데이터가 유효하지 않거나 망가졌을 때 기존 데이터로 되돌리는 행위를 무엇이라고 하는가?(한글로 기입)', '롤백' );

INSERT into quizH
values ('1', '따로 설정하지 않았을 때 모든 메소드는 이것을 상속받는다 이것이 무엇인가?(한글로 기입/띄어쓰기)', '오브젝트 메소드');

INSERT into quizH
values ('2', '메소드는 다중 상속이 불가능하다 부모 이외에 상속받을 수 있는 메소드는 무엇인가(소문자로 기입)?', 'interface' );

INSERT into quizH
values ('3', 'Java 출력문인 print메소드를 적으시오.(대소문자 구별, 개행까지 기입)', 'System.out.println' );

INSERT into quizH
values ('4', '현재 비교하고자 하는 target(타겟)과 그 이전의 원소들과 비교하여 자리를 교환(swap)하는 정렬 방법을 무엇이라고 하는가?(한글로 기입)', '삽입정렬' );

INSERT into quizH
values ('5', '자바 프로그램 안에서 SQL을 실행하기 위해 데이터베이스를 연결해주는 응용프로그램 인터페이스는 무엇인가?','JDBC' );

INSERT into quizH
values ('6', '자바 개발자들에게 가장 사랑받는 IDE로 영어로 ‘일식’을 의미하기도 하는 것은 무엇인가?(한글로 기입)', '이클립스' );

INSERT into quizH
values ('7', '자바는 다중상속을 지원하지 않는다. (맞다/틀리다 중 고르시오)', '맞다' );

INSERT into quizH
values ('8', '현재 객체를 가리키는 레퍼런스는 무엇인가?(대문자로 기입)','THIS' );

INSERT into quizH
values ('9', '객체를 생성할떄 사용하는 키워드는 무엇인가?(대문자로 기입)','NEW' );

INSERT into quizH
values ('10', '자바에서 상속의 선언을 하는 키워드는 무엇인가?(대문자로 기입)', 'EXTENDS' );

INSERT into quizH
values ('11', '클래스 또는 인터페이스들을 서로 관련 있는 것들끼리 묶어 놓은 것을 무엇이라고 하는가?(한글로 기입)','패키지' );

INSERT into bonusQuiz
values ('1', '제임스 고슬링이 가장 좋아하는 전자기기 브랜드가 무엇인가?', '애플');

INSERT into bonusQuiz
values ('2', '세상에서 가장 지루한 중학교는?(한글로 기입)', '로딩중' );

INSERT into bonusQuiz
values ('3', '반성문을 영어로 하면?(한글로 기입) ', '글로벌' );

INSERT into bonusQuiz
values ('4', '논리적인 사람이 총을 쏘면?(한글로 기입)', '타당타당' );

INSERT into bonusQuiz
values ('5', '세상에서 가장 잔인한 비빔밥은?(한글로 기입)', '산채비빔밥' );

INSERT into bonusQuiz
values ('6', '칼이 정색하면?(한글로 기입)', '검정색' );

INSERT into bonusQuiz
values ('7', '포도가 자기소개하면서 하는 말은?(한글로 기입)', '포도당' );

INSERT into bonusQuiz
values ('8', '여름에 일어나는 전쟁은?(한글로 기입)', '더워' );

INSERT into bonusQuiz
values ('9', '딸기가 회사에서 짤리면?(한글로 기입)', '딸기시럽' );

INSERT into bonusQuiz
values ('10', '아몬드가 죽으면?(한글로 기입)', '다이아몬드' );

update quizH
set qui = '자바 프로그램 안에서 SQL을 실행하기 위해 데이터베이스를 연결해주는 응용프로그램 인터페이스는 무엇인가?(대문자로 기입)'
where qui = '자바 프로그램 안에서 SQL을 실행하기 위해 데이터베이스를 연결해주는 응용프로그램 인터페이스는 무엇인가?'

update quizM
set qui = '다른 테이블의 컬럼을 참조하는 키를 무엇이라고 하는가?(소문자/띄어쓰기 기입)'
where qui = '다른 테이블의 컬럼을 참조하는 키를 무엇이라고 하는가?'

update quizM
set qui = 'Dead lock이라고도 불리는 여러 개의 트랜잭션이 실행되지 못하고 무한정 기다리는 상태를 무엇이라고 하는가?(한글로 기입)'
where qui = 'Dead lock이라고도 불리는 여러 개의 트랜잭션이 실행되지 못하고 무한정 기다리는 상태를 무엇이라고 하는가?'

update bonusQuiz
set qui = '제임스 고슬링이 가장 좋아하는 전자기기 브랜드가 무엇인가?(한글로 기입)'
where qui = '제임스 고슬링이 가장 좋아하는 전자기기 브랜드가 무엇인가?';

update quizH
set qui = 'MVC의 풀 네임을 적으시오(소문자로 기입/구분은 콤마로/띄어쓰기 없음)'
where qui = 'Java 출력문인 print메소드를 적으시오.(대소문자 구별, 개행까지 기입)';

update quizH
set qui = 'model,view,controller'
where ans = 'System.out.println';

















select * from ranking;

select * from quizM;

