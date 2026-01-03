-- 코드를 입력하세요
SELECT member_id, member_name, gender as GENDER, date_format(date_of_birth, '%Y-%m-%d') as DATE_OF_BIRTH
from MEMBER_PROFILE 
where month(DATE_OF_BIRTH)=03 and tlno is not null and gender='W'
order by member_id asc