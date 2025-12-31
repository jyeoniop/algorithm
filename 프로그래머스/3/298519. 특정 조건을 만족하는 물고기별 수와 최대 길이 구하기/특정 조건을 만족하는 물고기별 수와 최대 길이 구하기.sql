-- 코드를 작성해주세요
select count(id) as FISH_COUNT, max(length) as MAX_LENGTH, FISH_TYPE
from fish_info
group by fish_type
having avg(case when length is null then 10 else length end)>=33
order by FISH_TYPE asc