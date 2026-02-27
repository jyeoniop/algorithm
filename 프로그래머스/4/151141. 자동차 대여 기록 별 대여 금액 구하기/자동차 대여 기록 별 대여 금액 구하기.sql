# with getduration as(select h.history_id, h.car_id, datediff(h.end_date, h.start_date)+1 as duration
# ,c.daily_fee
# from CAR_RENTAL_COMPANY_CAR as c join CAR_RENTAL_COMPANY_RENTAL_HISTORY  as h on c.car_id=h.car_id
# where c.car_type = '트럭')
# select history_id, 
# (case when duration >=90 then round(daily_fee *(100-
#                                                 (select discount_rate from CAR_RENTAL_COMPANY_DISCOUNT_PLAN
#                                                  where duration_type like '%90%' and car_type='트럭'))
#                                                 *0.01)*duration 
#  when duration >=30 then round(daily_fee *(100-
#                                                 (select discount_rate from CAR_RENTAL_COMPANY_DISCOUNT_PLAN
#                                                  where duration_type like '%30%' and car_type='트럭'))
#                                                 *0.01)*duration 
#  when duration >=7 then round(daily_fee *(100-
#                                                 (select discount_rate from CAR_RENTAL_COMPANY_DISCOUNT_PLAN
#                                                  where duration_type like '%7%' and car_type='트럭'))
#                                                 *0.01)*duration 
# else round(daily_fee)*duration end) as fee
# from getduration as g
# order by fee desc, history_id desc








with getdays as(select  history_id, car_id, datediff(end_date, start_date)+1 as days
from CAR_RENTAL_COMPANY_RENTAL_HISTORY),

getrate as(select car_type, case when duration_type like '7%' then 7
when duration_type like '30%' then 30
when duration_type like '90%' then 90 else 0 end as duration, 
(100-discount_rate)/100 as rate
from CAR_RENTAL_COMPANY_DISCOUNT_PLAN
where car_type='트럭'),

getratedays as(select history_id, car_id, days,
case when days>=90 then (select rate from getrate where duration= 90)
when days>=30 then (select rate from getrate where duration= 30) 
when days>=7 then (select rate from getrate where duration= 7)
else 1 end as rate
from getdays),

getfee as(select car_type, car_id, daily_fee
from CAR_RENTAL_COMPANY_CAR
where car_type='트럭')

select r.history_id, round(r.days*f.daily_fee*r.rate) as fee
from getratedays as r join getfee as f on r.car_id=f.car_id
order by fee desc, r.history_id desc;



