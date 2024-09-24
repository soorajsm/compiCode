# Write your MySQL query statement below

select concat(year(a.trans_date),'-',LPAD(MONTH(a.trans_date), 2, '0')) as month, a.country, count(a.id) as trans_count, sum(a.state='approved') as approved_count,sum(a.amount) as trans_total_amount, sum(if(a.state='approved',a.amount,0)) as approved_total_amount 
from Transactions a
group by a.country,month