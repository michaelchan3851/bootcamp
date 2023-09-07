use sys;

delete from players;
create table players(
	player_id integer not null unique,
    group_id integer not null
);

insert into players values(20, 2);
insert into players values(30, 1);
insert into players values(40, 3);
insert into players values(45, 1);
insert into players values(50, 2);
insert into players values(65, 1);

delete from matches;
create table matches(
	match_id integer not null unique,
    first_player integer not null,
    second_player integer not null,
    first_score integer not null,
    second_score integer not null
);
insert into matches values(1, 30, 45, 10, 12);
insert into matches values(2, 20, 50, 5, 5 );
insert into matches values(13, 65, 45, 10, 10);
insert into matches values(5, 30, 65, 3, 15);
insert into matches values(42, 45, 65, 8, 4);

select * from players;
select * from matches;


with player_score as(
	select p1.player_id, m.first_player, m.first_score as score
	from players p1, matches m
	where p1.player_id = m.first_player
union 
	select p2.player_id, m.second_player, m.second_score as score
	from players p2, matches m
	where p2.player_id = m.second_player),
sum_score as(
	select player_id, sum(score) as score
	from player_score 
	group by player_id),
final as(
	select p.group_id, p.player_id, s.score
	from players p left join sum_score s
	on p.player_id = s.player_id)
select group_id, player_id as winner_id
	from(SELECT group_id, player_id, score,
	ROW_NUMBER() OVER (PARTITION BY group_id ORDER BY score DESC, player_id ASC) AS row_num
    FROM final) RANK_TABLE
where row_num = 1;




