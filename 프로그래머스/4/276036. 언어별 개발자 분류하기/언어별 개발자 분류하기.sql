with getg as(select (case 
        when (skill_code&(select code from SKILLCODES  where name ='Python'))>0 and
        (skill_code&(select sum(code) from SKILLCODES  where category='Front End'))>0
        then 'A'
       when skill_code&(select code from skillcodes where name ='C#') then 'B'
       when (skill_code&(select sum(code) from skillcodes where category ='Front End'))>0 then 'C'
       else null end) as grade, id
from  DEVELOPERS )
select g.grade, d.id, d.email
from getg as g join DEVELOPERS  as d on g.id=d.id
where g.grade is not null
order by g.grade asc , d.id asc