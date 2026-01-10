select e2.id, e2.GENOTYPE, e1.GENOTYPE as PARENT_GENOTYPE
from ECOLI_DATA as e1 join ECOLI_DATA  as e2 on e1.id=e2.parent_id
where (e2.GENOTYPE&e1.GENOTYPE)=e1.GENOTYPE
order by e2.id