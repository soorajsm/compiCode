# Write your MySQL query statement below

select a.project_id, round(ifnull(avg(b.experience_years),0),2) as average_years
from Project a left join Employee b on a.employee_id = b.employee_id
group by a.project_id