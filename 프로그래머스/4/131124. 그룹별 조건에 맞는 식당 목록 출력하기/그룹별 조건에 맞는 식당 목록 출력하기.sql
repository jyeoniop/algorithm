-- 코드를 입력하세요
with maxc as(SELECT r.member_id, m.member_name
from member_profile as m join rest_review as r on m.member_id = r.member_id
group by r.member_id
order by count(r.rest_id) desc limit 1)
select x.member_name, r.review_text, date_format(r.review_date, '%Y-%m-%d') as review_date
from maxc as x join rest_review as r on x.member_id = r.member_id
order by review_date asc, r.review_text asc