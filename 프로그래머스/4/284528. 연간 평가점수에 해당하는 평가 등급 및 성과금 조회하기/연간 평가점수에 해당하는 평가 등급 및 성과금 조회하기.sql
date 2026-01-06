with getgrade as (select emp_no, avg(score), (case when avg(score)>=96 then 'S' when avg(score)>=90 then 'A' when avg(score)>=80 then 'B' else 'C' end) as grade 
from HR_GRADE 
group by EMP_NO)
select g.emp_no, e.emp_name, g.grade, (case when grade ='S' then e.sal*0.2 when grade='A' then e.sal*0.15 when grade='B' then e.sal*0.1 else 0 end) as bonus
from getgrade as g join HR_EMPLOYEES as e on g.emp_no=e.emp_no
order by g.emp_no asc