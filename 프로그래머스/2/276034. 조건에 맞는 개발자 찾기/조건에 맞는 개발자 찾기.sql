# select distinct d.id, d.email, d.first_name, d.last_name
# from skillcodes as s join developers as d on (s.code&d.skill_code)>0
# where s.name='C#' or s.name='Python'
# order by d.id asc


select distinct d.id, d.email, d.first_name, d.last_name
from developers as d join skillcodes as s on (d.skill_code&s.code)>0
where s.name = 'C#' or s.name='Python'
order by d.id asc;