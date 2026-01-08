with getduration as(select h.history_id, h.car_id, datediff(h.end_date, h.start_date)+1 as duration
,c.daily_fee
from CAR_RENTAL_COMPANY_CAR as c join CAR_RENTAL_COMPANY_RENTAL_HISTORY  as h on c.car_id=h.car_id
where c.car_type = '트럭')
select history_id, 
(case when duration >=90 then round(daily_fee *(100-
                                                (select discount_rate from CAR_RENTAL_COMPANY_DISCOUNT_PLAN
                                                 where duration_type like '%90%' and car_type='트럭'))
                                                *0.01)*duration 
 when duration >=30 then round(daily_fee *(100-
                                                (select discount_rate from CAR_RENTAL_COMPANY_DISCOUNT_PLAN
                                                 where duration_type like '%30%' and car_type='트럭'))
                                                *0.01)*duration 
 when duration >=7 then round(daily_fee *(100-
                                                (select discount_rate from CAR_RENTAL_COMPANY_DISCOUNT_PLAN
                                                 where duration_type like '%7%' and car_type='트럭'))
                                                *0.01)*duration 
else round(daily_fee)*duration end) as fee
from getduration as g
order by fee desc, history_id desc