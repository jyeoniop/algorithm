with getgroup as(SELECT floor(price/10000)*10000 as price_group ,price,  product_id
from product )
select g.price_group as price_group, count(g.product_id) as PRODUCTS
from getgroup as g join product as p on g.product_id=p.product_id
group by g.price_group
order by price_group