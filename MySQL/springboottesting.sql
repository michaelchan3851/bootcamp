select * from finnhub_stocks;
select * from finnhub_stocks_prices;

drop table finnhub_stocks;
create table finnhub_stocks (
	id BIGSERIAL PRIMARY KEY,
	country varchar(2) not null,
	company_name varchar(100) not null,
	ipo_date date not null,
	logo varchar(200),
    market_cap numeric(15, 2) not null,
	currency varchar(3) not null

)

drop table finnhub_stocks_prices;
create table finnhub_stocks_prices (
	id BIGSERIAL PRIMARY KEY,
	stock_id INTEGER REFERENCES finnhub_stocks(id),
	datetime TIMESTAMP not null,
	current_price numeric(15, 2) not null,
	day_high numeric(15, 2) not null,
	day_low numeric(15, 2) not null,
	day_open_close numeric(15, 2) not null	
)
	
select s.id, s.country, s.company_name, s.ipo_date, s.logo, s.market_cap, s.currency 
from finnhub_stocks s 
where s.id = 4;










