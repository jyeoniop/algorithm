-- 코드를 입력하세요
WITH RECURSIVE time_table AS (
    SELECT 0 AS h
    UNION ALL
    SELECT h + 1 FROM time_table 
    WHERE h < 23
)
SELECT T.h as hour, count(O.animal_id) as count
from time_table as T left join animal_outs as O on T.h=hour(O.datetime)
group by T.h
order by hour


