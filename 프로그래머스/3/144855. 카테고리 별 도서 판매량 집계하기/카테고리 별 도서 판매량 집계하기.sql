-- 코드를 입력하세요
SELECT book.category as category, sum(sales) as total_sales
from book join book_sales as s on book.book_id =s.book_id
where date_format(SALES_DATE, '%Y-%m')='2022-01'
group by book.category
order by category asc