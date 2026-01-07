-- 코드를 입력하세요
SELECT distinct i.rest_id, i.rest_name, i.food_type, i.favorites, i.address,round(avg(r.review_score),2) as SCORE
from REST_INFO as i join REST_REVIEW  as r on i.rest_id = r.rest_id
where i.ADDRESS like '%서울특별시%' or i.ADDRESS like '%서울시%'
group by r.REST_ID
order by SCORE desc, i.favorites desc