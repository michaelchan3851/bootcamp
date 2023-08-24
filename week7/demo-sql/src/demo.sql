use sys;

show databases;

CREATE TABLE TEACHER (
    ID INTEGER NOT NULL, -- AUTO_INCREMENT
    NAME VARCHAR(20) NOT NULL,
    AGE NUMERIC(3) NOT NULL,-- NUMERIC(3) means INTEGER
    NATIONALITY VARCHAR(2) NOT NULL, -- HK, CN, US, UK
    MEMBERSHIP VARCHAR(1) NOT NULL -- S, G
);	
-- Select Data from Table, * means all columns
select id, name, age from TEACHER;
-- Insert records;
-- All column alias
insert into teacher (id, name, age, nationality, membership)
   values(1, 'John Lau', 23, 'HK', 'G');
insert into teacher values(2, 'Mary Lau', 27, 'CN', 'G');   
--
CREATE TABLE STAFF (
	ID INTEGER NOT NULL,
    NAME VARCHAR(20) NOT NULL,
    SALARY NUMERIC(10, 2) -- Nullable, 8 digits goes to Integer, 2 belongs
);
-- All column alias-- Delete
Delete from staff;
insert into staff (id, name, salary)
    values(1, 'John Lau', 10010000.23);
insert into staff (name, id, salary)
    values('Eric Cheung', 4, 10010000.23);
insert into staff values (2, 'Mary Lau', null); -- best version, make sure every column was input
insert into staff (id,name) values (3, 'Peter Chu');
insert into staff (id,name,salary) values (5, 'John Lau', 20000.00);
-- Update 
update staff set salary = salary + 1000;
-- select data by criteria
select * from staff where id = 1;
select * from staff where name = 'John Lau' && salary < 50000;
select id from staff where name = 'John Lau' && salary < 50000;
select id from staff where name = 'John Lau' and salary < 50000;

select * from staff where name = 'John Lau' || name = 'Mary Lau';
select * from staff where name = 'John Lau' or name = 'Mary Lau';
select * from staff where name in ('John Lau', 'Mary Lau'); -- OR

select * from teacher;
select * from staff;

select * from staff where salary is null;
select * from staff order by salary;
select * from staff order by salary desc;

SELECT * FROM staff WHERE name LIKE 'J%';
SELECT * FROM staff WHERE name LIKE '_ohn';
SELECT * FROM staff WHERE substring(name, 4, 1) = 'o';
--
select id, name as fullname, salary from staff; -- temporay show table

-- Updated by criteria
update staff set salary = salary + 1000 where id = 4;

select * from staff; update staff set salary = salary + 1000 , name = 'Mary Chan' where name = 'Mary Lau';
update staff set name = 'Mary Chan' where name = 'Mary Lau';

select * from staff;
update staff 
set salary = salary + 1000 ,
name = 'Mary Chan'
where name = 'Mary Lau'
;

-- Delete by criteria
delete from staff where id = 5;
delete from staff where id in (1,2);

-- Order by (sorting)
insert into staff values (10, 'ABC', 100000); 
insert into staff values (11, 'DEF', 34567); 
insert into staff values (12, 'IJK', 2000); 
select * from staff order by salary; -- defalut ascending order
select * from staff order by salary asc; -- same as the above
select * from staff order by salary desc; -- descending order
insert into staff values (10, 'BCD', 100000); 
select * from staff order by salary asc , name desc; -- sort salary asc first, then name desc



