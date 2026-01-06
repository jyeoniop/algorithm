with maxfrom as(select emp_no, sum(score) as sums
from HR_GRADE 
group by emp_no
order by sums desc limit 1)
select m.sums as score, m.emp_no, e.emp_name, e.position, e.email
from maxfrom as m join HR_EMPLOYEES as e on m.emp_no=e.emp_no
join HR_DEPARTMENT as d on e.dept_id = d.dept_id