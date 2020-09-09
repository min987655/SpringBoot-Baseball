# MySQL 쿼리문

```use 생성
create user 'baseball'@'%' identified by 'bitc5600';
GRANT ALL PRIVILEGES ON *.* TO 'baseball'@'%';
create database baseball;
use baseball;
```

```테이블 생성
CREATE TABLE stadium(
   id int auto_increment primary key,
	stadiumName varchar(100) unique not null
) engine=InnoDB default charset=utf8;

CREATE TABLE team(
   id int auto_increment primary key,
   stadiumId int,
    teamName varchar(100) not null,
    foreign key (stadiumId) references stadium (id) on delete set null
) engine=InnoDB default charset=utf8;

CREATE TABLE player(
   id int auto_increment primary key,
    teamId int,
    playerName varchar(100) not null,
    foreign key (teamId) references team (id) on delete set null
) engine=InnoDB default charset=utf8;

CREATE TABLE expulsionPlayer(
   id int auto_increment primary key,
    playerId int,
    reason varchar(300) not null,
    createDate timestamp,
    foreign key (playerId) references player (id) on delete set null
) engine=InnoDB default charset=utf8;
```
