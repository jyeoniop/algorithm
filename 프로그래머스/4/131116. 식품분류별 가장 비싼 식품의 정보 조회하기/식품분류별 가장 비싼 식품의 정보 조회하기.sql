-- 코드를 입력하세요
with maxpr as (SELECT category, product_id,  max(price) as mprice
from FOOD_PRODUCT 
where category in ('과자','국', '김치', '식용유' )
group by category)
select f.category, f.price as max_price, f.product_name
from maxpr as m join food_product as f on m.category=f.category and m.mprice = f.price
order by max_price desc