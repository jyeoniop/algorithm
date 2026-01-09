select e1.id, count(e2.id) as CHILD_COUNT
from ECOLI_DATA as e1 left join ECOLI_DATA as e2 on e1.id=e2.parent_id
group by e1.id
order by e1.id asc