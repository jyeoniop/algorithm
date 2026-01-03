
SELECT year(s.sales_date) as year, month(s.sales_date) as month, 
count(distinct s.user_id) as PURCHASED_USERS, 
round(count(distinct s.user_id)/(select count(distinct user_id) from user_info where year(joined)='2021'),1) as PUCHASED_RATIO
from USER_INFO as u join ONLINE_SALE as s on u.user_id=s.user_id
where year(u.joined)=2021
group by date_format(s.sales_date, '%Y-%m')
order by year asc, month asc

