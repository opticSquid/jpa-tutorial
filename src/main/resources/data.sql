create table person
(
id integer not null,
name varchar(255) not null,
location varchar(255),
birthdate timestamp,
primary key(id)
);
INSERT INTO PERSON 
    (ID,NAME,LOCATION, BIRTHDATE) 
VALUES (10001, 'Ranga', 'Hydrabad', CURRENT_TIMESTAMP);
INSERT INTO PERSON 
    (ID,NAME,LOCATION, BIRTHDATE) 
VALUES (10002, 'JAMES', 'NEW YORK', CURRENT_TIMESTAMP);
INSERT INTO PERSON 
    (ID,NAME,LOCATION, BIRTHDATE) 
VALUES (10003, 'PETER', 'AMSTERDAM', CURRENT_TIMESTAMP);