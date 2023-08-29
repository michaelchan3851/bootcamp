CREATE DATABASE BOOTCAMP_EXERCISE1;

USE BOOTCAMP_EXERCISE1;

DROP TABLE REGIONS;
CREATE TABLE REGIONS(
	REGION_ID INTEGER,
    REGION_NAME VARCHAR(25),
    PRIMARY KEY(REGION_ID)
);
insert into REGIONS values(1,'Europe');
insert into REGIONS values(2,'North America');
insert into REGIONS values(3,'ASIA');


DROP TABLE COUNTRIES;
CREATE TABLE COUNTRIES(
	COUNTRY_ID VARCHAR(2),
    COUNTRY_NAME VARCHAR(40) ,
    REGION_ID INTEGER,
    PRIMARY KEY(COUNTRY_ID),
    FOREIGN KEY(REGION_ID) REFERENCES REGIONS(REGION_ID)
);
insert into COUNTRIES VALUES('DE', 'Germany', 1);
insert into COUNTRIES VALUES('IT', 'Italy', 1);
insert into COUNTRIES VALUES('JP', 'Japan', 3);
insert into COUNTRIES VALUES('US', 'United State', 2);

DROP TABLE LOCATIONS;
CREATE TABLE LOCATIONS(
	LOCATION_ID INTEGER ,
    STREET_ADDRESS VARCHAR(25) ,
    POSTAL_CODE VARCHAR(12),
    CITY VARCHAR(30),
    STATE_PROVINCE VARCHAR(12),
    COUNTRY_ID VARCHAR(2) ,
    PRIMARY KEY(LOCATION_ID),
    FOREIGN KEY(COUNTRY_ID) REFERENCES COUNTRIES(COUNTRY_ID)
);
INSERT INTO LOCATIONS VALUES(1000, '1297 Via Cola di Rie', 989, 'Roma', null, 'IT');
INSERT INTO LOCATIONS VALUES(1100, '93091 Calle della Te', 10934, 'Venice', null, 'IT');
INSERT INTO LOCATIONS VALUES(1200, '2017 Shinjuku-ku', 1689, 'Tokyo', 'Prefectu', 'JP');
INSERT INTO LOCATIONS VALUES(1400, '2014 Jabberwocky Rd', 26192, 'Southlake', 'Texas', 'US');


DROP TABLE DEPARTMENTS;
CREATE TABLE DEPARTMENTS(
	DEPARTMENT_ID INTEGER,
    DEPARTMENT_NAME VARCHAR(30),
    MANAGER_ID INTEGER,
    LOCATION_ID INTEGER ,
    PRIMARY KEY(DEPARTMENT_ID),
    FOREIGN KEY(LOCATION_ID) REFERENCES LOCATIONS(LOCATION_ID)
);
INSERT INTO DEPARTMENTS VALUES(10, 'Administration', 200, 1100);
INSERT INTO DEPARTMENTS VALUES(20, 'Marketing', 201, 1200);
INSERT INTO DEPARTMENTS VALUES(30, 'Purchasing', 202, 1400);

DROP TABLE JOB_HISTORY;
CREATE TABLE JOB_HISTORY(
	EMPLOYEE_ID INTEGER ,
    START_DATE DATE,
    END_DATE date,
    JOB_ID VARCHAR(10),
    DEPARTMENT_ID INTEGER ,
    PRIMARY KEY(EMPLOYEE_ID, START_DATE),
    FOREIGN KEY(DEPARTMENT_ID) REFERENCES DEPARTMENTS(DEPARTMENT_ID),
    FOREIGN KEY(JOB_ID) REFERENCES JOBS(JOB_ID)
);
INSERT INTO JOB_HISTORY VALUES(102,'1993-01-13','1998-07-24','IT_PROG', 20 );
INSERT INTO JOB_HISTORY VALUES(101, '1989-09-21','1993-10-27','MK_REP', 10 );
INSERT INTO JOB_HISTORY VALUES(101, '1993-10-28','1997-03-15','MK_REP', 30 );
INSERT INTO JOB_HISTORY VALUES(100, '1996-02-17','1999-12-19','ST_CLERK', 30 );
INSERT INTO JOB_HISTORY VALUES(103, '1998-03-24','1999-12-31','MK_REP', 20 );

DROP TABLE EMPLOYEES;
CREATE TABLE EMPLOYEES(
	EMPLOYEE_ID INTEGER ,
    FIRST_NAME VARCHAR(20) ,
    LAST_NAME VARCHAR(25) ,
    EMAIL VARCHAR(25) ,
    PHONE_NUMBER VARCHAR(20) ,
    HIRE_DATE DATE ,
    JOB_ID VARCHAR(10) ,
    SALARY NUMERIC(9,2) ,
    COMMISSION_PCT NUMERIC(9,2) ,
    MANAGER_ID INTEGER ,
    DEPARTMENT_ID INTEGER,
    PRIMARY KEY(EMPLOYEE_ID),
    FOREIGN KEY(EMPLOYEE_ID) REFERENCES JOB_HISTORY(EMPLOYEE_ID),
    FOREIGN KEY(JOB_ID) REFERENCES JOBS(JOB_ID),
    FOREIGN KEY(DEPARTMENT_ID) REFERENCES DEPARTMENTS(DEPARTMENT_ID)
);
INSERT INTO EMPLOYEES VALUES(100, 'Steven', 'King', 'SKING', '515-1234567', '1987-06-17', 'ST_CLERK', 24000.00, 0.00, 109, 10);
INSERT INTO EMPLOYEES VALUES(101, 'Neena', 'Kochhar', 'NKOCHHAR', '515-1234568', '1987-06-18', 'MK_REP', 17000.00, 0.00, 103, 20);
INSERT INTO EMPLOYEES VALUES(102, 'LEX', 'De Haan', 'LDEHAAN', '515-1234569', '1987-06-19', 'ST_CLERK', 17000.00, 0.00, 108, 30);
INSERT INTO EMPLOYEES VALUES(103, 'Alexander', 'Hunold', 'AHUNOLD', '590-4234567', '1987-06-20', 'MK_REP', 9000.00, 0.00, 105, 20);

DROP TABLE JOBS;
CREATE TABLE JOBS(
	JOB_ID VARCHAR(10) ,
    JOB_TITLE VARCHAR(35) ,
    MIN_SALARY INTEGER ,
    MAX_SALARY INTEGER,
    PRIMARY KEY(JOB_ID)
);
insert into JOBS (JOB_ID) VALUES('ST_CLERK');
insert into JOBS (JOB_ID) VALUES('MK_REP');
insert into JOBS (JOB_ID) VALUES('IT_PROG');
UPDATE JOBS
SET JOB_TITLE = 'Stock Clerk'
WHERE JOB_ID = 'ST_CLERK';
UPDATE JOBS
SET JOB_TITLE = 'Marketing Representative'
WHERE JOB_ID = 'MK_REP';
UPDATE JOBS
SET JOB_TITLE = 'IT Programmer'
WHERE JOB_ID = 'IT_PROG';

select * from jobs;

DROP TABLE JOB_GRADES;
CREATE TABLE JOB_GRADES(
	GRADE_LEVEL VARCHAR(2) ,
    LOWEST_SAL INTEGER,
    HIGHEST_SAL INTEGER,
    PRIMARY KEY(GRADE_LEVEL)
);

-- Question 2.3
select location_id, street_address, city, state_province, c.country_name 
from LOCATIONS l, COUNTRIES c
where l.COUNTRY_ID = c.COUNTRY_ID;

-- Question 2.4
select first_name, last_name, DEPARTMENT_ID
from EMPLOYEES;

-- Question 2.5
SELECT first_name, last_name, job_id, DEPARTMENT_ID
from EMPLOYEES
WHERE EXISTS(
	SELECT 1
    FROM DEPARTMENTS D
	WHERE EMPLOYEES.DEPARTMENT_ID = D.DEPARTMENT_ID
    AND D.LOCATION_ID = (
		SELECT LOCATION_ID
		FROM LOCATIONS
		WHERE COUNTRY_ID = 'JP'
        )
);

-- Question 2.6
SELECT e.employee_id, 
e.last_name AS employee_last_name,
 m.employee_id AS manager_id, 
 m.last_name AS manager_last_name
FROM employees e, employees m
where e.manager_id = m.employee_id;

-- Question 2.7
with lexdehaan_hire_date as(
	select HIRE_DATE
    from employees
    where first_name = 'Lex'
    and last_name = 'De Haan'
)
select e.first_name, e.last_name, e.HIRE_DATE as hired_after_employee_lexdehaan
from employees e, lexdehaan_hire_date
where e.hire_date > lexdehaan_hire_date.hire_date;

-- Question 2.8
with number_of_employees_of_each_dept as(
	select department_id, count(*) as num_employees
    from employees
    group by department_id
)
select d.department_name, n.num_employees
from DEPARTMENTS d, number_of_employees_of_each_dept n
where d.department_id = n.department_id;

-- Question 2.9
select h.employee_id, j.job_title, datediff(h.end_date, h.start_date) as date_diff
from job_history h
join jobs j on h.job_id = j.job_id
where h.department_id = 30
group by h.employee_id, j.job_title, h.end_date, h.start_date;

-- Question 2.10
select d.department_name,
concat(e.first_name, ' ', e.last_name) as manager_name,
l.city, c.country_name
from employees e, departments d, locations l, countries c
where e.department_id = d.department_id
and d.location_id = l.location_id
and l.country_id = c.country_id;

-- Question 2.11
select avg(salary) as average_salary_of_each_department
from employees 
group by department_id;

-- Question 2.12
CREATE TABLE JOBS(
	JOB_ID VARCHAR(10) ,
    JOB_TITLE VARCHAR(35) ,
    GRADE_LEVEL VARCHAR(2) ,
    PRIMARY KEY(JOB_ID),
    FOREIGN KEY(GRADE_LEVEL) REFERENCES JOB_GRADES(GRADE_LEVEL)
);
CREATE TABLE JOB_GRADES(
	GRADE_LEVEL VARCHAR(2) ,
    MIN_SALARY INTEGER ,
    MAX_SALARY INTEGER,
    PRIMARY KEY(GRADE_LEVEL)
);