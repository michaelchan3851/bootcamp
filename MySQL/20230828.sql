select * from course;

with 
	cs001 as (
		select *
        from course
        where course_code = 'cs001'
	),
    cs002 as (
		select *
        from course
        where course_code = 'cs002'
	)
select *
from cs001 c1, cs002 c2;

-- 28 Aug
-- UNION ALL
select * from orders
union all
select * from orders
union all
select 1000, 10000, 2, 4 from dual
;

-- UNION (REMOVE DUPLICATES)
SELECT * FROM ORDERS
UNION
SELECT * FROM ORDERS 
UNION ALL
SELECT * FROM ORDERS ORDER BY ID
;

INSERT INTO ORDERS VALUES(5, 550, 2);
SELECT * FROM ORDERS
;

DROP VIEW VCUSTOMER_ORDERS;
CREATE VIEW VCUSTOMER_ORDERS -- THERE HAVE LIMITATION FOR USER, ORDERS OWNER HAVE TO PROCTECT ORDERS INFORMATION
AS
SELECT C.ID, C.NAME , O.AMOUNT
FROM CUSTOMERS C, ORDERS O
WHERE C.ID = O.CUSTOMER_ID
;

SELECT * FROM VCUSTOMER_ORDERS;








