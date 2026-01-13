with grp as (select floor(price/10000)*10000 as PRICE_GROUP, product_id
from product )
select g.PRICE_GROUP, count(p.product_id) as products
from grp as g join product as p on g.product_id=p.product_id
group by g.PRICE_GROUP
order by g.PRICE_GROUP asc