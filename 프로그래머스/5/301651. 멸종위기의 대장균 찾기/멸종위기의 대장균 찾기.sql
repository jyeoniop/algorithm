
with recursive generation as(
select id, parent_id, 1 as gen
from ECOLI_DATA 
where parent_id is null
union all 
select e.id, e.parent_id, g.gen+1
from ECOLI_DATA as e join generation as g on e.parent_id=g.id)
select count(id) as count, gen as generation
from generation
where id not in (select parent_id from generation where parent_id is not null)
group by gen
order by gen