with rankt as (select *, percent_rank() over (order by SIZE_OF_COLONY desc) as sizerank
from ECOLI_DATA)
select r.id, 
case when r.sizerank<=0.25 then 'CRITICAL'
    when r.sizerank<=0.5 then 'HIGH'
    when r.sizerank<=0.75 then 'MEDIUM'
    else 'LOW' 
    end as COLONY_NAME
from rankt as r join ECOLI_DATA as e on r.id=e.id
order by r.id asc;

