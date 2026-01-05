-- 코드를 입력하세요
with disable as (SELECT distinct car_id
from CAR_RENTAL_COMPANY_RENTAL_HISTORY 
where date_format(start_date, '%Y-%m-%d')<='2022-10-16' and date_format(end_date, '%Y-%m-%d')>='2022-10-16')
select distinct c.car_id, (case when d.car_id is null then '대여 가능' else '대여중' end) as AVAILABILITY
from CAR_RENTAL_COMPANY_RENTAL_HISTORY as c left join disable as d on c.car_id=d.car_id
order by c.car_id desc