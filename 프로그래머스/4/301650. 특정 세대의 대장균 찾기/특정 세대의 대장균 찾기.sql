-- 코드를 작성해주세요
with par as(select e2.id as id
from ecoli_data as e1 join ecoli_data as e2 on e1.id = e2.parent_id
where e1.parent_id is null
)
select a1.id
from par as p1 join ecoli_data as a1 on p1.id =a1.parent_id
order by id asc