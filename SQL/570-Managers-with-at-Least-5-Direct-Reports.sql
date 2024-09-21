# Write your MySQL query statement below

select a.name 
from Employee a
where a.id in ( select b.managerId 
                from Employee b
                group by b.managerId
                having count(managerId)>=5
                )