-- 코드를 작성해주세요
select distinct d.id, d.email, d.first_name, d.last_name
from SKILLCODES  as s cross join DEVELOPERS  as d
where d.skill_code&(SELECT CODE FROM SKILLCODES WHERE NAME = 'Python') or 
d.skill_code&(SELECT CODE FROM SKILLCODES WHERE NAME = 'C#') 
order by d.id asc