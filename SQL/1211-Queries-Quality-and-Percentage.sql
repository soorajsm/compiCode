# Write your MySQL query statement below


select a.query_name, round(sum( (a.rating/a.position) )/count(a.query_name),2) as quality, round(sum(a.rating<3)*100/count(a.rating),2) as poor_query_percentage
from Queries a where a.query_name is not null
group by a.query_name
