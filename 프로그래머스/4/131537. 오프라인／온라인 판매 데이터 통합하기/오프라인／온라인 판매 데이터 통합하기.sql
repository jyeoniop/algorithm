# -- 코드를 입력하세요
with sumt as (SELECT date_format(sales_date, '%Y-%m-%d') as sales_date, product_id, user_id, sales_amount
from ONLINE_SALE 
union all
SELECT date_format(sales_date, '%Y-%m-%d') as sales_date, product_id, null as user_id, sales_amount
from OFFLINE_SALE 
)
select *
from sumt 
where sales_date like '2022-03-%'
order by sales_date asc, product_id asc,user_id asc 


