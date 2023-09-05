USE ORG;

-- task 1a&b
DROP TABLE city;
CREATE TABLE city(
	city_id INTEGER NOT NULL PRIMARY KEY,
    city_name CHAR(15)
);
INSERT INTO  city VALUES(1,'Vienna');
INSERT INTO  city VALUES(2,'Berlin');
INSERT INTO  city VALUES(3,'Hamburg');
INSERT INTO  city VALUES(4,'London');

CREATE TABLE customer(
	id int primary key,
	customer_name varchar(255),
	city_id int,
	customer_address varchar(255),
	contact_person varchar(128) default null,
	email varchar(128),
	phone varchar(128),
	FOREIGN KEY (city_id) REFERENCES city(city_id)
);
insert into customer values(1,'Drogerie Wien', 1, 'Deckergasse 15A', 'Emil Steinbach', 'emil@drogeriewien.com', '094234234');
insert into customer values(2,'Cosmetics Store', 4, 'Watling Street 347', 'Jeremy Corbyn', 'jeremy@c-store.org', '093923923');
insert into customer values(3,'Kosmetikstudio', 3, 'Rothenbaumchaussee 53', 'Willy Brandt', 'willy@kosmetikstudio.com', '0941562222');
insert into customer values(4,'Neue Kosmetik', 1, 'Karlsplatz 2',NULL, 'info@neuekosmetik.com' , '094109253');
insert into customer values(5,'Bio Kosmetik', 2, 'Motzstraße 23', 'Clara Zetkin', 'clara@biokosmetik.org', '093825825');
insert into customer values(6,'K-Wien', 1, 'Kärntner Straße 204', 'Maria Rauch-Kallat', 'maria@kwien.org', '093427002');
insert into customer values(7,'Natural Cosmetics', 4, 'Clerkenwell Road 14B', 'Glenda Jackson', 'glena.j@natural-cosmetics.com', '093555123');
insert into customer values(8,'Kosmetik Plus', 2, 'Unter den Linden 1', 'Angela Merkel', 'angela@k-plus.com', '094727727');
insert into customer values(9,'New Line Cosmetics', 4, 'Devonshire Street 92', 'Oliver Cromwell', 'oliver@nlc.org', '093202404');

CREATE TABLE product(
	id int primary key,
	sku varchar(32),
	product_name varchar(128),
	product_description text,
	current_price decimal(8,2),
	quantity_in_stock int
);
insert into product values(1, '330120', 'Game Of Thrones-URBAN DECAY', 'Game Of Thrones Eyeshadow Palette', 65.00, 122 );
insert into product values(2, '330121', 'Advanced Night Repair-ESTEE LAUDER', 'Advanced Night Repair Synchronized Recovery Complex II', 98.00, 51 );
insert into product values(3, '330122', 'Rose Deep Hydration-FRESH', 'Rose Deep Hydration Facial Toner', 45.00, 34);
insert into product values(4, '330123', 'Pore-Perfecting Moisturizer-TATCHA', 'Pore-Perfecting Moisturizer & Cleanser Duo', 25.00, 393);
insert into product values(5, '330124', 'Capture Youth-DIOR', 'Capture Youth Serum Collection', 95.00, 74);
insert into product values(6, '330125', 'Slice of Glow-GLOW RECIPE', 'Slice of Glow Set', 45.00, 40);
insert into product values(7, '330126', 'Healthy Skin-KIEHL S SINCE 1851', 'Healthy Skin Squad', 68.00, 154);
insert into product values(8, '330127', 'Power Pair!-IT COSMETICS', 'IT is Your SKincare Power Pair! Best-Selling Moisturizer & Eye Cream Duo', 80.00, 0);
insert into product values(9, '330128', 'Dewy Skin Mist-TATCHA', 'Limited Edition Dewy Skin Mist Mini', 20.00, 281);
insert into product values(10, '330129', 'Silk Pillowcase-SLIP', 'Silk Pillowcase Duo + Scrunchies Kit', 170.00, 0);

create table invoice(
	id int primary key,
	invoice_number varchar(255),
	customer_id int,
	user_account_id int,
	total_price decimal(8,2),
	time_issued varchar default null,
	time_due varchar default null,
	time_paid varchar default null,
	time_canceled varchar default null,
	time_refunded varchar default null,
	foreign key (customer_id) references customer(id)
);
insert into invoice values(1,'in_25181b07ba800c8d2c967fe991807d9', 7, 4, 1436.00,'7/20/2019 3:05:07 PM', '7/27/2019 3:05:07 PM','7/25/2019 9:24:12 AM', null, null);
insert into invoice values(2,'8fba0000fd456b27502b9f81e9d52481', 9, 2, 1000.00,'7/20/2019 3:07:11 PM', '7/27/2019 3:07:11 PM','7/20/2019 3:10:32 PM', null, null);
insert into invoice values(3,'3b6638118246b6bcfd3dfcd9be487599', 3, 2, 360.00,'7/20/2019 3:06:15 PM', '7/27/2019 3:06:15 PM','7/31/2019 9:22:11 PM', null, null);
insert into invoice values(4,'dfe7f0a01a682196cac0120a9adbb550', 5, 2, 1675.00,'7/20/2019 3:06:34 PM', '7/27/2019 3:06:15 PM',null, null, null);
insert into invoice values(5,'2a24cc2ad4440d698878a0a1a71f70fa', 6, 2, 9500.00,'7/20/2019 3:06:42 PM', '7/27/2019 3:06:42 PM', null,'7/22/2019 11:17:02 AM', null);
insert into invoice values(6,'cbd304872ca6257716bcab8fc43204d7', 4, 2, 150.00,'7/20/2019 3:08:15 PM', '7/27/2019 3:08:15 PM','7/27/2019 1:42:45 PM', null, '7/27/2019 2:11:20 PM');

create table invoice_item(
	id int primary key,
	invoice_id int,
	product_id int,
	quantity int,
	price decimal(8,2),
	line_total_price decimal(8,2),
	foreign key (invoice_id) references invoice(id),
	foreign key (product_id) references product(id)
);
insert into invoice_item values(1, 1, 1, 20, 65.00, 1300.00);
insert into invoice_item values(2, 1, 7, 2, 68.00, 136.00);
insert into invoice_item values(3, 1, 5, 10 , 100.00, 1000.00);
insert into invoice_item values(4, 3, 10, 2, 180.00, 360.00);
insert into invoice_item values(5, 4, 1, 5, 65.00, 325.00);
insert into invoice_item values(6, 4, 2, 10, 95.00, 950.00);
insert into invoice_item values(7, 4, 5, 4, 100.00, 400.00);
insert into invoice_item values(8, 5, 10, 100, 95.00, 9500.00);
insert into invoice_item values(9, 6, 4, 6, 25.00, 150.00);

-- task 1c
select 'customer' as type, c.id as customer_id, c.customer_name as customer_name
from customer c
where not exists(
	select *
	from invoice i
	where c.id = i.customer_id
)
union
select 'product' as type, p.id as product_id, p.product_name as product_name
from product p
where not exists(
	select *
	from invoice_item i
	where p.id = i.product_id
);

-- question 2
-- Table Structure
-- DROP TABLE EMPLOYEE;
CREATE TABLE EMPLYEE(
	ID INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
	EMPLOYEE_NAME VARCHAR(30) NOT NULL,
	SALARY NUMERIC(8,2),
	PHONE NUMERIC(15),
	EMAIL VARCHAR(50),
	DEPT_ID INTEGER NOT NULL
);

DELETE FROM EMPLOYEE;
INSERT INTO EMPLOYEE VALUES(1, 'JOHN', 20000, 90234567,'JOHN@GAMIL.COM', 1);
INSERT INTO EMPLOYEE VALUES(2, 'MARY', 10000, 90234561,'MARY@GAMIL.COM', 1);
INSERT INTO EMPLOYEE VALUES(3, 'STEVE', 30000, 90234562,'STEVE@GAMIL.COM', 3);
INSERT INTO EMPLOYEE VALUES(4, 'SUNNY', 40000, 90234563,'SUNNY@GAMIL.COM', 4);

CREATE TABLE DEPARTMENT(
	ID INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
	DEPT_CODE VARCHAR(3) NOT NULL,
	DEPT_NAME VARCHAR(200) NOT NULL
);

DELETE FROM DEPARTMENT;
INSERT INTO DEPARTMENT VALUES (1, 'HR', 'HUMAN RESOURCES');
INSERT INTO DEPARTMENT VALUES (2, '9UP', '9UP DEPARTMENT');
INSERT INTO DEPARTMENT VALUES (3, 'SA', 'SALES DEPARTMENT');
INSERT INTO DEPARTMENT VALUES (4, 'IT', 'INFORMATION TECHNOLOGY DEPARTMENT');





