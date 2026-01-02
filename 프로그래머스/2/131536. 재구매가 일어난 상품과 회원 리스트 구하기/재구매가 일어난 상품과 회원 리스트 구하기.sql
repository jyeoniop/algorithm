SELECT user_id, product_id
from ONLINE_SALE
group by user_id, product_id
having count(online_sale_id)>=2
order by user_id asc, product_id desc