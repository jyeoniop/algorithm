select DISTINCT d.id, d.email, d.first_name, d.last_name
from DEVELOPERS as d join SKILLCODES  as s on (d.skill_code&s.code)>0
where s.CATEGORY='Front End'
order by d.id asc