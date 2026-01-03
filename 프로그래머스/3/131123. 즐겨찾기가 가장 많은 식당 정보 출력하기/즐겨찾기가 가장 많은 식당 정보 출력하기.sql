-- 코드를 입력하세요
with maxcount as (SELECT rest_id, food_type, max(favorites) as favorites
from REST_INFO 
group by food_type)
select r.food_type, r.rest_id, r.rest_name, r.favorites
from maxcount as m join rest_info as r on m.food_type=r.food_type 
where r.favorites =m.favorites
order by food_type desc