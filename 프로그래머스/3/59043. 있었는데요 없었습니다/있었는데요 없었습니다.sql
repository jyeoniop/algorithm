-- 코드를 입력하세요
SELECT i.animal_id, i.name
from ANIMAL_INS as i join ANIMAL_OUTS  as o on i.animal_id = o.animal_id
where i.DATETIME>o.datetime
order by i.datetime asc