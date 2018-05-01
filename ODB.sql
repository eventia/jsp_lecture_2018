create table mvc_board(
   bId number(4) primary key,
   bName varchar2(20),
   bTitle varchar2(100),
   bContent varchar2(300),
   bDate date default sysdate,
   bHit NUMBER(4) default 0,
   bGroup number(4),
   bStep NUMBER(4),
   bIndent NUMBER(4)
   );
create sequence mvc_board_seq;
commit;


