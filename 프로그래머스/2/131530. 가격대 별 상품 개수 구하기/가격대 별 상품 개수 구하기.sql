-- 코드를 입력하세요
select price as price_group, count(*) as products
from(SELECT product_id, floor((price/10000))*10000 as price
From product
) as product
group by price
order by price_group asc;