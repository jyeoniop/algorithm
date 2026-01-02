-- 코드를 입력하세요
with feecal as (
    SELECT C.car_id, C.car_type, round(C.daily_fee*30*0.01*(100-D.discount_rate)) fee
    from CAR_RENTAL_COMPANY_CAR as C join CAR_RENTAL_COMPANY_DISCOUNT_PLAN  as D
    on C.car_type= D.car_type
    where (C.car_type = 'SUV' or C.car_type = '세단') and D.duration_type = 30 and 
    500000<= C.daily_fee*30*0.01*(100-D.discount_rate) and C.daily_fee*30*0.01*(100-D.discount_rate)<2000000
    )
select car_id, car_type, fee
from feecal
where car_id not in(select car_id
from CAR_RENTAL_COMPANY_RENTAL_HISTORY 
where (date_format(start_date,'%Y-%m-%d')<='2022-11-01' and date_format(end_date,'%Y-%m-%d')>='2022-11-01')
or (date_format(start_date,'%Y-%m-%d')<='2022-11-30' and date_format(end_date,'%Y-%m-%d')>='2022-11-30'))

