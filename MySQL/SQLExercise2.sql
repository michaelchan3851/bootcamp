CREATE DATABASE ORG;
SHOW DATABASES;
USE ORG;
CREATE TABLE WORKER (
  WORKER_ID INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
  FIRST_NAME CHAR(25),
  LAST_NAME CHAR(25),
  SALARY NUMERIC(15),
  JOINING_DATE DATETIME,
  DEPARTMENT CHAR(25)
);

-- inesrt data to worker
INSERT INTO WORKER 
  (FIRST_NAME, LAST_NAME, SALARY, JOINING_DATE, DEPARTMENT) VALUES
    ('Monika', 'Arora', 100000, '21-02-20 09:00:00', 'HR'),
    ('Niharika', 'Verma', 80000, '21-06-11 09:00:00', 'Admin'),
    ('Vishal', 'Singhal', 300000, '21-02-20 09:00:00', 'HR'),
    ('Mohan', 'Sarah', 300000, '12-03-19 09:00:00', 'Admin'),
    ('Amitabh', 'Singh', 500000, '21-02-20 09:00:00', 'Admin'),
    ('Vivek', 'Bhati', 490000, '21-06-11 09:00:00', 'Admin'),
    ('Vipul', 'Diwan', 200000, '21-06-11 09:00:00', 'Account'),
    ('Satish', 'Kumar', 75000, '21-01-20 09:00:00', 'Account'),
    ('Geetika', 'Chauhan', 90000, '21-04-11 09:00:00', 'Admin');
    
-- create table bonus
CREATE TABLE BONUS (
  WORKER_REF_ID INTEGER,
  BONUS_AMOUNT NUMERIC(10),
  BONUS_DATE DATETIME,
  FOREIGN KEY (WORKER_REF_ID) REFERENCES Worker(WORKER_ID)
);

-- Task 1:
INSERT INTO BONUS VALUES (6, 32000 , '21-11-02'),
						 (6,20000, '22-11-02'),
                         (5,21000, '21-11-02'),
						 (9,30000, '21-11-02'),
						 (8,4500, '22-11-02');

-- Task 2:
SELECT MAX(SALARY) 
FROM WORKER
WHERE SALARY < (SELECT MAX(SALARY) FROM WORKER); 

-- Task 3:
WITH HIGHEST_SALARY AS (
	SELECT DEPARTMENT,
    MAX(SALARY) AS MAX_SALARY
    FROM WORKER
    GROUP BY DEPARTMENT
    
)
SELECT CONCAT(W.FIRST_NAME,' ', W.LAST_NAME) AS EMPLOYEES_NAME
FROM WORKER W, HIGHEST_SALARY H
WHERE W.DEPARTMENT = H.DEPARTMENT
AND W.SALARY = H.MAX_SALARY;

-- Task 4:
select salary,
group_concat(concat(FIRST_NAME,' ', LAST_NAME) order by first_name) as employees_with_same_salary
from worker
group by salary having count(1) > 1;


-- Task 5:
SELECT CONCAT(W.FIRST_NAME,' ',W.LAST_NAME) AS EMPLOYEES_NAME
,SUM(W.SALARY + B.BONUS_AMOUNT) AS SALARIES_AND_BONUS_IN_2021
FROM WORKER W , BONUS B
WHERE W.WORKER_ID = B.WORKER_REF_ID
AND YEAR(W.JOINING_DATE) = 2021
GROUP BY W.FIRST_NAME, W.LAST_NAME;

-- Task 6:
DELETE FROM WORKER;
-- It might be due to other constraints or locks, not necessarily the primary key constraint.

-- Task 7:
DROP TABLE WORKER;
-- During the primary key constraint, we can't drop the table worker because make sure the data integrity








