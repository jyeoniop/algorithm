select count(distinct id) as count
from ECOLI_DATA 
where (genotype&2)=0 and (((genotype&1)>0)or((genotype&4)>0))