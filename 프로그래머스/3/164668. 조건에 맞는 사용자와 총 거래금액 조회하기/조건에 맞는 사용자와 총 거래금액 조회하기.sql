-- 코드를 입력하세요
with user as (SELECT *, sum(price) as tprice
from USED_GOODS_BOARD 
where status='done'
group by writer_id
having sum(price)>=700000)
select distinct i.user_id, i.nickname, u.tprice as total_sales
from user as u join USED_GOODS_USER as i on u.writer_id=i.user_id
order by total_sales asc