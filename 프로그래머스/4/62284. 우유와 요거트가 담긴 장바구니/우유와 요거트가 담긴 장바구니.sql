SELECT cart_id
from CART_PRODUCTS 
where name in ('Milk', 'Yogurt')
group by cart_id
having count(distinct name)=2
order by cart_id asc