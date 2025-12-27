-- 코드를 입력하세요
SELECT I.animal_id, I.name
from ANIMAL_INS as I join  ANIMAL_OUTS as O on I.animal_id = O.animal_id
order by datediff(O.datetime, I.datetime) desc limit 2