# Write your MySQL query statement below

select a.contest_id, round(count(a.contest_id)*100/(select distinct count( user_id ) from Users),2) as percentage
from Register a
group by a.contest_id
order by percentage desc, a.contest_id asc