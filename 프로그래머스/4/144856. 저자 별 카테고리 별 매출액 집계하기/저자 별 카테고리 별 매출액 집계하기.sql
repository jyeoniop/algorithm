-- 코드를 입력하세요
with totalsale as(SELECT b.book_id, b.category, b.author_id, b.price, sum(s.sales), b.price*sum(s.sales) as total
from book as b join book_sales as s on b.book_id = s.book_id
where date_format(s.sales_date, '%Y-%m')='2022-01'
group by s.book_id)
select t.author_id, a.author_name, t.category,  sum(t.total) as TOTAL_SALES
from totalsale as t join author as a on t.author_id=a.author_id
group by t.author_id, t.category
order by t.author_id asc, t.category desc