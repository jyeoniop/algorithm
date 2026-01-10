with per as(select *, PERCENT_RANK() OVER (ORDER BY SIZE_OF_COLONY desc )*100 AS percen
from ECOLI_DATA)
select id as ID, (case when percen<=25 then 'CRITICAL' 
           when percen<=50 then 'HIGH' 
           when percen<=75 then 'MEDIUM' 
           else 'LOW' end) as COLONY_NAME
from per
order by id asc