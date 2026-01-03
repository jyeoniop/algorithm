-- 코드를 입력하세요
SELECT p.product_code, p.price*sum(o.SALES_AMOUNT) as sales
from PRODUCT as p join OFFLINE_SALE as o on p.product_id= o.product_id
group by o.product_id
order by sales desc, p.product_code asc