# -- 코드를 입력하세요

# with counts as(SELECT user_id, product_id
# from ONLINE_SALE
# group by user_id, product_id
# having count(online_sale_id)>=2)
# select S.*
# from counts as C join online_sale as S on C.user_id=S.user_id


SELECT user_id, product_id
from ONLINE_SALE
group by user_id, product_id
having count(online_sale_id)>=2
order by user_id asc, product_id desc