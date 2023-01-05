# ms sql

## start docker

 ```bash
 docker run --name mishra -e MYSQL_ROOT_PASSWORD=pass123 -dp 3306:3306 --rm mysql
 docker exec -it mishra mysql -uroot -p
 ```

## excute manually

 ```sql
create database mishra;

use mishra;

create table person
(
   id integer not null,
   name varchar(255) not null,
   location varchar(255),
   birth_date timestamp,
   primary key(id)
);

ALTER TABLE `person` 
CHANGE COLUMN `id` `id` INT(11) NOT NULL AUTO_INCREMENT ;

INSERT INTO person (ID, NAME, LOCATION, BIRTH_DATE ) 
VALUES(10001,  'Aruni', 'Delhi',sysdate());
INSERT INTO person (ID, NAME, LOCATION, BIRTH_DATE ) 
VALUES(10002,  'Mishra', 'India',sysdate());
INSERT INTO person (ID, NAME, LOCATION, BIRTH_DATE ) 
VALUES(10003,  'C', 'C',sysdate());


select * from person;

```

## note:
adding data.sql, schema.sql & import.sql to resources folder never worked.