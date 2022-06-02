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
values('��Ǻ�', 'smhrd1', '80');

insert into user_info
values('smhrd2', '1234', '������')

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
values('1', '���ڿ� Ÿ������, �ڹ��� �⺻Ÿ���� �ƴ� Ŭ���� Ÿ���� �����̶�� �ϴ°�?', 'STRING' );

INSERT into quizL
values ('2', '�����ִ� �ݺ��� �ϳ��� ������ ���������� ����ϴ� ��ɹ��� �����̶� �ϴ°�?(�빮�ڷ� ����)', 'BREAK' );

INSERT into quizL
values ('3', '�ҽ� ������ ��ǻ�Ͱ� ������ �� �ִ� ����� ��ȭ�ϴ� ���� �����̶�� �ϴ°�?(�ѱ۷� ����)','������');

INSERT into quizL
values ('4', 'WHILE���� ����ؼ� ���� �ݺ� ��, ���ǽ����� ���� �ܾ��?(�빮�ڷ� ����)', 'TRUE');

INSERT into quizL
values ('5', '��ü ���� ���α׷��� Ư¡ �� �ϳ���  �ܺο��� �����Ϳ� ���������� ���� �����ϴ°��� �����̶�� �ϴ°�?(�ѱ۷� ����)', 'ĸ��ȭ');

INSERT into quizL
values ('6',  'ArrayList�� ���� �߰��ϱ� ���� �޼ҵ�� �����ΰ�?(�ҹ��ڷ� ����)', 'add' );

INSERT into quizL
values ('7', '�������̽��� �����ϱ� ���� ���� Ű����� �����ΰ�?(�빮�ڷ� ����)', 'INTERFACE');

INSERT into quizL
values ('8', '���α׷����� �����͸� �����ϴ� �����̸�, ���α׷� ���࿡ ���� ���� ���ϴ� ���� �����̶�� �ϴ°�?', '����');

INSERT into quizL
values ('9', 'JAVA�� �ƹ������ �Ҹ���� �ڹ��� â���ڴ� �����ΰ�?(6����, �ѱ۷� ����)', '���ӽ�����');

INSERT into quizL
values ('10',' �ڹ��� �⺻ Ÿ�� �� �� Ÿ���� �����Ͻÿ�(�ҹ��ڷ� ����)', 'boolean' );

INSERT into quizM
values ('1', 'Dead lock�̶�� �Ҹ��� ���� ���� Ʈ������� ������� ���ϰ� ������ ��ٸ��� ���¸� �����̶�� �ϴ°�?', '��������' );

INSERT into quizM
values ('2', '�����͸� �����ؼ� ��� ���� ������ �����̶�� �ϴ°�?(�ѱ۷� ����)', '�����ͺ��̽�' );

INSERT into quizM
values ('3', '���̺��� �����ϴ� ���� �����̶�� �ϴ°�?(�ѱ۷� ����)', '�÷�' );

INSERT into quizM
values ('4', '�ٸ� ���̺��� �÷��� �����ϴ� Ű�� �����̶�� �ϴ°�?', 'foreign key');

INSERT into quizM
values ('5', '���� �����ϴ� �������� �����̶�� �ϴ°�(�빮�ڷ� ����)?', 'WHERE' );

INSERT into quizM
values ('6', '������ �� �ڵ����� ������ False �̸� True�� ��ȯ�ϴ� �����ڴ� �����ΰ�?(�빮�ڷ� ����)', 'NOT');

INSERT into quizM
values ('7', '��� �� �� �����Ͱ� �� ���� �� ���� ���� ������?(�ѱ۷� ����)', '��������' );

INSERT into quizM
values ('8', '�����ȿ� ������ �� �ִ� ���� �������� �����̶� �ϴ°�?(�ѱ۷α���)', '��������' );

INSERT into quizM
values ('9', 'Ʈ������� ������ �Ϸ�Ǿ��ٰ� �ǴܵǴ� �������� �� ���Ḧ �䱸�ϴ� ������ �����̶�� �ϴ°�?(�빮�ڷ� ����)','COMMIT');

INSERT into quizM
values ('10', '������ �����Ͱ� ��ȿ���� �ʰų� �������� �� ���� �����ͷ� �ǵ����� ������ �����̶�� �ϴ°�?(�ѱ۷� ����)', '�ѹ�' );

INSERT into quizH
values ('1', '���� �������� �ʾ��� �� ��� �޼ҵ�� �̰��� ��ӹ޴´� �̰��� �����ΰ�?(�ѱ۷� ����/����)', '������Ʈ �޼ҵ�');

INSERT into quizH
values ('2', '�޼ҵ�� ���� ����� �Ұ����ϴ� �θ� �̿ܿ� ��ӹ��� �� �ִ� �޼ҵ�� �����ΰ�(�ҹ��ڷ� ����)?', 'interface' );

INSERT into quizH
values ('3', 'Java ��¹��� print�޼ҵ带 �����ÿ�.(��ҹ��� ����, ������� ����)', 'System.out.println' );

INSERT into quizH
values ('4', '���� ���ϰ��� �ϴ� target(Ÿ��)�� �� ������ ���ҵ�� ���Ͽ� �ڸ��� ��ȯ(swap)�ϴ� ���� ����� �����̶�� �ϴ°�?(�ѱ۷� ����)', '��������' );

INSERT into quizH
values ('5', '�ڹ� ���α׷� �ȿ��� SQL�� �����ϱ� ���� �����ͺ��̽��� �������ִ� �������α׷� �������̽��� �����ΰ�?','JDBC' );

INSERT into quizH
values ('6', '�ڹ� �����ڵ鿡�� ���� ����޴� IDE�� ����� ���Ͻġ��� �ǹ��ϱ⵵ �ϴ� ���� �����ΰ�?(�ѱ۷� ����)', '��Ŭ����' );

INSERT into quizH
values ('7', '�ڹٴ� ���߻���� �������� �ʴ´�. (�´�/Ʋ���� �� ���ÿ�)', '�´�' );

INSERT into quizH
values ('8', '���� ��ü�� ����Ű�� ���۷����� �����ΰ�?(�빮�ڷ� ����)','THIS' );

INSERT into quizH
values ('9', '��ü�� �����ҋ� ����ϴ� Ű����� �����ΰ�?(�빮�ڷ� ����)','NEW' );

INSERT into quizH
values ('10', '�ڹٿ��� ����� ������ �ϴ� Ű����� �����ΰ�?(�빮�ڷ� ����)', 'EXTENDS' );

INSERT into quizH
values ('11', 'Ŭ���� �Ǵ� �������̽����� ���� ���� �ִ� �͵鳢�� ���� ���� ���� �����̶�� �ϴ°�?(�ѱ۷� ����)','��Ű��' );

INSERT into bonusQuiz
values ('1', '���ӽ� ������ ���� �����ϴ� ���ڱ�� �귣�尡 �����ΰ�?', '����');

INSERT into bonusQuiz
values ('2', '���󿡼� ���� ������ ���б���?(�ѱ۷� ����)', '�ε���' );

INSERT into bonusQuiz
values ('3', '�ݼ����� ����� �ϸ�?(�ѱ۷� ����) ', '�۷ι�' );

INSERT into bonusQuiz
values ('4', '������ ����� ���� ���?(�ѱ۷� ����)', 'Ÿ��Ÿ��' );

INSERT into bonusQuiz
values ('5', '���󿡼� ���� ������ �������?(�ѱ۷� ����)', '��ä�����' );

INSERT into bonusQuiz
values ('6', 'Į�� �����ϸ�?(�ѱ۷� ����)', '������' );

INSERT into bonusQuiz
values ('7', '������ �ڱ�Ұ��ϸ鼭 �ϴ� ����?(�ѱ۷� ����)', '������' );

INSERT into bonusQuiz
values ('8', '������ �Ͼ�� ������?(�ѱ۷� ����)', '����' );

INSERT into bonusQuiz
values ('9', '���Ⱑ ȸ�翡�� ©����?(�ѱ۷� ����)', '����÷�' );

INSERT into bonusQuiz
values ('10', '�Ƹ�尡 ������?(�ѱ۷� ����)', '���̾Ƹ��' );

update quizH
set qui = '�ڹ� ���α׷� �ȿ��� SQL�� �����ϱ� ���� �����ͺ��̽��� �������ִ� �������α׷� �������̽��� �����ΰ�?(�빮�ڷ� ����)'
where qui = '�ڹ� ���α׷� �ȿ��� SQL�� �����ϱ� ���� �����ͺ��̽��� �������ִ� �������α׷� �������̽��� �����ΰ�?'

update quizM
set qui = '�ٸ� ���̺��� �÷��� �����ϴ� Ű�� �����̶�� �ϴ°�?(�ҹ���/���� ����)'
where qui = '�ٸ� ���̺��� �÷��� �����ϴ� Ű�� �����̶�� �ϴ°�?'

update quizM
set qui = 'Dead lock�̶�� �Ҹ��� ���� ���� Ʈ������� ������� ���ϰ� ������ ��ٸ��� ���¸� �����̶�� �ϴ°�?(�ѱ۷� ����)'
where qui = 'Dead lock�̶�� �Ҹ��� ���� ���� Ʈ������� ������� ���ϰ� ������ ��ٸ��� ���¸� �����̶�� �ϴ°�?'

update bonusQuiz
set qui = '���ӽ� ������ ���� �����ϴ� ���ڱ�� �귣�尡 �����ΰ�?(�ѱ۷� ����)'
where qui = '���ӽ� ������ ���� �����ϴ� ���ڱ�� �귣�尡 �����ΰ�?';

update quizH
set qui = 'MVC�� Ǯ ������ �����ÿ�(�ҹ��ڷ� ����/������ �޸���/���� ����)'
where qui = 'Java ��¹��� print�޼ҵ带 �����ÿ�.(��ҹ��� ����, ������� ����)';

update quizH
set qui = 'model,view,controller'
where ans = 'System.out.println';

















select * from ranking;

select * from quizM;

