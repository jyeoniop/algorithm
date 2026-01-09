# with pre as(select car_id, start_date, end_date, count(history_id) as cnt, month(start_date) as mon
# from CAR_RENTAL_COMPANY_RENTAL_HISTORY 
# where date_format(START_DATE, '%Y-%m') in ('2022-08', '2022-09','2022-10')
# group by car_id
# having count(history_id)>=5)
# select mon as MONTH, car_id, cnt as RECORDS
# from pre 
# group by mon, car_id
# order by mon asc, car_id desc


 with pre as(select car_id, start_date, end_date, count(history_id) as cnt, month(start_date) as mon
from CAR_RENTAL_COMPANY_RENTAL_HISTORY 
where date_format(START_DATE, '%Y-%m') in ('2022-08', '2022-09','2022-10')
group by car_id
having count(history_id)>=5),
cnt as (select distinct month(start_date) as month, car_id, count(history_id) as records
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where date_format(START_DATE, '%Y-%m') in ('2022-08', '2022-09','2022-10')
group by month(start_date), car_id)
select c.*
from pre as p join cnt as c on p.car_id=c.car_id
order by c.month asc, c.car_id desc