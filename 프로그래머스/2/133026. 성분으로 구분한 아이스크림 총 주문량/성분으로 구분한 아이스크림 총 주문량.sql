-- 코드를 입력하세요
SELECT i.ingredient_type, sum(f.total_order) as TOTAL_ORDER
from FIRST_HALF as f join ICECREAM_INFO as i on f.flavor=i.flavor
group by i.ingredient_type
order by TOTAL_ORDER asc