with july as (SELECT flavor, sum(total_order)as TOTAL_ORDER
from JULY
group by flavor)
select j.flavor
from july as j join first_half as f on j.flavor=f.flavor
order by j.TOTAL_ORDER+f.TOTAL_ORDER desc limit 3