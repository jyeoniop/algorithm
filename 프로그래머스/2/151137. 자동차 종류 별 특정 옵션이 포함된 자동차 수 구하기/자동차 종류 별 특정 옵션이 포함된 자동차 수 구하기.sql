-- 코드를 입력하세요
with liket as (SELECT *
from CAR_RENTAL_COMPANY_CAR 
where options like '%통풍시트%' or options like '%열선시트%' or options like '%가죽시트%' )
select c.car_type as car_type, count(c.car_id) as cars
from liket as l join CAR_RENTAL_COMPANY_CAR as c on l.car_id = c.car_id
group by c.car_type
order by car_type asc