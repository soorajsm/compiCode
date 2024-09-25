# Write your MySQL query statement below

select round(sum( date(a.order_date)=date(a.customer_pref_delivery_date) )*100/ count(order_date),2) as immediate_percentage
from Delivery a
join (select b.customer_id, min(b.order_date) min_date
      from Delivery b
      group by customer_id    
    ) as mytable
on a.customer_id=mytable.customer_id and a.order_date=mytable.min_date