with amnt as(SELECT product_id, sum(amount) as amount
from FOOD_ORDER 
where date_format(PRODUCE_DATE, '%Y-%m')='2022-05'
group by product_id)
select a.product_id,p.product_name, a.amount*p.price as TOTAL_SALES
from amnt as a join FOOD_PRODUCT  as p on a.product_id=p.product_id
order by TOTAL_SALES desc, a.product_id asc