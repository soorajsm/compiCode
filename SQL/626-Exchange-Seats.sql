# Write your MySQL query statement below

select 
        case 
            when a.id=(select max(id) from Seat) and a.id%2!=0 then a.id
            when a.id%2=0 then a.id-1
            else a.id+1
        end as id, a.student
from Seat a
order by id;
