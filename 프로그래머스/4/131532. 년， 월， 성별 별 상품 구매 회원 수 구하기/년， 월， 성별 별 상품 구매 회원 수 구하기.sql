-- 코드를 입력하세요
SELECT year(O.sales_date) as year, month(O.sales_date) as month, U.gender, count(distinct O.user_id) as users
from USER_INFO as U join ONLINE_SALE as O on U.user_id=O.user_id
where U.gender is not null
group by year(O.sales_date), month(O.sales_date), U.gender
order by year,month,gender