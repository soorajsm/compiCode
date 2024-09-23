# Write your MySQL query statement below

select a.*
from Cinema a
where a.id%2!=0 and a.description <> 'boring'        # here <> works same as !=
order by rating desc