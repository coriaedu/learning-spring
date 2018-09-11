/*
create table person
(
	id integer not null,
	name varchar(255) not null,
	location varchar(255),
	birth_date timestamp,
	primary key(id)
);
We can comment this as the table will be created by automatic schema update from hibernate*/

INSERT INTO PERSON
    (ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10001, 'Eduardo', 'San Jose', sysdate());
INSERT INTO PERSON
    (ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10002, 'James', 'San Jose', sysdate());
INSERT INTO PERSON
    (ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10003, 'Pedro', 'Buenos Aires', sysdate());
